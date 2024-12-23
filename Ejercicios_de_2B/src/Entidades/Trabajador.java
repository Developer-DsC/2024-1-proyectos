package Entidades;

/**
 *
 * @author Dalton
 */
public abstract class Trabajador {

    private String cedula;
    private String nombres;
    private String Sexo;
    private String Estado;

    public Trabajador(String cedula, String nombres, String Sexo, String Estado) {
        this.cedula = cedula;
        this.nombres = nombres;
        this.Sexo = Sexo;
        this.Estado = Estado;
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

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }
    
    
    

    public String ImprimirTrabajador() {
        return "\nCedula: "+this.cedula+
               "\nNombres: "+this.cedula+
               "\nSexo: "+this.Sexo+
               "\nEstado: "+this.Estado;
    }

    public abstract double CalcularSueldo();

    public abstract void imprimir();
}
