package Formularios;

import Entidades.Entrenador;
import Entidades.Masajista;
import Entidades.SeleccionFutbol;
import Entidades.Futbolista;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dalton
 */

public class Main {
     public static List<SeleccionFutbol> integrantes = new ArrayList<SeleccionFutbol>();
    
    public static void main(String[] args){
        
        //INGRESO FUTBOLISTA
        SeleccionFutbol jefMontero = new Futbolista(1,"Dalton", "Cornejo", 20, 23, "Delantero ");
        SeleccionFutbol Antoniovalencia = new Futbolista(2,"Antonio", "Vaelencia", 33, 25, "Delantero ");
        SeleccionFutbol EnnerValencia = new Futbolista(3,"Jose", "Delgado", 33, 13, "Lateral ");
        SeleccionFutbol pieroHincapie = new Futbolista(4,"Jean", "Perez", 20, 15, "Mediocampista ");
        SeleccionFutbol moiCaicedo = new Futbolista(5,"Chucho", "Benitez", 21, 25, "Defensa");
        
        SeleccionFutbol gusQuintero = new Entrenador(1,"Carlos", "Valencia", 58, 5);
        
        SeleccionFutbol raulMartinez = new Masajista(3, "Kevin", "Cornejo", 41, "Fisioterapia", 18);
        integrantes.add(gusQuintero);
        integrantes.add(jefMontero);
        integrantes.add(raulMartinez);
        
        // CONCENTRACION
        
        System.out.println("Todos los integrantes comienzan una concentracion. (Todos ejecutan el mismo método)");
        for (SeleccionFutbol integrante : integrantes){
            System.out.print(integrante.getNombre() +" " +integrante.getApellidos()+ " -> "); integrante.concentrarse();
        }
        
        // VIAJE
        System.out.println("\n Todos los integrantes viajan para jugar un partido.(Todos ejecutan el mismo método)");
        for (SeleccionFutbol integrante : integrantes){
            System.out.print(integrante.getNombre() + " " +
            integrante.getApellidos() + " -> ");
            integrante.viajar();
        }
        
        // ENTRENAMIENTO
        System.out.println("\nEntrenamiento : Todos los integrantes tienen su función en un entrenamiento (Especialización)");
        for (SeleccionFutbol integrante : integrantes){
            System.out.print(integrante.getNombre() + " " +
            integrante.getApellidos() + " -> "); integrante.entrenar();
        }
        
        // PARTIDO DE FUTBOL
        System.out.println("\nPartido de Fútbol : Todos los integrantes tienen su función en un partido (Especialización)");
        for (SeleccionFutbol integrante : integrantes){
            System.out.print(integrante.getNombre() + " " + integrante.getApellidos() + " -> "); integrante.jugarPartido();
        }
        
        // PLANIFICAR ENTRENAMIENTO
        System.out.println("\nPlanificar Entrenamiento : Solo el entrenador tiene el método para planificar un entrenamiento:");
        System.out.print(gusQuintero.getNombre() + " " + gusQuintero.getApellidos() + " -> ");
        
        ((Entrenador) gusQuintero).planificarEntrenamiento();
        
        // ENTREVISTA
        System.out.println("\nEntrevista : Solo el futbolista tiene el método para dar una entrevista:");
        System.out.print(jefMontero.getNombre() + " " + jefMontero.getApellidos() + " -> ");
        ((Futbolista) jefMontero).entrevista();
        
        // MASAJE
        System.out.println("\nMasaje : Solo el masajista tiene el método para dar un masaje:");
        System.out.print(raulMartinez.getNombre() + " " +raulMartinez.getApellidos() + " -> ");
        ((Masajista) raulMartinez).darMasaje();
    }
}
