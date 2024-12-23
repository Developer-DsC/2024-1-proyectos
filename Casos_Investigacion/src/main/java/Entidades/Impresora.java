package Entidades;

/**
 *
 * @author Dalton
 */

public class Impresora {
    // Método para imprimir un documento
    public void imprimir(Documento documento) {
        // Simulamos la impresión mostrando el contenido del documento en la consola
        System.out.println("Imprimiendo documento: ");
        System.out.println(documento.getContenido());
    }
}