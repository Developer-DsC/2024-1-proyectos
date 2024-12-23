package Entidades;

/**
 *
 * @author Dalton
 */
public class Sexo {

    private int idSexo;
    private String Nombre;
    private String Descripcion;

    public Sexo() {
    }

    public Sexo(int idSexo, String Nombre, String Descripcion) {
        this.idSexo = idSexo;
        this.Nombre = Nombre;
        this.Descripcion = Descripcion;
    }

    public int getIdSexo() {
        return idSexo;
    }

    public void setIdSexo(int idSexo) {
        this.idSexo = idSexo;
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
        return this.idSexo + " - " + this.Nombre;
    }

    @Override
    public boolean equals(Object obj) {
        return this.idSexo == ((Sexo) obj).idSexo;
    }
}
