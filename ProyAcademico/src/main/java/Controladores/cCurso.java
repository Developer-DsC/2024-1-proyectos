package Controladores;

/**
 * Controlador de Cursos *
 * @author Bertha Mazon
 * @date 2018/08/04
 * @version 1.0
 */

import Modelos.Curso;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.table.DefaultTableModel;


public class cCurso {
    //arreglo dinamico de objetos. Arraylist es una coleccion predefinida en JAVA
    ArrayList<Curso> Lista = new ArrayList<>();    

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
     * Registrar un nuevo Curso
     * @param e
     * @throws java.io.IOException
     */
    public void nuevo(Curso e) throws IOException {
        int pos = localizar(e.Codigo);
        if (pos == -1) {//si codigo no esta registrado, se agrega nuevo Curso
            Lista.add(e);
        } else {
            throw new RuntimeException("C�digo ya asignado a otro Curso");
        }
    }

    /**
     * Modificar datos de un Curso existente
     * @param c
     * @param cod
     * @throws java.io.IOException
     */
    public void modificar(Curso c, String cod) throws IOException {
        int pos = localizar(cod);
        if (pos > -1) {//si Curso est� registrado se modifica
            Lista.set(pos, c);
        } else {
            throw new RuntimeException("No existe un curso registrado con el c�digo ingresado");
        }
    }

    /**
     * Eliminar un Curso
     * @param codigo
     * @throws java.io.IOException
     */
    public void eliminar(String codigo) throws IOException {
        int pos = localizar(codigo);
        if (pos > -1) {//si Curso est� registrado se elimina
            Lista.remove(pos);
        } else {
            throw new RuntimeException("No existe un Curso registrado con el c�digo ingresado");
        }
    }

    /**
     * Lista datos en un defaultablemodel para presentar en una tabla
     * @return 
     */
    public DefaultTableModel getTabla() {
        //encabezados de columnas de la tabla para JTable
        String[] columnName = {"No.", "Periodo", "Codigo", "Nivel", "Orden", "Paralelo", "Aula", "Instructor"};
        DefaultTableModel tabla = new DefaultTableModel(columnName, 0);
        for (int i = 0; i < Lista.size(); i++) {
            Curso e = getCurso(i);
            Object[] row = {
                (i + 1), e.Periodo, e.Codigo,
                e.Nivel, e.Orden, e.Paralelo, e.Aula, e.Instructor
            };
            tabla.addRow(row);
        }
        return tabla;
    }

    /**
     * Algoritmo de busqueda secuencial en el arreglo Lista
     *
     * @param codigo
     * @return posicion en el arreglo del Curso encontrado
     */
    public int localizar(String codigo) {
        int pos = -1; //se retorna -1 si no se encuentra en el arreglo
        for (int i = 0; i < Lista.size(); i++) {
            Curso e = getCurso(i);
            if (codigo.equals(e.Codigo)) {
                pos = i; //posicion encontrada
                break; //finaliza el ciclo for
            }
        }
        return pos;
    }

    /**
     * Algoritmo de busqueda secuencial mediante criterio de codigo parcial en
     * el arreglo Lista     *
     * @param codigo
     * @return cCurso
     * @throws IOException
     */
    public cCurso buscar_codigo(String codigo) throws IOException {
        cCurso ob = new cCurso();
        for (int i = 0; i < Lista.size(); i++) {            
            Curso e = getCurso(i);
            if(e.Codigo.toLowerCase().startsWith(codigo)){
		ob.nuevo(e);
            }            
        }
        return ob;
    }

    /**
     * Algoritmo de busqueda secuencial mediante criterio apellido parcial en el
     * arreglo Lista
     * @param nivel   
     * @return cCurso
     * @throws IOException
     */
    public cCurso buscar_nivel(String nivel) throws IOException {
        cCurso ob = new cCurso();
        for (int i = 0; i < Lista.size(); i++) {
            Curso e = getCurso(i);
            if(e.Nivel.toLowerCase().startsWith(nivel.toLowerCase())){
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
    public Curso getCurso(int pos) {
        Curso ob = null;
        if (pos >= 0 && pos < Lista.size()) {
            ob = Lista.get(pos);
        }
        return ob;
    }

    public static final String SEPARADOR = ";";
    public static final String QUOTE = "\"";
    //nombre del archivo csv
    public String path = Global.getPath() + "\\Data\\dataCursos.csv";

    /**
     * metodo para leer datos de un archivo csv y cargarlos en el arraylist
     * Lista
     * @throws java.io.IOException
     */
    public void leer() throws IOException {
        BufferedReader br = null;
        try {
            
            br = new BufferedReader(new FileReader(path));
            System.out.println("Datos del archivo: ");
            String line = br.readLine();
             System.out.println(line);
            Clear(); //limpiar lista de objetos
            line = br.readLine();
            while (line != null) {
                String[] row = line.split(SEPARADOR);
                removeTrailingQuotes(row);

                Curso ob = new Curso();
                ob.Periodo = row[0];
                ob.Codigo = row[1];
                ob.Nivel = row[2];
                ob.Orden = Integer.parseInt(row[3]);
                ob.Paralelo = row[4];
                ob.Aula = row[5];
                ob.Instructor = row[6];
                nuevo(ob);//agregar a la lista
                //presentar por consola
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

    /**
     * eliminar comillas de datos csv
     */
    private static String[] removeTrailingQuotes(String[] fields) {

        String result[] = new String[fields.length];

        for (int i = 0; i < result.length; i++) {
            result[i] = fields[i].replaceAll("^" + QUOTE, "").replaceAll(QUOTE + "$", "");
        }
        return result;
    }

    /**
     * metodo para guardar datos en un archivo csv
     */
    public void guardar() throws IOException {
        FileWriter file;
        try {
            String path = Global.getPath() + "\\Recursos\\dataCursos.csv";
            file = new FileWriter(path);
            final String NEXT_LINE = "\n";
            file.append("Periodo").append(SEPARADOR);
            file.append("Codigo").append(SEPARADOR);
            file.append("Nivel").append(SEPARADOR);
            file.append("Orden").append(SEPARADOR);
            file.append("Paralelo").append(SEPARADOR);
            file.append("Aula").append(SEPARADOR);
            file.append("Instructor").append(NEXT_LINE);

            for (int i = 0; i < Lista.size(); i++) {
                Curso ob = (Curso) Lista.get(i);
                file.append(ob.Periodo).append(SEPARADOR);
                file.append(ob.Codigo).append(SEPARADOR);
                file.append(ob.Nivel).append(SEPARADOR);
                file.append("" + ob.Orden).append(SEPARADOR);
                file.append(ob.Paralelo).append(SEPARADOR);
                file.append(ob.Aula).append(SEPARADOR);
                file.append(ob.Instructor).append(NEXT_LINE);
            }
            file.flush();
            file.close();
        } catch (IOException e) {
            System.out.print(e.getMessage());
        }
    }
}
