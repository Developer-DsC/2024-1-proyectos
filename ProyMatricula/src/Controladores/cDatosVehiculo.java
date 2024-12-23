package Controladores;

import Modelos.DatosVehiculo;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.table.DefaultTableModel;

public class cDatosVehiculo {

    //arreglo dinamico de objetos. Arraylist es una coleccion predefinida en JAVA
    ArrayList<DatosVehiculo> Lista = new ArrayList<>();
    

    /**
     * Retorna la cantidad de objetos del arreglo
     *
     * @return
     */
    public int Count() {
        return Lista.size();
    }

    /**
     * Borrar todos los elementos del arreglo
     */
    public void Clear() {
        Lista.clear();
    }

    /**
     * Registra un nuevo estudiante
     *
     * @param e
     * @throws java.io.IOException
     */
    public void nuevo(DatosVehiculo e) throws IOException {
        int pos = localizar(e.Cedula);
        if (pos == -1) {//si cedula no esta registrada, se agrega nuevo estudiante
            Lista.add(e);
        } else {
            throw new RuntimeException("# de C�dula ya asignado a otro estudiante");
        }
    }

    /**
     * Modificar datos de un estudiante existente
     *
     * @param e
     * @param ced
     * @throws java.io.IOException
     */
    public void modificar(DatosVehiculo e, String ced) throws IOException {
        int pos = localizar(ced);
        if (pos > -1) {//si estudiante esta registrado se modifica
            Lista.set(pos, e);
        } else {
            throw new RuntimeException("No existe un estudiante registrado con la cedula ingresada");
        }
    }

    /**
     * Eliminar un estudiante
     *
     * @param cedula
     * @throws java.io.IOException
     */
    public void eliminar(String cedula) throws IOException {
        int pos = localizar(cedula);
        if (pos > -1) {//si estudiante esta registrado se elimina
            Lista.remove(pos);
        } else {
            throw new RuntimeException("No existe un estudiante registrado con la cedula ingresada");
        }
    }

    /**
     * Lista datos en un defaultablemodel para presentar en una tabla
     *
     * @return
     */
    public DefaultTableModel getTabla() {
        //encabezados de columnas de la tabla
        String[] columnName = {"No.", "Cedula", "Apellido", "Nombre", "Genero", "Direccion", "Padre", "Madre"};        
        DefaultTableModel tabla = new DefaultTableModel(columnName, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        for (int i = 0; i < Lista.size(); i++) {
            DatosVehiculo e = getEstudiante(i);
            Object[] row = {
                (i + 1), e.Cedula, e.Apellido, e.Nombre, e.Genero,
                e.Direccion, e.Padre, e.Madre
            };
            tabla.addRow(row);
        }
        return tabla;
    }

    /**
     * Algoritmo de busqueda secuencial en el arreglo Lista
     *
     * @param cedula
     * @return posicion en el arreglo del estudiante encontrado
     */
    public int localizar(String cedula) {
        int pos = -1; //se retorna -1 si no se encuentra en el arreglo
        for (int i = 0; i < Lista.size(); i++) {
            DatosVehiculo e = getEstudiante(i);
            if (cedula.equals(e.Cedula)) {
                pos = i; //posicion encontrada
                break; //finaliza el ciclo for
            }
        }
        return pos;
    }

    /**
     * Algoritmo de busqueda secuencial mediante criterio de cedula parcial en
     * el arreglo Lista
     *
     * @param cedula
     * @return cEstudiante
     * @throws IOException
     */
    public cDatosVehiculo buscar_cedula(String cedula) throws IOException {
        cDatosVehiculo ob = new cDatosVehiculo();
        for (int i = 0; i < Lista.size(); i++) {
            DatosVehiculo e = getEstudiante(i);
            if (e.Cedula.toLowerCase().startsWith(cedula)) {
                ob.nuevo(e);
            }
        }
        return ob;
    }

    /**
     * Algoritmo de busqueda secuencial mediante criterio apellido parcial en el
     * arreglo Lista
     *
     * @param apellido
     * @return cEstudiante
     * @throws IOException
     */
    public cDatosVehiculo buscar_apellido(String apellido) throws IOException {
        cDatosVehiculo ob = new cDatosVehiculo();
        for (int i = 0; i < Lista.size(); i++) {
            DatosVehiculo e = getEstudiante(i);
            if (e.Apellido.toLowerCase().startsWith(apellido)) {
                ob.nuevo(e);
            }
        }
        return ob;
    }

    /**
     * Retornar un objeto del arreglo Lista
     *
     * @param pos es la posicion del objeto en el arreglo
     * @return objeto encontrado
     */
    public DatosVehiculo getEstudiante(int pos) {
       DatosVehiculo ob = null;
        if (pos >= 0 && pos < Lista.size()) {
            ob = Lista.get(pos);
        }
        return ob;
    }

    public static final String SEPARADOR = ";";
    public static final String QUOTE = "\"";
    //nombre del archivo csv
    public String path = Global.getPath() + "\\Data\\dataEstudiantes.csv";

    public void leer() throws IOException {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(path));
            System.out.println("Datos del archivo: ");
            String line = br.readLine();
            System.out.println(line);
            Clear(); //limpiar lista de objetos del arreglo
            line = br.readLine();
            while (line != null) {
                String[] row = line.split(SEPARADOR);
                removeTrailingQuotes(row);
                DatosVehiculo ob = new DatosVehiculo();
                ob.Cedula = row[0];
                ob.Apellido = row[1];
                ob.Nombre = row[2];
                ob.Genero = row[3];
                ob.Direccion = row[4];
                ob.Padre = row[5];
                ob.Madre = row[6];
                nuevo(ob);//agregar a la lista	           
                System.out.println(Arrays.toString(row));
                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.print(e.getMessage());
        } finally {
            if (null != br) {
                br.close();
            }
        }
    }

    //eliminar comillas
    private static String[] removeTrailingQuotes(String[] fields) {
        String result[] = new String[fields.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = fields[i].replaceAll("^" + QUOTE, "").replaceAll(QUOTE + "$", "");
        }
        return result;
    }

    public void guardar() throws IOException {
        FileWriter file;
        try {
            file = new FileWriter(path);
            final String NEXT_LINE = "\n";
            file.append("Cedula").append(SEPARADOR);
            file.append("Apellido").append(SEPARADOR);
            file.append("Nombre").append(SEPARADOR);
            file.append("Genero").append(SEPARADOR);
            file.append("Direccion").append(SEPARADOR);
            file.append("Padre").append(SEPARADOR);
            file.append("Madre").append(NEXT_LINE);

            for (int i = 0; i < Lista.size(); i++) {
                DatosVehiculo ob = (DatosVehiculo) Lista.get(i);
                file.append(ob.Cedula).append(SEPARADOR);
                file.append(ob.Apellido).append(SEPARADOR);
                file.append(ob.Nombre).append(SEPARADOR);
                file.append(ob.Genero).append(SEPARADOR);
                file.append(ob.Direccion).append(SEPARADOR);
                file.append(ob.Padre).append(SEPARADOR);
                file.append(ob.Madre).append(NEXT_LINE);
            }
            file.flush();
            file.close();
        } catch (IOException e) {
            System.out.print(e.getMessage());
        }
    }
}
