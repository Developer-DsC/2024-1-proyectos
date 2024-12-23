package practica;
/**
 * @version 1.0
 * @author Dalton
 * @date 2/04/2023
 * @description: Programa para escribir una frase ingresada por el usuario al revés
 */
import java.util.Scanner;

public class Palabra_invertida {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Ingrese una palabra y/o frase:");
        String palabra = entrada.nextLine();
        String palabrainvertida="";
        int longitudpalabra = palabra.length();
        
        for (int i =0; longitudpalabra>i ; longitudpalabra--) {
        palabrainvertida += palabra.substring(longitudpalabra-1 ,longitudpalabra);
        
        }
        System.out.print("La palabra y/o frase invertida es: " + palabrainvertida);
        
        }
    }