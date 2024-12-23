package PolimorfismoInterface;

import javax.swing.JOptionPane;

/**
 *
 * @author Dalton
 */

public abstract class SeleccionFutbol implements IntegranteSeleccionFutbol {

    protected int id;
    protected String nombre;
    protected String apellidos;
    protected int edad;

    public SeleccionFutbol() {
    }

    public SeleccionFutbol(int ide, String nom, String ape, int eda) {
        this.id = ide;
        this.nombre = nom;
        this.apellidos = ape;
        this.edad = eda;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

   @Override
    public void concentrarse() {
        JOptionPane.showMessageDialog(null,"Concentrarse(Clase Padre)");
    }

    @Override
    public void viajar() {
        JOptionPane.showMessageDialog(null,"Viajar(Clase Padre)");
            }

    @Override
    public void entrenar() {
        JOptionPane.showMessageDialog(null,"Entrenar(Clase Padre)");
    }

    @Override
    public void jugarPartido() {
        JOptionPane.showMessageDialog(null,"Asiste al Partido de Futbol(Clase Padre)");
    }

}
