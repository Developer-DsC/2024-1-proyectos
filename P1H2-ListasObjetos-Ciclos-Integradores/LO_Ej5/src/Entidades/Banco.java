package Entidades;

/**
 *
 * @author Dalton
 */
public class Banco {

    private int id;
    private String Nombre;
    private String Sucursal;
    private int NumSucursal;
    private String transaccion;
    private double monto;

    public Banco() {
    }

    public Banco(int id, String Nombre, String Sucursal, int NumSucursal, String transaccion, double monto) {
        this.id = id;
        this.Nombre = Nombre;
        this.Sucursal = Sucursal;
        this.NumSucursal = NumSucursal;
        this.transaccion = transaccion;
        this.monto = monto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getSucursal() {
        return Sucursal;
    }

    public void setSucursal(String Sucursal) {
        this.Sucursal = Sucursal;
    }

    public int getNumSucursal() {
        return NumSucursal;
    }

    public void setNumSucursal(int NumSucursal) {
        this.NumSucursal = NumSucursal;
    }

    public String getTransaccion() {
        return transaccion;
    }

    public void setTransaccion(String transaccion) {
        this.transaccion = transaccion;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }
    
}
