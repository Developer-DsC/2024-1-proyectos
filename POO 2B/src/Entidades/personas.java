package Entidades;

/**
 *
 * @author Dalton
 */
public class personas {

    //Atributos - Caracteristicas//
    public String cedula;
    public String nombre;
    public String edad;
    public String altura;
    public double peso;
    public String sexo;
    public String estado;
    public String telefono;

    //metodos - acciones//
    public personas() {
    }

    public personas(String cedula, String nombre, String edad, String sexo, String estado, String telefono) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.estado = estado;
        this.telefono = telefono;
    }


    public String imprimirt() {
        return ("Cedula: " + this.cedula + "\n"
                + "Nombre: " + this.nombre + "\n"
                + "Edad: " + this.edad + "\n"
                + "Sexo: " + this.sexo + "\n"
                + "Estado: " + this.estado + "\n"
                + "Telefono: " + this.telefono);
    }
}
