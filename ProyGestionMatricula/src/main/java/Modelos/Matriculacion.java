/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

/**
 *
 * @author REY
 */
public class Matriculacion {
    //	Representante, Servicio, Tramites, tipo, fecha
    public String Representante;
    public String Servicio;
    public String Tramite;
    public String Tipo;
    public String Fecha;
    //metodos contructores
    
    //contructor vacio
    public Matriculacion() {
    }
        //contructor con parametros

    public Matriculacion(String Representante, String Servicio,String Tramite, String Tipo, String Fecha) {
        this.Representante = Representante;
        this.Servicio = Servicio;
        this.Tramite = Tramite;
        this.Tipo = Tipo;
        this.Fecha = Fecha;
    }    
}
