package Entidades;

/**
 *
 * @author Dalton
 */

public class Main3 {
    public static void main(String[] args) {
        // Crear un auto con motor de 4 cilindros y combustible "Gasolina"
        Auto auto1 = new Auto("Jeep", "Rubicon", 8, "Gasolina");

        // Obtener los atributos del auto y del motor
        System.out.println("Auto: " + auto1.getMarca() + " " + auto1.getModelo());
        System.out.println("Motor: Cilindros - " + auto1.getMotor().getNumeroCilindros() +
                ", Combustible - " + auto1.getMotor().getTipoCombustible());
    }
}

