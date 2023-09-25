package com.moretto.kilometraje.entidades;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;


        
@Entity
public class Vehiculo implements Serializable {
    
    @Id
    private String patente;
    private String marca;
    private String modelo;
    private Double kilometrosVehiculo;

    
    public Vehiculo() {
    }

    public Vehiculo(String patente, String marca, String modelo, Double kilometrosVehiculo) {
        this.patente = patente;
        this.marca = marca;
        this.modelo = modelo;
        this.kilometrosVehiculo = kilometrosVehiculo;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Double getKilometrosVehiculo() {
        return kilometrosVehiculo;
    }

    public void setKilometrosVehiculo(Double kilometrosVehiculo) {
        this.kilometrosVehiculo = kilometrosVehiculo;
    }

    
}
