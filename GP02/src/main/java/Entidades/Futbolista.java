package Entidades;

/**
 *
 * @author Dalton
 */
public class Futbolista extends SeleccionFutbol {

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }
    private int dorsal;
    private String demarcacion;

    public Futbolista(int id, String nombre, String apellidos, int edad, int dorsal, String demarcacion) {
        super(id, nombre, apellidos, edad);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    public Futbolista() {
        super();
    }

    @Override
    public String entrenar() {
        return "Realiza un entrenamiento (Clase Futbolista) ";
    }

    @Override
    public String jugarPartido() {
        return "Juega un Partido (Clase Futbolista) ";
    }

    public String entrevista() {
        return "Da una Entrevista";
    }
}
