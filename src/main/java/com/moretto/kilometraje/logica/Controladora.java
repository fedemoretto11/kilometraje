package com.moretto.kilometraje.logica;

import com.moretto.kilometraje.entidades.Empleado;
import com.moretto.kilometraje.entidades.Registros;
import com.moretto.kilometraje.entidades.Vehiculo;
import com.moretto.kilometraje.persistencia.ControladoraPersistencia;
import java.util.Calendar;
import java.util.List;

public class Controladora {
    
    ControladoraPersistencia controladoraPersis = new ControladoraPersistencia();

    public void guardarVehiculo(String patente, String marca, String modelo, Double km) {
        try {
            if(patente == null || patente.trim().isEmpty()) {
                throw new Exception();
            }
            if(marca == null || marca.trim().isEmpty()) {
                throw new Exception();
            }
            if(modelo == null || modelo.trim().isEmpty()) {
                throw new Exception();
            }
            if(km == null) {
                throw new Exception();
            }
            Vehiculo vehiculo = new Vehiculo();
            vehiculo.setPatente(patente);
            vehiculo.setMarca(marca);
            vehiculo.setModelo(modelo);
            vehiculo.setKilometrosVehiculo(km);
            
            controladoraPersis.guardarVehiculo(vehiculo);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void guardarEmpleado(Integer dni, String nombre, String apellido) {
        try {
            if(dni == null) {
                throw new Exception();
            }
            if(nombre == null || nombre.trim().isEmpty()) {
                throw new Exception();
            }
            if(apellido == null || apellido.trim().isEmpty()) {
                throw new Exception();
            }
            
            Empleado empleado = new Empleado();
            empleado.setDni(dni);
            empleado.setNombre(nombre);
            empleado.setApellido(apellido);
            
            controladoraPersis.guardarEmpleado(empleado);
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void guardarRegistro(Calendar fechaRegistro, Vehiculo vehiculo, Empleado chofer, Empleado acompaniante, Double kmFinales, Double kmRegistro) {
        try {
            if (fechaRegistro == null) {
                throw new Exception();
            }
            if (vehiculo == null) {
                throw new Exception();
            }
            if (chofer == null) {
                throw new Exception();
            }
            if(kmFinales == null) {
                throw new Exception();
            }
            if(kmRegistro == null) {
                throw new Exception();
            }
            Registros registro = new Registros();
            registro.setFechaRegistro(fechaRegistro);
            registro.setVehiculo(vehiculo);
            registro.setChofer(chofer);
            registro.setAyudante(acompaniante);
            registro.setKmFinalesVehiculo(kmFinales);
            registro.setKmRecorridos(kmRegistro);
            
            controladoraPersis.guardarRegistro(registro);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public List<Empleado> buscarListaEmpleados() {
        
        return controladoraPersis.buscarListaEmpleados();
        
    }

    public List<Vehiculo> buscarListaVehiculos() {
        return controladoraPersis.buscarListaVehiculos();
    }

    public List<Registros> buscarListaRegistros() {
        return controladoraPersis.buscarListaRegistros();
    }
    
    public Vehiculo buscarVehiculo(String patente) {
        return controladoraPersis.buscarVehiculo(patente);
    }

    public Empleado buscarEmpleado(Integer dniChofer) {
        return controladoraPersis.buscarEmpleado(dniChofer);
    }

    public void actualizarKmVehiculo(Vehiculo vehiculo, Double kmFinales) {
        vehiculo.setKilometrosVehiculo(kmFinales);
        controladoraPersis.actualizarKmVehiculo(vehiculo);
    }

    public void eliminarVehiculo(String patente) {
        controladoraPersis.eliminarVehiculo(patente);
    }

    public void eliminarEmpleado(Integer dni) {
        controladoraPersis.eliminarEmpleado(dni);
    }

    public void editarEmpleado(Integer dni, String nombre, String apellido) {
        
        try {
            if(dni == null) {
                throw new Exception();
            }
            if(nombre == null || nombre.trim().isEmpty()) {
                throw new Exception();
            }
            if(apellido == null || apellido.trim().isEmpty()) {
                throw new Exception();
            }
            Empleado empleado = new Empleado();
            empleado.setDni(dni);
            empleado.setNombre(nombre);
            empleado.setApellido(apellido);
            
            controladoraPersis.editarEmpleado(empleado);
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }

    public void editarVehiculo(String patente, String marca, String modelo, Double km) {
        try {
            if(patente == null || patente.trim().isEmpty()) {
                throw new Exception();
            }
            if(marca == null || marca.trim().isEmpty()) {
                throw new Exception();
            }
            if(modelo == null || modelo.trim().isEmpty()) {
                throw new Exception();
            }
            if(km == null) {
                throw new Exception();
            }
            Vehiculo vehiculo = new Vehiculo();
            vehiculo.setPatente(patente);
            vehiculo.setMarca(marca);
            vehiculo.setModelo(modelo);
            vehiculo.setKilometrosVehiculo(km);
            
            controladoraPersis.editarVehiculo(vehiculo);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public List<Registros> buscarListaRegistrosFiltrada(Empleado empleado, Integer anio, Integer mes) {
        return controladoraPersis.buscarListaRegistrosFiltrada(empleado, anio, mes);
    }

    public List<Registros> buscarListaRegistrosVehiculosFiltrada(Vehiculo vehiculo, Integer anio, Integer mes) {
        return controladoraPersis.buscarListaRegistrosVehiculosFiltrada(vehiculo, anio, mes);
    }

    

    
    
}
