package Entidades;

/**
 *
 * @author Dalton
 */
public class Clase {

    private int idClase;
    private String Nombre;
    private String Descripcion;

    public Clase() {
    }

    public Clase(int idClase, String Nombre, String Descripcion) {
        this.idClase = idClase;
        this.Nombre = Nombre;
        this.Descripcion = Descripcion;
    }

    public int getIdClase() {
        return idClase;
    }

    public void setIdClase(int idClase) {
        this.idClase = idClase;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    @Override
    public String toString() {
        return this.idClase + " - " + this.Nombre;
    }

    @Override
    public boolean equals(Object obj) {
        return this.idClase == ((Clase) obj).idClase;
    }
}
