package PolimorfismoInterface;

import javax.swing.JOptionPane;

/**
 *
 * @author Dalton
 */
public class Masajista extends SeleccionFutbol {

    private String titulacion;
    private int AñosExperiencia;

    public Masajista() {
        super();
    }

    public Masajista(String titulacion, int AñosExperiencia) {
        this.titulacion = titulacion;
        this.AñosExperiencia = AñosExperiencia;
    }

    public Masajista(String titulacion, int AñosExperiencia, int id, String nombre, String apellidos, int edad) {
        super(id, nombre, apellidos, edad);
        this.titulacion = titulacion;
        this.AñosExperiencia = AñosExperiencia;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public void settitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public int getAniosExperiencia() {
        return AñosExperiencia;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.AñosExperiencia = aniosExperiencia;
    }

    @Override
    public void jugarPartido() {
        super.jugarPartido(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void entrenar() {
        super.entrenar(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void viajar() {
        super.viajar(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void concentrarse() {
        super.concentrarse(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

   

    public String darMasaje() {
        return "Da un Masaje";
    }

    @Override
    public void imprimir() {
        JOptionPane.showMessageDialog(null, "ID:" + id
                + "\nNombre: " + nombre
                + "\nApellido: " + apellidos
                + "\nEdad: " + edad
                + "\nAños de expriencia: " + AñosExperiencia
                + "\nTitulación: " + titulacion);

    }
}
