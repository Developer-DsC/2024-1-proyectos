package PolimorfismoInterface;

/**
 *
 * @author Dalton
 */
public class Masajista extends SeleccionFutbol {

    private String titulacion;
    private int AñosExperiencia;

    public Masajista() {
        super();
    }

    public Masajista(int id, String nombre, String apellidos, int edad, String titulacion, int aniosExperiencia) {
        super(id, nombre, apellidos, edad);
        this.titulacion = titulacion;
        this.AñosExperiencia = aniosExperiencia;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public void settitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public int getAniosExperiencia() {
        return AñosExperiencia;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.AñosExperiencia = aniosExperiencia;
    }

    @Override
    public String entrenar() {
        return "Da asistencia en el entrenamiento (Clase Masajista) ";
    }

    public String darMasaje() {
        return "Da un Masaje";
    }
}
