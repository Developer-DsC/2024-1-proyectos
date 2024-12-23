
import java.util.Scanner;

public class Coche {

    String modelo, matricula, motor;
    int km, velocidad;

    void arrancar() {
        System.out.println("Se encendió el carro");
    }

    void primera() {
        km = 10;
        System.out.println("El carro comienza a moverse a " + km + "/h");
    }

    void segunda() {
        km = 30;
        System.out.println("El carro va a una velocidad de " + km + "/h");
    }

    void tercera() {
        km = 50;
        System.out.println("El carro acelera y llega a una velocidad de " + km + "/h");
    }

    public static void main(String[] arg) {
        Scanner entrada = new Scanner(System.in);
        Coche carro1 = new Coche();
        carro1.arrancar();
        int n = entrada.nextInt();
        
        switch (n) {
            
            case 1:
                carro1.primera();
                break;
                
            case 2:
                carro1.segunda();
                break;
            case 3:
                carro1.tercera();
                break;
        }

    }
}
