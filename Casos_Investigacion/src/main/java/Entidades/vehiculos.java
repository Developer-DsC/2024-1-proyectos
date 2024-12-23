package Entidades;

/**
 *
 * @author Dalton
 */
public class vehiculos {
    private String marca;
    private String color;
    private String modelo;
    private String kilometraje;
    private String placa;

    public vehiculos() {
    }

    public vehiculos(String marca, String color, String modelo, String kilometraje, String placa) {
        this.marca = marca;
        this.color = color;
        this.modelo = modelo;
        this.kilometraje = kilometraje;
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(String kilometraje) {
        this.kilometraje = kilometraje;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
    
    
    
}
