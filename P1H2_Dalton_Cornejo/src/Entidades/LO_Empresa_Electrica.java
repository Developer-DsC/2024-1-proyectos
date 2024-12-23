package Entidades;

/**
 *
 * @author Dalton
 */
public class LO_Empresa_Electrica {

    private String NumeroUsu;
    private String NumeroZon;
    private String Tipo;
    private double Costo;
    private double Consumo;

    public LO_Empresa_Electrica() {
    }

    public LO_Empresa_Electrica(String NumeroUsu, String NumeroZon, String Tipo, double Costo, double Consumo) {
        this.NumeroUsu = NumeroUsu;
        this.NumeroZon = NumeroZon;
        this.Tipo = Tipo;
        this.Costo = Costo;
        this.Consumo = Consumo;
    }

    public String getNumeroUsu() {
        return NumeroUsu;
    }

    public void setNumeroUsu(String NumeroUsu) {
        this.NumeroUsu = NumeroUsu;
    }

    public String getNumeroZon() {
        return NumeroZon;
    }

    public void setNumeroZon(String NumeroZon) {
        this.NumeroZon = NumeroZon;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public double getCosto() {
        return Costo;
    }

    public void setCosto(double Costo) {
        this.Costo = Costo;
    }

    public double getConsumo() {
        return Consumo;
    }

    public void setConsumo(double Consumo) {
        this.Consumo = Consumo;
    }

    public double Calcular() {
        return Costo * Consumo;
    }
}
