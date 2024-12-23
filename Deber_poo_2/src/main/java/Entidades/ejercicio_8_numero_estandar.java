package Entidades;

import javax.swing.JOptionPane;

/**
 *
 * @author Dalton
 */
public class ejercicio_8_numero_estandar {

    private String ISBN;

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public ejercicio_8_numero_estandar() {
    }

    public ejercicio_8_numero_estandar(String ISBN) {
        this.ISBN = ISBN;
    }

    public boolean Verificador_ISBN() {
        boolean verificador;

        if (ISBN.length() == 10) {
            verificador = true;
        } else {
            verificador = false;
        }
        return verificador;
    }

    public int Serie() {
        int result = 0;
        if (Verificador_ISBN() == true) {
            for (int i = 1; i < ISBN.length(); i++) {
                int num = Character.getNumericValue(ISBN.charAt((i-1)));
                result = result + (i) * num;
            }
        }
        return result;
    }

    public String Serie_Cadena() {
        String s = "";

        for (int i = 0; i < ISBN.length(); i++) {
            int num = Character.getNumericValue(ISBN.charAt(i));
            if (i == 9) {
                s = s + (i + 1) + "*" + num;
            } else {
                s = s + (i + 1) + "*" + num + "+";
            }
        }
        return s;
    }

    public boolean verificador() {
        boolean verificador = false;
        if (Verificador_ISBN() == true) {

            int total_num = Serie();
            int num = Character.getNumericValue(ISBN.charAt(9));
            double resultado = num % 11;

            if (resultado == num) {

                verificador = true;
            } else {
                verificador = false;
            }
        }
        return verificador;
    }

    public void imprimir() {
        if (Verificador_ISBN() == true) {
            JOptionPane.showMessageDialog(null, Serie_Cadena() + " = " + Serie());
        }
        if (Verificador_ISBN() == false) {
            JOptionPane.showMessageDialog(null, "Digite un digito que tenga 10 caracteres");
        }
        if (verificador() == true) {
            JOptionPane.showMessageDialog(null, "El ISBN ingresado es valido");
        }
        if (verificador() == false) {
            JOptionPane.showMessageDialog(null, "El ISBN ingresado no es valido");
        }
    }

}