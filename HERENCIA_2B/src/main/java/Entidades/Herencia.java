package Entidades;

/**
 *
 * @author Dalton
 */

public class Herencia {
    private String cedula;
    private String nombres;
    private char sexo;
    private int edad;

    public Herencia() {
    }

    public Herencia(String cedula, String nombres,char sexo, int edad) {
        this.cedula = cedula;
        this.nombres = nombres;
        this.sexo=sexo;
        this.edad=edad;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public String imprimir_persona(){
        
        return "Cedula: " +this.cedula + "\nNombres: "+ this.nombres+ 
               "\nSexo: "+this.sexo+"\nEdad: "+this.edad;
    }
}

