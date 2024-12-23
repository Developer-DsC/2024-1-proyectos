package Entidades;

/**
 *
 * @author Dalton
 */
public class LO_Ingreso_Universidad {
    private int id;
    private String Universidad;
    private int  CodUniversidad;
    private String Nombre;
    private  int Legajo;
    private int puntaje;
    //cant esudiantes por universidad

    public LO_Ingreso_Universidad() {
    }

    public LO_Ingreso_Universidad(int id, String Universidad, int CodUniversidad, String Nombre, int Legajo, int puntaje) {
        this.id = id;
        this.Universidad = Universidad;
        this.CodUniversidad = CodUniversidad;
        this.Nombre = Nombre;
        this.Legajo = Legajo;
        this.puntaje = puntaje;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUniversidad() {
        return Universidad;
    }

    public void setUniversidad(String Universidad) {
        this.Universidad = Universidad;
    }

    public int getCodUniversidad() {
        return CodUniversidad;
    }

    public void setCodUniversidad(int CodUniversidad) {
        this.CodUniversidad = CodUniversidad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getLegajo() {
        return Legajo;
    }

    public void setLegajo(int Legajo) {
        this.Legajo = Legajo;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

   
    
}
