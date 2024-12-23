package Controladores;

/**
 * Controlador de Matriculacion *
 * @author Reynaldo Borja
 * @date 2023/02/20
 * @version 1.5
 */

import Modelos.Matriculacion;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.table.DefaultTableModel;

public class cMatriculacion {

    //arreglo dinamico de objetos. Arraylist es una coleccion predefinida en JAVA
    ArrayList<Matriculacion> Lista = new ArrayList<>();
    //

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
     * Registra un nuevo servicio
     *
     * @param e
     * @throws java.io.IOException
     */
     //	Servicio, Tramites, cliente, tipo_matricula, fecha
    public void nuevo(Matriculacion e) throws IOException {
        int pos = localizar(e.Representante);
        if (pos == -1) {
            Lista.add(e);
        } else {
            throw new RuntimeException("# no existe cliente con ese servicio");
        }
    }
    /**
     * Modificar datos de un estudiante existente
     *
     * @param e
     * @param rep
     * @throws java.io.IOException
     */
    public void modificar(Matriculacion e, String rep) throws IOException {
        int pos = localizar(rep);
        if (pos > -1) {//
            Lista.set(pos, e);
        } else {
            throw new RuntimeException("No existe ningun servicio asignado al cliente registrado");
        }
    }

    /**
     * Eliminar un Representante
     *
     * @param rep
     * @throws java.io.IOException
     */
    public void eliminar(String rep) throws IOException {
        int pos = localizar(rep);
        if (pos > -1) {//si estudiante esta registrado se elimina
            Lista.remove(pos);
        } else {
            throw new RuntimeException("No existe un representatnte registrado con ese nombre");
        }
    }

    /**
     * Lista datos en un defaultablemodel para presentar en una tabla
     *
     * @return
     */
    public DefaultTableModel getTabla() {
        //encabezados de columnas de la tabla
        String[] columnName = {"No.","Representante", "Servicio", "Tramites", "Tipo", "Fecha"};        
        DefaultTableModel tabla = new DefaultTableModel(columnName, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        
        for (int i = 0; i < Lista.size(); i++) {
            Matriculacion e = getMatriculacion(i);
            Object[] row = {(i + 1),e.Representante, e.Servicio, e.Tramite, e.Tipo, e.Fecha};
            tabla.addRow(row);
        }
        return tabla;
    }

    /**
     * Algoritmo de busqueda secuencial en el arreglo Lista
     *
     * @param Representante
     * @return posicion en el arreglo del Representante encontrado
     */
    public int localizar(String Representante) {
        int pos = -1; //se retorna -1 si no se encuentra en el arreglo
        for (int i = 0; i < Lista.size(); i++) {
            Matriculacion e = getMatriculacion(i);
            if (Representante.equals(e.Representante)) {
                pos = i; //posicion encontrada
                break; //finaliza el ciclo for
            }
        }
        return pos;
    }

    /**
     * Algoritmo de busqueda secuencial mediante criterio de Representante parcial en
     * el arreglo Lista
     *
     * @param representante
     * @return cMatriculacion
     * @throws IOException
     */
    public cMatriculacion buscar_representante(String representante) throws IOException {
        cMatriculacion ob = new cMatriculacion();
        for (int i = 0; i < Lista.size(); i++) {
            Matriculacion e = getMatriculacion(i);
            if (e.Representante.toLowerCase().contains(representante.toLowerCase())) {
                ob.nuevo(e);
            }
        }
        return ob;
    }

    /**
     * Algoritmo de busqueda secuencial mediante criterio servicio parcial en el
     * arreglo Lista
     *
     * @param servicio
     * @return cMatriculacion
     * @throws IOException
     */
    public cMatriculacion buscar_servicio(String servicio) throws IOException {
        cMatriculacion ob = new cMatriculacion();
        for (int i = 0; i < Lista.size(); i++) {
            Matriculacion e = getMatriculacion(i);
            if (e.Servicio.toLowerCase().contains(servicio)) {
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
    public Matriculacion getMatriculacion(int pos) {
        Matriculacion ob = null;
        if (pos >= 0 && pos < Lista.size()) {
            ob = Lista.get(pos);
        }
        return ob;
    }

    public static final String SEPARADOR = ";";
    public static final String QUOTE = "\"";
    //nombre del archivo csv
    public String path = Global.getPath() + "\\Data\\dataMatriculacions.csv";

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
                Matriculacion ob = new Matriculacion();
                
                ob.Representante = row[0];
                ob.Servicio = row[1];
                ob.Tramite= row[2];
                ob.Tipo = row[3];
                ob.Fecha = row[4];

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
            file.append("Representante").append(SEPARADOR);
            file.append("Servicio").append(SEPARADOR);
            file.append("Tramite").append(SEPARADOR);
            file.append("Tipo").append(SEPARADOR);
            file.append("Fecha").append(NEXT_LINE);
            

            for (int i = 0; i < Lista.size(); i++) {
                Matriculacion ob = (Matriculacion) Lista.get(i);
                file.append(ob.Representante).append(SEPARADOR);
                file.append(ob.Servicio).append(SEPARADOR);
                file.append(ob.Tramite).append(SEPARADOR);
                file.append(ob.Tipo).append(SEPARADOR);
                file.append(ob.Fecha).append(NEXT_LINE);
            }
            file.flush();
            file.close();
        } catch (IOException e) {
            System.out.print(e.getMessage());
        }
    }
}
