/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Time;
import java.util.Date;

/**
 *
 * @author ADMIN
 */
public class Cita {
    private int idcita;
    private Date fecha;
    private Time hora;
    private String estado;
    private String observaciones;
    private Persona iddoctor;
    private Persona idpaciente;
    private Especialidad idespecialidad;
    private LugarAtencion idlugar;

    public int getIdcita() {
        return idcita;
    }

    public void setIdcita(int idcita) {
        this.idcita = idcita;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Time getHora() {
        return hora;
    }

    public void setHora(Time hora) {
        this.hora = hora;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Persona getIddoctor() {
        return iddoctor;
    }

    public void setIddoctor(Persona iddoctor) {
        this.iddoctor = iddoctor;
    }

    public Persona getIdpaciente() {
        return idpaciente;
    }

    public void setIdpaciente(Persona idpaciente) {
        this.idpaciente = idpaciente;
    }

    public Especialidad getIdespecialidad() {
        return idespecialidad;
    }

    public void setIdespecialidad(Especialidad idespecialidad) {
        this.idespecialidad = idespecialidad;
    }

    public LugarAtencion getIdlugar() {
        return idlugar;
    }

    public void setIdlugar(LugarAtencion idlugar) {
        this.idlugar = idlugar;
    }
    
    
}
