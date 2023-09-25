package com.moretto.kilometraje.persistencia;

import com.moretto.kilometraje.entidades.Empleado;
import com.moretto.kilometraje.entidades.Registros;
import com.moretto.kilometraje.entidades.Vehiculo;
import com.moretto.kilometraje.persistencia.exceptions.NonexistentEntityException;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

public class RegistrosJpaController implements Serializable {

    public RegistrosJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public RegistrosJpaController() {
        this.emf = Persistence.createEntityManagerFactory("KilometrajePU");
    }
    
    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Registros registros) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(registros);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Registros registros) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            registros = em.merge(registros);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                String id = registros.getId();
                if (findRegistros(id) == null) {
                    throw new NonexistentEntityException("The registros with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(String id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Registros registros;
            try {
                registros = em.getReference(Registros.class, id);
                registros.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The registros with id " + id + " no longer exists.", enfe);
            }
            em.remove(registros);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Registros> findRegistrosEntities() {
        return findRegistrosEntities(true, -1, -1);
    }

    public List<Registros> findRegistrosEntities(int maxResults, int firstResult) {
        return findRegistrosEntities(false, maxResults, firstResult);
    }

    private List<Registros> findRegistrosEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Registros.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Registros findRegistros(String id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Registros.class, id);
        } finally {
            em.close();
        }
    }

    public int getRegistrosCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Registros> rt = cq.from(Registros.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }

    List<Registros> buscarListaRegistrosFiltrada(Empleado empleado, Integer anio, Integer mes) {
         
        EntityManager em = getEntityManager();
        try {
            
            String query = "SELECT r FROM Registros r WHERE (r.chofer = :empleado OR r.ayudante = :empleado) "
                    + "AND EXTRACT(MONTH FROM r.fechaRegistro) = :mes "
                    + "AND EXTRACT(YEAR FROM r.fechaRegistro) = :anio "
                    + "ORDER BY r.fechaRegistro";
            
            
            Query q = em.createQuery(query);
            q.setParameter("empleado", empleado);
            q.setParameter("anio", anio);
            q.setParameter("mes", mes);
            
            return q.getResultList();
        } finally {
            em.close();
        }
    
    }

    List<Registros> buscarListaRegistrosVehiculosFiltrada(Vehiculo vehiculo, Integer anio, Integer mes) {
        EntityManager em = getEntityManager();
        try {
            
            String query = "SELECT r FROM Registros r WHERE r.vehiculo = :vehiculo "
                    + "AND EXTRACT(MONTH FROM r.fechaRegistro) = :mes "
                    + "AND EXTRACT(YEAR FROM r.fechaRegistro) = :anio "
                    + "ORDER BY r.fechaRegistro";
            
            
            Query q = em.createQuery(query);
            q.setParameter("vehiculo", vehiculo);
            q.setParameter("anio", anio);
            q.setParameter("mes", mes);
            
            return q.getResultList();
        } finally {
            em.close();
        }
    }
    
}
