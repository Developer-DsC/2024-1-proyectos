package Entidades;

/**
 *
 * @author Dalton
 */
public class Estado {

    private int idEstado;
    private String Nombre;
    private String Descripcion;

    public Estado() {
    }

    public Estado(int idEstado, String Nombre, String Descripcion) {
        this.idEstado = idEstado;
        this.Nombre = Nombre;
        this.Descripcion = Descripcion;
    }

    public int getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(int idEstado) {
        this.idEstado = idEstado;
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
        return this.idEstado + " - " + this.Nombre;
    }

    @Override
    public boolean equals(Object obj) {
        return this.idEstado == ((Estado) obj).idEstado;
    }

}
