/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author ADMIN
 */
public class Formula {
    private int idformula;
    private String descripcion;
    private Cita idcita;

    public int getIdformula() {
        return idformula;
    }

    public void setIdformula(int idformula) {
        this.idformula = idformula;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Cita getIdcita() {
        return idcita;
    }

    public void setIdcita(Cita idcita) {
        this.idcita = idcita;
    }

    
    
}
