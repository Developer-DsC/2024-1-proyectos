package Entidades;

/**
 *
 * @author Dalton
 */

public class Documento {
    private String contenido;

    // Constructor
    public Documento(String contenido) {
        this.contenido = contenido;
    }

    // Getter para el contenido del documento
    public String getContenido() {
        return contenido;
    }

}
