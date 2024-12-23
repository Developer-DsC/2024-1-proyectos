
package Entidades;

/**
 *
 * @author Dalton
 */
public class FiguraGeometrica {
  // Clase base: FiguraGeometrica

    // Atributos
    protected String nombre;

    // Constructor
    public FiguraGeometrica(String nombre) {
        this.nombre = nombre;
    }

    // Método para calcular el área (a implementar en clases derivadas)
    public double calcularArea() {
        return 0;
    }

    // Método para calcular el perímetro (a implementar en clases derivadas)
    public double calcularPerimetro() {
        return 0;
    }
}


