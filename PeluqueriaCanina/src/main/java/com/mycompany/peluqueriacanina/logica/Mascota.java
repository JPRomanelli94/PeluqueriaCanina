package com.mycompany.peluqueriacanina.logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;


@Entity
public class Mascota implements Serializable {
    
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private int numCliente;
    private String nombre;
    private String raza;
    private String color;
    private String alergico;
    private String atencion_especial;
    private String observaciones;
    @OneToOne
    private Duenio unDuenio;

    public void setUnDuenio(Duenio unDuenio) {
        this.unDuenio = unDuenio;
    }

    public Duenio getUnDuenio() {
        return unDuenio;
    }

    public Mascota() {
    }

    public Mascota(int numCliente, String nombre, String raza, String color, String alergico, String atencion_especial, String observaciones, Duenio unDuenio) {
        this.numCliente = numCliente;
        this.nombre = nombre;
        this.raza = raza;
        this.color = color;
        this.alergico = alergico;
        this.atencion_especial = atencion_especial;
        this.observaciones = observaciones;
        this.unDuenio = unDuenio;
    }

    public int getNumCliente() {
        return numCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRaza() {
        return raza;
    }

    public String getColor() {
        return color;
    }

    public String getAlergico() {
        return alergico;
    }

    public String getAtencion_especial() {
        return atencion_especial;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setNumCliente(int numCliente) {
        this.numCliente = numCliente;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setAlergico(String alergico) {
        this.alergico = alergico;
    }

    public void setAtencion_especial(String atencion_especial) {
        this.atencion_especial = atencion_especial;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
    
    
    
    
}
