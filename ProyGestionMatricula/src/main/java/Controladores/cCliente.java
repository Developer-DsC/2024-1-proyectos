package Controladores;

/**
 * Controlador de Cliente *
 * @author Gabriel Abreu
 * @date 2023/02/28
 * @version 1.0
 */

import Modelos.Cliente;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.table.DefaultTableModel;

public class cCliente {

    //arreglo dinamico de objetos. Arraylist es una coleccion predefinida en JAVA
    ArrayList<Cliente> Lista = new ArrayList<>();
    

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
     * Registra un nuevo cliente
     *
     * @param e
     * @throws java.io.IOException
     */
    public void nuevo(Cliente e) throws IOException {
        int pos = localizar(e.Cedula);
        if (pos == -1) {//si cedula no esta registrada, se agrega nuevo estudiante
            Lista.add(e);
        } else {
            throw new RuntimeException("# de Cedula ya asignado a otro cliente");
        }
    }

    /**
     * Modificar datos de un cliente existente
     *
     * @param e
     * @param ced
     * @throws java.io.IOException
     */
    public void modificar(Cliente e, String ced) throws IOException {
        int pos = localizar(ced);
        if (pos > -1) {//si cliente esta registrado se modifica
            Lista.set(pos, e);
        } else {
            throw new RuntimeException("No existe un cliente registrado con la cedula ingresada");
        }
    }

    /**
     * Eliminar un cliente
     *
     * @param cedula
     * @throws java.io.IOException
     */
    public void eliminar(String cedula) throws IOException {
        int pos = localizar(cedula);
        if (pos > -1) {//si Cliente esta registrado se elimina
            Lista.remove(pos);
        } else {
            throw new RuntimeException("No existe un Cliente registrado con la cedula ingresada");
        }
    }

    /**
     * Lista datos en un defaultablemodel para presentar en una tabla
     *
     * @return
     */
    public DefaultTableModel getTabla() {
        //encabezados de columnas de la tabla
        
        String[] columnName = {"No.", "Cedula", "Nombre", "Apellido", "Telefono", "Email", "Nacionalidad", "Año"};        
        DefaultTableModel tabla = new DefaultTableModel(columnName, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        for (int i = 0; i < Lista.size(); i++) {
            Cliente e = getCliente(i);
            Object[] row = {(i + 1), e.Cedula, e.Nombre, e.Apellido, e.Telefono,e.Email, e.Nacionalidad, e.Año};
            tabla.addRow(row);
        }
        return tabla;
    }

    /**
     * Algoritmo de busqueda secuencial en el arreglo Lista
     *
     * @param cedula
     * @return posicion en el arreglo del cliente encontrado
     */
    public int localizar(String cedula) {
        int pos = -1; //se retorna -1 si no se encuentra en el arreglo
        for (int i = 0; i < Count(); i++) {
            Cliente e = getCliente(i);
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
     * @return cCliente
     * @throws IOException
     */
    public cCliente buscar_Cedula(String cedula) throws IOException {
        cCliente ob = new cCliente();
        for (int i = 0; i < Count(); i++) {
            Cliente e = getCliente(i);
            if (e.Cedula.toLowerCase().contains(cedula.toLowerCase())) {
                ob.nuevo(e);
            }
        }
        return ob;
    }

    /**
     * Algoritmo de busqueda secuencial mediante criterio Nombre parcial en el
     * arreglo Lista
     *
     * @param Nombre
     * @return cCliente
     * @throws IOException
     */
    public cCliente buscar_Nombre(String Nombre) throws IOException {
        cCliente ob = new cCliente();
        for (int i = 0; i < Count(); i++) {
            Cliente e = getCliente(i);
            if (e.Nombre.toLowerCase().contains(Nombre.toLowerCase())) {
                ob.nuevo(e);
            }
        }
        return ob;
    }
    
     /**
     * Algoritmo de busqueda secuencial mediante criterio Apellido parcial en el
     * arreglo Lista
     *
     * @param Apellido
     * @return cCliente
     * @throws IOException
     */
    public cCliente buscar_Apellido(String Apellido) throws IOException {
        cCliente ob = new cCliente();
        for (int i = 0; i < Count(); i++) {
            Cliente e = getCliente(i);
            if (e.Apellido.toLowerCase().contains(Apellido.toLowerCase())) {
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
    public Cliente getCliente(int pos) {
        Cliente ob = null;
        if (pos >= 0 && pos < Count()) {
            ob = Lista.get(pos);
        }
        return ob;
    }

    public static final String SEPARADOR = ";";
    public static final String QUOTE = "\"";
    //nombre del archivo csv
    public String path = Global.getPath() + "\\Data\\dataCliente.csv";

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
                Cliente ob = new Cliente();
                
                //Cedula,Nombre, Apellido, Telefono, Email, Nacionalidad,Año
                ob.Cedula = row[0];
                ob.Nombre = row[1];
                ob.Apellido = row[2];
                ob.Telefono = row[3];
                ob.Email = row[4];
                ob.Nacionalidad = row[5];
                ob.Año = row[6];
                
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
            file.append("Nombre").append(SEPARADOR);
            file.append("Apellido").append(SEPARADOR);
            file.append("Telefono").append(SEPARADOR);
            file.append("Email").append(SEPARADOR);
            file.append("Nacionaldiad").append(SEPARADOR);
            file.append("Año").append(NEXT_LINE);
            
//Cedula,Nombre, Apellido, Telefono, Email, Nacionalidad,Año
            for (int i = 0; i < Count(); i++) {
                Cliente ob = (Cliente) Lista.get(i);
                file.append(ob.Cedula).append(SEPARADOR);
                file.append(ob.Nombre).append(SEPARADOR);
                file.append(ob.Apellido).append(SEPARADOR);
                file.append(ob.Telefono).append(SEPARADOR);
                file.append(ob.Email).append(SEPARADOR);
                file.append(ob.Nacionalidad).append(SEPARADOR);
                file.append(ob.Año).append(NEXT_LINE);
            }
            file.flush();
            file.close();
        } catch (IOException e) {
            System.out.print(e.getMessage());
        }
    }
}