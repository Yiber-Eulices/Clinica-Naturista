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
public class FormulaProducto {
    private int idformproducto,cantidad;
    private double precioUnitario,iva;
    private String dosis;
    private Formula idformula;
    private Medicamento idProducto;

    public int getIdformproducto() {
        return idformproducto;
    }

    public void setIdformproducto(int idformproducto) {
        this.idformproducto = idformproducto;
    }

    public String getDosis() {
        return dosis;
    }

    public void setDosis(String dosis) {
        this.dosis = dosis;
    }

    public Formula getIdformula() {
        return idformula;
    }

    public void setIdformula(Formula idformula) {
        this.idformula = idformula;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public void setIva(int iva) {
        this.iva = iva;
    }

    public Medicamento getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Medicamento idProducto) {
        this.idProducto = idProducto;
    }    
}
