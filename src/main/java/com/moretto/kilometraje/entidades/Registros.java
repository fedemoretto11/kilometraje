package com.moretto.kilometraje.entidades;

import java.io.Serializable;
import java.util.Calendar;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.eclipse.persistence.annotations.UuidGenerator;

@Entity
@UuidGenerator(name = "uuid")
public class Registros implements Serializable {

    @Id
    @GeneratedValue(generator = "uuid")
    private String id;
    @Temporal(TemporalType.DATE)
    private Calendar fechaRegistro;
    @OneToOne
    private Vehiculo vehiculo;
    @OneToOne
    private Empleado chofer;
    @OneToOne
    private Empleado ayudante;
    private Double kmFinalesVehiculo;
    private Double kmRecorridos;

    public Registros() {
    }

    public Registros(String id, Calendar fechaRegistro, Vehiculo vehiculo, Empleado chofer, Empleado ayudante, Double kmFinalesVehiculo, Double kmRecorridos) {
        this.id = id;
        this.fechaRegistro = fechaRegistro;
        this.vehiculo = vehiculo;
        this.chofer = chofer;
        this.ayudante = ayudante;
        this.kmFinalesVehiculo = kmFinalesVehiculo;
        this.kmRecorridos = kmRecorridos;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Calendar getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Calendar fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Empleado getChofer() {
        return chofer;
    }

    public void setChofer(Empleado chofer) {
        this.chofer = chofer;
    }

    public Empleado getAyudante() {
        return ayudante;
    }

    public void setAyudante(Empleado ayudante) {
        this.ayudante = ayudante;
    }

    public Double getKmFinalesVehiculo() {
        return kmFinalesVehiculo;
    }

    public void setKmFinalesVehiculo(Double kmFinalesVehiculo) {
        this.kmFinalesVehiculo = kmFinalesVehiculo;
    }

    public Double getKmRecorridos() {
        return kmRecorridos;
    }

    public void setKmRecorridos(Double kmRecorridos) {
        this.kmRecorridos = kmRecorridos;
    }
    
    
}
