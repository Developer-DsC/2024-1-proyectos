/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Usuario
 */
public class Cliente {
    private String CodigoZona;
    private String CodigoSucursal;
    private String NombreCliente;
    private double SaldoCliente;

    public Cliente() {
    }

    public Cliente(String CodigoZona, String CodigoSucursal, String NombreCliente, double SaldoCliente) {
        this.CodigoZona = CodigoZona;
        this.CodigoSucursal = CodigoSucursal;
        this.NombreCliente = NombreCliente;
        this.SaldoCliente = SaldoCliente;
    }

    public String getCodigoZona() {
        return CodigoZona;
    }

    public void setCodigoZona(String CodigoZona) {
        this.CodigoZona = CodigoZona;
    }

    public String getCodigoSucursal() {
        return CodigoSucursal;
    }

    public void setCodigoSucursal(String CodigoSucursal) {
        this.CodigoSucursal = CodigoSucursal;
    }

    public String getNombreCliente() {
        return NombreCliente;
    }

    public void setNombreCliente(String NombreCliente) {
        this.NombreCliente = NombreCliente;
    }

    public double getSaldoCliente() {
        return SaldoCliente;
    }

    public void setSaldoCliente(double SaldoCliente) {
        this.SaldoCliente = SaldoCliente;
    }
    
    
}
