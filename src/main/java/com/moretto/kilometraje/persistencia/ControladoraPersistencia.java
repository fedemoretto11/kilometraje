package com.moretto.kilometraje.persistencia;

import com.moretto.kilometraje.entidades.Empleado;
import com.moretto.kilometraje.entidades.Registros;
import com.moretto.kilometraje.entidades.Vehiculo;
import java.util.List;


public class ControladoraPersistencia {
    
    EmpleadoJpaController empleadoJpa = new EmpleadoJpaController();
    RegistrosJpaController registrosJpa = new RegistrosJpaController();
    VehiculoJpaController vehiculoJpa = new VehiculoJpaController();

    public void guardarVehiculo(Vehiculo vehiculo) {
        
        try {
            vehiculoJpa.create(vehiculo); 
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }

    public void guardarEmpleado(Empleado empleado) {
        
        try {
            empleadoJpa.create(empleado);
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }

    public void guardarRegistro(Registros registro) {
        
        try {
            registrosJpa.create(registro);
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }
    
    public List<Empleado> buscarListaEmpleados() {
        return empleadoJpa.findEmpleadoEntities();
    }

    public List<Vehiculo> buscarListaVehiculos() {
        return vehiculoJpa.findVehiculoEntities();
    }

    public List<Registros> buscarListaRegistros() {
        return registrosJpa.findRegistrosEntities();
    }
    
    public Vehiculo buscarVehiculo(String patente) {
        return vehiculoJpa.findVehiculo(patente);
    }

    public Empleado buscarEmpleado(Integer dniChofer) {
        return empleadoJpa.findEmpleado(dniChofer);
    }

    public void actualizarKmVehiculo(Vehiculo vehiculo) {
        
        try {
            vehiculoJpa.edit(vehiculo);
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }

    public void eliminarVehiculo(String patente) {
        
        try {
            vehiculoJpa.destroy(patente);
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }

    public void eliminarEmpleado(Integer dni) {
        
        try {
            empleadoJpa.destroy(dni);
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }

    public void editarEmpleado(Empleado empleado) {
        
        try {
            empleadoJpa.edit(empleado);
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }

    public void editarVehiculo(Vehiculo vehiculo) {
        
        try {
            vehiculoJpa.edit(vehiculo);
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }

    public List<Registros> buscarListaRegistrosFiltrada(Empleado empleado, Integer anio, Integer mes) {
        return registrosJpa.buscarListaRegistrosFiltrada(empleado, anio, mes);
    }

    public List<Registros> buscarListaRegistrosVehiculosFiltrada(Vehiculo vehiculo, Integer anio, Integer mes) {
        return registrosJpa.buscarListaRegistrosVehiculosFiltrada(vehiculo, anio, mes);
    }

    

    
    
        
}
