package Entidades;

/**
 *
 * @author Dalton
 */
public class Camiones {
    private int idCamion;
    private double pesos;
    private String camion;
    private int ecomienda;

    public Camiones() {
    }

    public Camiones(int idCamion, double pesos, String camion, int ecomienda) {
        this.idCamion = idCamion;
        this.pesos = pesos;
        this.camion = camion;
        this.ecomienda = ecomienda;
    }

    public int getIdCamion() {
        return idCamion;
    }

    public void setIdCamion(int idCamion) {
        this.idCamion = idCamion;
    }

    public double getPesos() {
        return pesos;
    }

    public void setPesos(double pesos) {
        this.pesos = pesos;
    }

    public String getCamion() {
        return camion;
    }

    public void setCamion(String camion) {
        this.camion = camion;
    }

    public double getEcomienda() {
        return ecomienda;
    }

    public void setEcomienda(int ecomienda) {
        this.ecomienda = ecomienda;
    }
}
