package Entidades;

/**
 *
 * @author Joffre Cartuche C
 */
public class Universidad {

    public Universidad(int IdUniversidad, String Nombre, int Cantidad) {
        this.IdUniversidad = IdUniversidad;
        this.Nombre = Nombre;
        this.Cantidad = Cantidad;
    }
    private int IdUniversidad;
    private String Nombre;
    private int Cantidad;
    public Universidad() {
    }
    
    public int getIdUniversidad() {
        return IdUniversidad;
    }

    public void setIdUniversidad(int IdUniversidad) {
        this.IdUniversidad = IdUniversidad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }
     public String toString()
    {
        return  this.Nombre;
    }
}
