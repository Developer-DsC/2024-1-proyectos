package Entidades;

import java.awt.TrayIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Dalton
 */
public class ejercicio_2_Notas_Estudiantes {

    private String estudiante;
    private int nota;
    
    public ejercicio_2_Notas_Estudiantes(){
        
    }

    public String getEstudiante() {
        return estudiante;
    }

    public int getNota() {
        return nota;
    }

    public void setEstudiante(String estudiante) {
        this.estudiante = estudiante;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public ejercicio_2_Notas_Estudiantes(String estudiante, int nota) {
        this.estudiante = estudiante;
        this.nota = nota;
    }

    public String calcular() {
        String calificacion = "";

        if (this.nota > 10) {
            JOptionPane.showMessageDialog(null, "La nota que ingreso no es valida, porfavor ingrese una nota menor a 10",
                     "Error", JOptionPane.WARNING_MESSAGE);
        }
        else{
        if (this.nota == 10) {
            calificacion = "Sobresaliente";
        }
        if (this.nota > 7 && nota < 10) {
            calificacion = "Distinguido";
        }
        if (this.nota > 5 && nota < 8) {
            calificacion = "Bueno";
        }
        if (this.nota > 3 && nota < 6) {
            calificacion = "Aprobado";
        }
        if (this.nota > 5 && nota < 8) {
            calificacion = "Bueno";
        }
        if (this.nota > 0 && nota < 4) {
            calificacion = "Insuficiente";
        }
        if (this.nota == 0) {
            calificacion = "Ausente";
        }
        
    }
        return calificacion;   
}
    public void imprimir() {
        JOptionPane.showMessageDialog(null, "                  Notas"
                + "\nEstudiante: " + estudiante
                + "\nNota final: " + nota
                + "\nCalificación final: " + calcular());
    }

}