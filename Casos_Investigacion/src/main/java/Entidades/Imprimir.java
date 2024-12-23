package Entidades;

/**
 *
 * @author Dalton
 */

public class Imprimir {
    public static void main(String[] args) {
        // Crear un documento
        Documento documento1 = new Documento("Aquí se imprimió el documento");

        // Crear una impresora
        Impresora impresora = new Impresora();

        // Imprimir el documento
        impresora.imprimir(documento1);
    }
}

