package Unidad4_ProgModular;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Clase personalizada Estudiante
 */
class Estudiante {
//datos de la clase

    String Cedula;
    String Nombre;
    String apellido;
    String Edad;
//constructores

    Estudiante() {
    } //constructor vacio

    Estudiante(String ced, String nom, String ape, String edad) { //constructor común
        Cedula = ced;
        Nombre = nom;
        apellido = ape;
        Edad = edad;
    }
}

/**
 * Clase principal del programa Gestion de Estudiantes
 */
public class Gestion_Estudiante {
    //datos globales

    private static int MAX = 30; //máximo número de estudiantes
    public static Estudiante[] Lista = new Estudiante[MAX];
    public static int N = 0; //contador de estudiantes

    /**
     * Registrar un nuevo estudiante
     */
    public static void nuevo() throws IOException {
//int N=0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char op;
        do {
            Estudiante e = new Estudiante();
            System.out.println("Registro de un nuevo estudiante");
            do {
                System.out.println("Ingrese la cédula: ");
                e.Cedula = br.readLine().trim();
            } while (e.Cedula.equals(""));
            int pos = localizar(e.Cedula);
            if (pos == -1) {//si cedula no esta registrada, se ingresa el nuevo estudiante
                    System.out.println("Ingrese Apellido: ");
                    e.apellido = br.readLine().trim();
                
                    System.out.println("Ingrese Nombre: ");
                    e.Nombre = br.readLine().trim();
                
                    System.out.println("Ingrese Edad: ");
                    e.Edad = br.readLine().trim();
                
                Lista[N++] = e;
            } else {
                System.out.println("Ya existe un estudiante registrado con cedula: " + e.Cedula);
            }
            System.out.println("¿Desea ingresar otro estudiante (s/n)?");
//trim limpia caracteres de la cadena
//toLowerCase convierte la cadena en minusculas
            try {
                op = br.readLine().trim().toLowerCase().charAt(0);
            } catch (Exception ex) {
                op = 'n';
            }
        } while (op == 's');
    }

    /**
     * Visualizar la lista de estudiantes
     */
    public static void listar() {
        int i;
        System.out.println("\nLISTA DE ESTUDIANTES REGISTRADOS: ");
        System.out.println("-----------------------------------------");
        String s = String.format("%s   %-15s%-15s%-15s%-15s", "#", "CEDULA", "NOMBRE", "APELLIDO","Edad");
        System.out.println(s);
        for (i = 0; i < N; i++) {
            s = String.format("%d1   %-15s%-15s%-15s%-15s", (i + 1), Lista[i].Cedula ,Lista[i].Nombre, Lista[i].apellido, Lista[i].Edad);
            System.out.println(s);
        }
        i = 10;
    }


    /**
     * Algoritmo de busqueda secuencial en el arreglo Lista
     *
     * @param cedula
     * @return posicion en el arreglo del estudiante encontrado
     */
    public static int localizar(String cedula) {
        int pos = -1; //se retorna -1 si no se encuentra 2en el arreglo
        for (int i = 0; i < N; i++) {
            if (cedula.equals(Lista[i].Cedula)) {
                pos = i; //posicion encontrada
                break; //finaliza el ciclo for
//i=N; //otra forma de finalizar el ciclo for
            }
        }
        return pos;
    }

    /**
     * Busqueda del estudiante y visualizacion de datos
     */
    public static void busqueda() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Búsqueda de un estudiante");
        System.out.println("Ingrese la cédula: ");
        String cedula = br.readLine();
        int pos = localizar(cedula); //buscar posicion en el arreglo segun cedula
        if (pos >= 0) {
            System.out.println("Estudiante encontrado:");
            System.out.println("Cedula: " + Lista[pos].Cedula);
            System.out.println("Apellidos y nombres:" + Lista[pos].apellido+" "+ Lista[pos].Nombre);
        } else {
            System.out.println("No existe ningún estudiante con la cédula: " + cedula);
        }
    }

    /**
     * Modificar datos de un estudiante
     */
    public static void modificar() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char op;
        do {
            System.out.println("\n-----------------------------------------");
            System.out.println("Modificación de datos de un estudiante");
            System.out.println("Ingrese la cédula: ");
            String ced = br.readLine();
            int pos = localizar(ced); //buscar posicion en el arreglo segun cedula
            if (pos >= 0) {
                do {
                    System.out.println("\nDatos a modificar:");
                    System.out.println("[1] Cedula: " + Lista[pos].Cedula);
                    System.out.println("[2] Apellidos y nombres:" + Lista[pos].Nombre);
                    System.out.println("[3] Regresar al menu principal");
                    System.out.println("Ingrese la opcion:");
                    op = br.readLine().trim().toLowerCase().charAt(0);
                    switch (op) {
                        case '1':
                            System.out.println("Ingrese la nueva cedula:");
                            Lista[pos].Cedula = br.readLine();
                            break;
                        case '2':
                            System.out.println("Ingrese nuevos apellidos y nombres:");
                            Lista[pos].Nombre = br.readLine();
                    }
                } while (op != '3');
            } else {
                System.out.println("Estudiante no encontrado con la cedula: " + ced);
            }
            System.out.println("¿Desea modificar otro estudiante (s/n)?");
//trim limpia caracteres de la cadena
//toLowerCase convierte la cadena en minusculas
            try {
                op = br.readLine().trim().toLowerCase().charAt(0);
            } catch (Exception ex) {
                op = 'n';
            }
        } while (op == 's');
    }

    /**
     * Eliminar datos de un estudiante
     */
    public static void eliminar() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char op;
        System.out.println("\n-----------------------------------------");
        System.out.println("Eliminar datos de un estudiante");
        System.out.println("Ingrese la cédula: ");
        String ced = br.readLine();
        int pos = localizar(ced); //buscar posicion en el arreglo segun cedula
        if (pos >= 0) {
            System.out.println("\nDatos del estudiante:");
            System.out.println("Cedula: " + Lista[pos].Cedula);
            System.out.println("Apellidos y nombres:" + Lista[pos].Nombre);
            System.out.println("¿Está seguro de eliminar este registro (s/n)?");
            try {
                op = br.readLine().trim().toLowerCase().charAt(0);
            } catch (Exception ex) {
                op = 'n';
            }
            if (op == 's') {
                for (int i = pos; i < N - 1; i++) {
                    Lista[i] = Lista[i + 1];
                }
                N--;
                System.out.println("El Registro de estudiante se ha eliminado");
            }
        } else {
            System.out.println("Estudiante no encontrado con cedula: " + ced);
        }
    }

    /**
     * Ordenar el vector de personas ascendentemente por cedula metodo de
     * burbuja
     */
    public static void ordenarVector_cedula() {
        for (int i = 0; i < N - 1; i++) {
            for (int j = i + 1; j < N; j++) {
                if (Lista[j].Cedula.compareTo(Lista[i].Cedula) < 0) {
                    Estudiante aux = Lista[i];
                    Lista[i] = Lista[j];
                    Lista[j] = aux;
                }
            }
        }
    }

    /**
     * Ordenar el vector de personas ascendentemente por apellidos metodo de
     * burbuja
     */
    public static void ordenarVector_apellidos() {
        for (int i = 0; i < N - 1; i++) {
            for (int j = i + 1; j < N; j++) {
                if (Lista[j].Nombre.compareTo(Lista[i].Nombre) < 0) {
                    Estudiante aux = Lista[i];
                    Lista[i] = Lista[j];
                    Lista[j] = aux;
                }
            }
        }
    }

    /**
     * Modificar datos de un estudiante
     */
    public static void ordenar() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char op = ' ';
        do {
            System.out.println("\n-----------------------------------------");
            System.out.println("Ordenar Lista de estudiantes");
            System.out.println("[1] Por Cedula");
            System.out.println("[2] Por Apellidos");
            System.out.println("[3] Regresar al menu principal");
            System.out.println("Ingrese la opcion:");
            try {
                op = br.readLine().trim().toLowerCase().charAt(0);
            } catch (Exception ex) {
                op = ' ';
            }
            switch (op) {
                case '1':
                    ordenarVector_cedula();
                    listar();
                    continuar();
                    break;
                case '2':
                    ordenarVector_apellidos();
                    listar();
                    continuar();
                    break;
            }
            limpiar();
        } while (op != '3');
    }

    /**
     * ***Continuar con enter
     */
    public static void continuar() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char op;
        System.out.println("-----------------------------------------");
        System.out.println("<<Pulse ENTER para continuar>>");
        try {
            op = br.readLine().trim().toLowerCase().charAt(0);
        } catch (Exception ex) {
        }
    }

    /**
     * ****Limpiar pantalla
     */
    public static void limpiar() {
//limpia pantalla
        System.out.println(new String(new char[50]).replace("\0", "\r\n"));
    }

    /**
     * ***************************Metodo
     * principal**********************************
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char op;
//datos iniciales //0123456789
        Estudiante e1 = new Estudiante("0123", "Perez",  "Juan","16");
        Lista[N++] = e1;
        Estudiante e2 = new Estudiante("1234567890", "Castro", "Pedro","45");
        Lista[N++] = e2;
        Estudiante e3 = new Estudiante("2345678910", "Andrade", "Angel","88");
        Lista[N++] = e3;
        Estudiante e4 = new Estudiante("9876543210", "Castillo", "Luis","55");
        Lista[N++] = e4;
        do {
//menu de opciones
            System.out.println("\nGESTION DE DATOS DE ESTUDIANTES");
            System.out.println("[1] Nuevo estudiante");
            System.out.println("[2] Listar");
            System.out.println("[3] Buscar");
            System.out.println("[4] Modificar");
            System.out.println("[5] Eliminar");
            System.out.println("[6] Ordenar y visualizar");
            System.out.println("[7] Salir");
            System.out.println("Elija la opción: ");
            try {
                op = br.readLine().trim().toLowerCase().charAt(0);
            } catch (Exception ex) {
                op = 'n';
            }
            limpiar();
            switch (op) {
                case '1': //nuevo estudiante
                    nuevo();
                    break;
                case '2': //Listar
                    listar();
                    continuar();
                    break;
                case '3': //Buscar
                    busqueda();
                    continuar();
                    break;
                case '4': //Modificar
                    modificar();
                    break;
                case '5': //Eliminar
                    eliminar();
                    continuar();
                    break;
                case '6': //Ordenar y visualizar
                    ordenar();
                    break;
                case '7': //salir
                    System.out.println("\n-----------------------------------------");
                    System.out.println("Programa desarrollado por Estudiante 1");
                    System.out.println("Cerrando programa.....");
                    continuar();
                    break;
            } //fin del switch
            limpiar();
        } while (op != '7'); //fin del dowhile
    } //fin del main
} //fin de la clase
