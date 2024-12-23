package Entidades;

/**
 *
 * @author Dalton
 */
public class Empleado {
    int codigo;
    String nombre;
    String apellido;
    String sexo;
    int dia;
    int cant_horas;
    int cant_pienzas_def;
    double jornal;

    public Empleado() {
    }

    public Empleado(int codigo, String nombre, String apellido, String sexo, int dia, int cant_horas, int cant_pienzas_def, double jornal) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.dia = dia;
        this.cant_horas = cant_horas;
        this.cant_pienzas_def = cant_pienzas_def;
        this.jornal = jornal;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getCant_horas() {
        return cant_horas;
    }

    public void setCant_horas(int cant_horas) {
        this.cant_horas = cant_horas;
    }

    public int getCant_pienzas_def() {
        return cant_pienzas_def;
    }

    public void setCant_pienzas_def(int cant_pienzas_def) {
        this.cant_pienzas_def = cant_pienzas_def;
    }

    public double getJornal() {
        return jornal;
    }

    public void setJornal(double jornal) {
        this.jornal = jornal;
    }
}