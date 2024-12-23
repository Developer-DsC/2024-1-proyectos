package Entidades;

/**
 *
 * @author Dalton
 */

public class Camiones extends vehiculos{
    private String tipo;
    private String carga;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCarga() {
        return carga;
    }

    public void setCarga(String carga) {
        this.carga = carga;
    }

    
    public Camiones() {
    }

    public Camiones(String tipo, String carga, String marca, String color, String modelo, String kilometraje, String placa) {
        super(marca, color, modelo, kilometraje, placa);
        this.tipo = tipo;
        this.carga = carga;
    }
    
    
}
