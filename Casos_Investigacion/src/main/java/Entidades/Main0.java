package Entidades;

/**
 *
 * @author Dalton
 */
public class Main0 {

    FiguraGeometrica figura1 = new Circulo("Círculo", 5.0);

    public static void main(String[] args) {
        FiguraGeometrica figura1 = new Circulo("Círculo", 5.0);

        System.out.println("Área del Circulo: " + figura1.calcularArea());

    }
}
