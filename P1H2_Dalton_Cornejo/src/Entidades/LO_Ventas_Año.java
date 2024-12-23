package Entidades;

/**
 *
 * @author Dalton
 */
public class LO_Ventas_Año {
    private int Id;
    private int dia;
    private int mes;
    private int año;
    private int cantFact;
    private double importe;

    public LO_Ventas_Año() {
    }

    public LO_Ventas_Año(int Id, int dia, int mes, int año, int cantFact, double importe) {
        this.Id = Id;
        this.dia = dia;
        this.mes = mes;
        this.año = año;
        this.cantFact = cantFact;
        this.importe = importe;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getCantFact() {
        return cantFact;
    }

    public void setCantFact(int cantFact) {
        this.cantFact = cantFact;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }
    
}
