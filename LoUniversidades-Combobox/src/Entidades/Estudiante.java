package Entidades;

/**
 *
 * @author Joffre Cartuche C
 */
public class Estudiante {
    private int Codigo;
    private int IdUniversidad;
    private double Puntaje;
    public Estudiante() {
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public int getIdUniversidad() {
        return IdUniversidad;
    }

    public void setIdUniversidad(int IdUniversidad) {
        this.IdUniversidad = IdUniversidad;
    }

    public double getPuntaje() {
        return Puntaje;
    }

    public void setPuntaje(double Puntaje) {
        this.Puntaje = Puntaje;
    }
    
}
