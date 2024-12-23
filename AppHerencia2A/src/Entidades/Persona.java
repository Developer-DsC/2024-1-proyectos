/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Joffre Cartuche C
 */
public class Persona {
    protected String Cedula;
    private String Nombre;
    private String Apellido;
    private char Sexo;
    private Date FechaNaci;
    private String Estado;
    public Persona()
    {
        
    }
    public Persona(String ced,String nom,String ape,char sex,Date fn,String est)
    {
        this.Cedula= ced;
        this.Nombre= nom;
        this.Apellido=ape;
        this.Sexo=sex;
        this.FechaNaci = fn;
        this.Estado = est;
    }
    // Metodos set
    public void setCedula(String ced)
    {
        this.Cedula = ced;
    }
    public void setNombre(String nom)
    {
        this.Cedula = nom;
    }
    public void setApellido(String ape)
    {
        this.Apellido = ape;
    }
    public void setSexo(char sex)
    {
        this.Sexo = sex;
    }
    public void setFechaNaci(Date fec)
    {
        this.FechaNaci= fec;
    }
    public void setEstado(String est)
    {
        this.Estado = est;
    }
    // Metodos get
    public String getCedula()
    {
        return this.Cedula;
    }
    public String getNombre()
    {
        return this.Nombre;
    }
    public String getApellido()
    {
        return this.Apellido;
    }
    public char getSexo()
    {
        return this.Sexo;
    }
    public Date getFechaNaci()
    {
        return this.FechaNaci;
    }
    public String getEstado()
    {
        return this.Estado;
    }
    public int Edad()
    { 
        return 0;
    }
    public void Imprimir()
    {
        JOptionPane.showMessageDialog(null,"Cedula :" + this.Cedula +"\n" + 
                                           "Nombres :" + this.Nombre + " " + 
                                           this.Apellido +"\n" +
                                            "Sexo :" + this.Sexo +"\n" +
                                           "Estado :" + this.Estado +"\n" +
                                           "Fecha :" + this.FechaNaci +"\n" + 
                                           "Edad :" + Edad() );
    }
   public String ImprimirPersona()
    {
       return     "Cedula :" + this.Cedula +"\n" + 
                  "Nombres :" + this.Nombre + " " + 
                  this.Apellido +"\n" +
                  "Sexo :" + this.Sexo +"\n" +
                  "Estado :" + this.Estado +"\n" +
                  "Fecha :" + this.FechaNaci +"\n" + 
                  "Edad :" + Edad() ;
    }
}
