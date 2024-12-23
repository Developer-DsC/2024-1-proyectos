package Inversor;

import java.util.Scanner;

/**
 *
 * @author Dalton
 */
public class InvertirPalabra {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Cuantas veces desea repetir?: ");
        int veces = leer.nextInt();

        do {
            
            String palabra, palabraInvertida="";
            int longitudPalabra = 0;

            do {
                System.out.println("Escriba una frase o palabra: ");
                palabra=leer.nextLine();
                
                longitudPalabra=3;
                
                palabraInvertida += palabra.substring(longitudPalabra - 1, longitudPalabra);
                longitudPalabra--;
            } while (longitudPalabra != 0);
            System.out.println(palabraInvertida);
            veces--;
        } while (veces!=0);

    }

}
