package PolimorfismoInterface;

/**
 *
 * @author Dalton
 */
public class Entrenador extends SeleccionFutbol {

    private int idFed;

    public Entrenador() {
        super();
    }

    public Entrenador(int id, String nombre, String apellidos, int edad, int idFederacion) {
        super(id, nombre, apellidos, edad);
        this.setIdFederacion(idFederacion);
    }

    public int getIdFederacion() {
        return idFed;
    }

    public void setIdFederacion(int idFederacion) {
        this.idFed = idFederacion;
    }

    @Override
    public String entrenar() {
        return "Dirige un entrenamiento(Clas Entrenador) ";
    }

    @Override
    public String jugarPartido() {
        return "Dirige un Partido (Clas Entrenador) ";
    }

    public String planificarEntrenamiento() {
        return "Planificar un Entrenamiento";
    }
}
