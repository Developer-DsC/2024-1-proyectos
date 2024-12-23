package Entidades;

/**
 *
 * @author Dalton
 */

// Clase Auto con composición de Motor
public class Auto {
    private String marca;
    private String modelo;
    private Motor motor;

    // Constructor
    public Auto(String marca, String modelo, int numeroCilindros, String tipoCombustible) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = new Motor(numeroCilindros, tipoCombustible);
    }
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }
}
