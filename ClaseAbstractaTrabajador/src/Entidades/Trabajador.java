package Entidades;

/**
 * @author Dalton
 */

public abstract class Trabajador {
    private String Cedula;
    private String Nombres;
    private String Apellidos;
    private char sexo;
    private String tipo;
    private String Estado;

    public Trabajador() {
    }

    public Trabajador(String Cedula, String Nombres, String Apellidos, char sexo, String tipo, String Estado) {
        this.Cedula = Cedula;
        this.Nombres = Nombres;
        this.Apellidos = Apellidos;
        this.sexo = sexo;
        this.tipo = tipo;
        this.Estado = Estado;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
 

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }
    
    //Metodos abstractos
    public abstract void Imprimir();
    public abstract double Calcular();
    //Metodos propios
    
    public String ImprimirTabajador(){
        return "Cedula :" + this.Cedula +" \n" + 
                "Nombres: " + this.Nombres + " " + this.Apellidos + " \n" + 
                "Sexo :" + this.sexo + "\n" + 
                "Estado : " + this.Estado+
                "\nTipo: "+tipo;
                
    }
    
    
    
    
    
    
    
}
