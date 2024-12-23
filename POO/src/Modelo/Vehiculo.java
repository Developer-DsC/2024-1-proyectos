package Modelo;

/**
 * @author Dalton
 */
public class Vehiculo {

    public String modelo;
    public String motor;
    public int velocidad;

    public Vehiculo() {}
    
    public Vehiculo(String modelos, String motor, int velocidad){
    this.modelo=modelo;
    this.motor=motor;
    this.velocidad=velocidad;
    }
}
