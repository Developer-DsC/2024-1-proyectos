 package Entidades;

/**
 *
 * @author Dalton
 */
import java.time.LocalTime;
import java.time.Duration;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Diferencias_Horas {

    public static void main(String[] args) {
        // Definir las dos horas de inicio y fin
        Scanner scanner = new Scanner(System.in);
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        
        System.out.print("Ingresa una hora en formato HH:mm: ");
        String horaTexto = scanner.nextLine();
        System.out.print("Ingresa otra- hora en formato HH:mm: ");
        String horaTexto2 = scanner.nextLine();
        
        try {

            LocalTime hora = LocalTime.parse(horaTexto, formatter);
            System.out.println("Hora ingresada: " + hora.format(formatter));
            
            LocalTime hora2 = LocalTime.parse(horaTexto2, formatter);
            System.out.println("Hora ingresada: " + hora2.format(formatter));

       

        // Calcula la diferencia teniendo en cuenta el cambio de día
        Duration diferencia = Duration.between(hora, hora2);

        // Si la diferencia es negativa, agrega 24 horas (un día) para obtener la diferencia correcta
        if (diferencia.isNegative()) {
            diferencia = diferencia.plusHours(24);
        }
        else {
                Duration duracion = Duration.between(hora, hora2);
                long horasDiferencia = duracion.toHours();
                System.out.println("Horas de diferencia: " + horasDiferencia);
            }
        long horasDiferencia = diferencia.toHours();

        System.out.println("Horas entre las "+hora+" y las "+hora2+": " + horasDiferencia + " horas");
    

             
        }catch (Exception e) {
            System.out.println("Formato de hora incorrecto. Asegúrate de ingresar la hora en formato HH:mm (ejemplo: 14:30 (PM) o 05:00 (AM)).");
        }
    }
}
