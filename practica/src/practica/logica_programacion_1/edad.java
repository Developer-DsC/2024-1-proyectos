package practica.logica_programacion_1;
import java.util.Scanner;

/**
 *
 * @author Dalton
 */

public class edad {
    public static void main(String[]args){
        Scanner entrada = new Scanner (System.in);
    System.out.println("Programa para calcular la edad de un individuo - Author: Dalton Cornejo");
        System.out.print("Ingrese la fecha actual: ");
        String factual= entrada.nextLine();
        System.out.print("Ingrese su fecha de nacimiento: ");
        String fnaci= entrada.nextLine();
        String[] actualseparada= factual.split("/");
        String[] nacimientoseparada= fnaci.split("/");
        System.out.print(actualseparada);
        for(int i=0; i<actualseparada.length;i++){
        for (int j=0;j<nacimientoseparada.length;j++){
           
        }
        
    }
    }
}
