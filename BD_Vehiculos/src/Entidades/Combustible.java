package Entidades;

/**
 *
 * @author Dalton
 */
public class Combustible {

    private int idCombustible;
    private String Nombre;
    private String Descripcion;

    public Combustible() {
    }

    public Combustible(int idCombustible, String Nombre, String Descripcion) {
        this.idCombustible = idCombustible;
        this.Nombre = Nombre;
        this.Descripcion = Descripcion;
    }

    public int getIdCombustible() {
        return idCombustible;
    }

    public void setIdCombustible(int idCombustible) {
        this.idCombustible = idCombustible;
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
        return this.idCombustible + " - " + this.Nombre;
    }

    @Override
    public boolean equals(Object obj) {
        return this.idCombustible == ((Combustible) obj).idCombustible;
    }
}
