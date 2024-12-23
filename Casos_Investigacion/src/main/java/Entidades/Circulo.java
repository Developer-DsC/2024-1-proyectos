
package Entidades;

/**
 *
 * @author Dalton
 */
    // Clase derivada: Circulo
public class Circulo extends FiguraGeometrica {
    // Atributos
    private double radio;

    // Constructor
    public Circulo(String nombre, double radio) {
        super(nombre);
        this.radio = radio;
    }

    // Implementación del cálculo del área para un círculo
    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    // Implementación del cálculo del perímetro para un círculo
    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }
}

