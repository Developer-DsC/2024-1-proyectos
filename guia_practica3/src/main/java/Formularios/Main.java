package Formularios;

import PolimorfismoInterface.Entrenador;
import PolimorfismoInterface.Masajista;
import PolimorfismoInterface.SeleccionFutbol;
import PolimorfismoInterface.Futbolista;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Dalton
 */
public class Main {

    public static List<SeleccionFutbol> integrantes = new ArrayList<SeleccionFutbol>();

    public static void main(String[] args) {

        //INGRESAR
        SeleccionFutbol gonzalo_plata = new Futbolista(1, "Gonzalo", "Plata", 21, 10, "Extremo Izquierdo ");
        SeleccionFutbol Gustavo_Alfaro = new Entrenador(1, "Gustavo", "Alfaro", 58, 5);
        SeleccionFutbol raulMartinez = new Masajista(3, "Raul", "Martinez", 41, "Fisioterapia", 18);
        integrantes.add(Gustavo_Alfaro);
        integrantes.add(gonzalo_plata);
        integrantes.add(raulMartinez);

        // CONCENTRACION
         JOptionPane.showMessageDialog(null,"Todos los integrantes comienzan una concentracion.");
        for (SeleccionFutbol integrante : integrantes) {
            JOptionPane.showMessageDialog(null, integrante.getNombre() + " " + integrante.getApellidos() + " -> ");
            integrante.concentrarse();;
        }

        // VIAJE
         JOptionPane.showMessageDialog(null,"\n Todos los integrantes viajan para jugar un partido.(Todos ejecutan el mismo método)");
        for (SeleccionFutbol integrante : integrantes) {
            JOptionPane.showMessageDialog(null, (integrante.getNombre() + " "
                    + integrante.getApellidos() + " -> "));
            integrante.viajar();
        }

        // ENTRENAMIENTO
         JOptionPane.showMessageDialog(null,"\nEntrenamiento : Todos los integrantes tienen su función en un entrenamiento (Especialización)");
        for (SeleccionFutbol integrante : integrantes) {
             JOptionPane.showMessageDialog(null,integrante.getNombre() + " "
                    + integrante.getApellidos() + " -> ");
            integrante.entrenar();
        }

        // PARTIDO DE FUTBOL
         JOptionPane.showMessageDialog(null,"\nPartido de Fútbol : Todos los integrantes tienen su función en un partido (Especialización)");
        for (SeleccionFutbol integrante : integrantes) {
             JOptionPane.showMessageDialog(null,integrante.getNombre() + " " + integrante.getApellidos() + " -> ");
            integrante.jugarPartido();
        }

        // PLANIFICAR ENTRENAMIENTO
         JOptionPane.showMessageDialog(null,"\nPlanificar Entrenamiento : Solo el entrenador tiene el método para planificar un entrenamiento:");
         JOptionPane.showMessageDialog(null,Gustavo_Alfaro.getNombre() + " " + Gustavo_Alfaro.getApellidos() + " -> ");

        ((Entrenador) Gustavo_Alfaro).planificarEntrenamiento();

        // ENTREVISTA
         JOptionPane.showMessageDialog(null,"\nEntrevista : Solo el futbolista tiene el método para dar una entrevista:");
         JOptionPane.showMessageDialog(null,gonzalo_plata.getNombre() + " " + gonzalo_plata.getApellidos() + " -> ");
        ((Futbolista) gonzalo_plata).entrevista();

        // MASAJE
         JOptionPane.showMessageDialog(null,"\nMasaje : Solo el masajista tiene el método para dar un masaje:");
         JOptionPane.showMessageDialog(null,raulMartinez.getNombre() + " " + raulMartinez.getApellidos() + " -> ");
        ((Masajista) raulMartinez).darMasaje();
    }
}
