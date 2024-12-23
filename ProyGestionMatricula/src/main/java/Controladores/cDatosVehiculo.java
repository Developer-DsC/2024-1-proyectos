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
     * Registra un nuevo vehiculo
     *
     * @param e
     * @throws java.io.IOException
     */
    public void nuevo(DatosVehiculo e) throws IOException {
        int pos = localizar(e.placa);
        if (pos == -1) {//si placa no esta registrada, se agrega nuevo registro
            Lista.add(e);
        } else {
            throw new RuntimeException("# de Placa ya asignado a otro vehículo");
        }
    }

    /**
     * Modificar datos de un cliente existente
     *
     * @param e
     * @param placa
     * @throws java.io.IOException
     */
    public void modificar(DatosVehiculo e, String placa) throws IOException {
        int pos = localizar(placa);
        if (pos > -1) {//si placa esta registrado se modifica
            Lista.set(pos, e);
        } else {
            throw new RuntimeException("No existe un vehículo registrado con la placa ingresada");
        }
    }

    /**
     * Eliminar un cliente
     *
     * @param placa
     * @throws java.io.IOException
     */
    public void eliminar(String placa) throws IOException {
        int pos = localizar(placa);
        if (pos > -1) {//si placa esta registrado se elimina
            Lista.remove(pos);
        } else {
            throw new RuntimeException("No existe un vehículo registrado con la placa ingresada");
        }
    }

    /**
     * Lista datos en un defaultablemodel para presentar en una tabla
     *
     * @return
     */
    public DefaultTableModel getTabla() {
        //encabezados de columnas de la tabla
        //cedula placa Cliente año marca modelo cilindraje año_modelo tipo clase toneladas pais_de_origen combustible color_1 color_2
        String[] columnName = {"No.", "Placa", "Marca", "Modelo", "Cilindraje", "Año del modelo", "Tipo", "Clase", "Toneladas", "País de origen", "Combustible", "color 1", "Color 2"};
        DefaultTableModel tabla = new DefaultTableModel(columnName, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        //placa marca modelo cilindraje año_modelo tipo clase toneladas pais_de_origen combustible color_1 color_2
        for (int i = 0; i < Count(); i++) {
            DatosVehiculo e = getDatosVehiculo(i);
            Object[] row = {(i + 1), e.placa, e.marca, e.modelo,
                e.cilindraje, e.año_modelo, e.tipo, e.clase, e.toneladas, e.pais_de_origen, e.combustible, e.color_1, e.color_2};
            tabla.addRow(row);
        }
        return tabla;
    }

    /**
     * Algoritmo de busqueda secuencial en el arreglo Lista
     *
     * @param placa
     * @return posicion en el arreglo del cliente encontrado
     */
    public int localizar(String placa) {
        int pos = -1; //se retorna -1 si no se encuentra en el arreglo
        for (int i = 0; i < Count(); i++) {
            DatosVehiculo e = getDatosVehiculo(i);
            if (placa.equals(e.placa)) {
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
     * @param placa
     * @return cDatosVehiculo
     * @throws IOException
     */
    public cDatosVehiculo buscar_placa(String placa) throws IOException {
        cDatosVehiculo ob = new cDatosVehiculo();
        for (int i = 0; i < Count(); i++) {
            DatosVehiculo e = getDatosVehiculo(i);
            if (e.placa.toLowerCase().contains(placa.toLowerCase())) {
                ob.nuevo(e);
            }
        }
        return ob;
    }

    /**
     * Algoritmo de busqueda secuencial mediante criterio Nombre parcial en el
     * arreglo Lista
     *
     * @param Cliente
     * @return cDatosVehiculo
     * @throws IOException
     */
    public cDatosVehiculo buscar_modelo(String modelo) throws IOException {
        cDatosVehiculo ob = new cDatosVehiculo();
        for (int i = 0; i < Count(); i++) {
            DatosVehiculo e = getDatosVehiculo(i);
            if (e.modelo.toLowerCase().contains(modelo.toLowerCase())) {
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
    public DatosVehiculo getDatosVehiculo(int pos) {
        DatosVehiculo ob = null;
        if (pos >= 0 && pos < Count()) {
            ob = Lista.get(pos);
        }
        return ob;
    }

    public static final String SEPARADOR = ";";
    public static final String QUOTE = "\"";
    //nombre del archivo csv
    public String path = Global.getPath() + "\\Data\\dataDatosVehiculo.csv";

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

                
                ob.placa = row[0];
                ob.marca = row[1];
                ob.modelo = row[2];
                ob.cilindraje = row[3];
                ob.año_modelo = row[4];
                ob.tipo = row[5];
                ob.clase = row[6];
                ob.toneladas = row[7];
                ob.pais_de_origen = row[8];
                ob.combustible = row[9];
                ob.color_1 = row[10];
                ob.color_2 = row[11];

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

//cedula placa Cliente año marca modelo cilindraje año_modelo tipo clase toneladas pais_de_origen combustible color_1 color_2
    public void guardar() throws IOException {
        FileWriter file;
        try {
            file = new FileWriter(path);
            final String NEXT_LINE = "\n";

            file.append("Placa").append(SEPARADOR);
            file.append("Marca").append(SEPARADOR);
            file.append("Modelo").append(SEPARADOR);
            file.append("Cilindraje").append(SEPARADOR);
            file.append("Año del modelo").append(SEPARADOR);
            file.append("Tipo").append(SEPARADOR);
            file.append("Clase").append(SEPARADOR);
            file.append("Toneladas").append(SEPARADOR);
            file.append("País de origen").append(SEPARADOR);
            file.append("Combustible").append(SEPARADOR);
            file.append("Color 1").append(SEPARADOR);
            file.append("Color 2").append(NEXT_LINE);

//Cedula,Nombre, Apellido, Telefono, Email, Nacionalidad,Año
            for (int i = 0; i < Count(); i++) {
                DatosVehiculo ob = (DatosVehiculo) Lista.get(i);

                file.append(ob.placa).append(SEPARADOR);
                file.append(ob.marca).append(SEPARADOR);
                file.append(ob.cilindraje).append(SEPARADOR);
                file.append(ob.modelo).append(SEPARADOR);
                file.append(ob.año_modelo).append(SEPARADOR);
                file.append(ob.tipo).append(SEPARADOR);
                file.append(ob.clase).append(SEPARADOR);
                file.append(ob.toneladas).append(SEPARADOR);
                file.append(ob.pais_de_origen).append(SEPARADOR);
                file.append(ob.combustible).append(SEPARADOR);
                file.append(ob.color_1).append(SEPARADOR);
                file.append(ob.color_2).append(NEXT_LINE); //EL ultimo siempre es Next_line
            }
            file.flush();
            file.close();
        } catch (IOException e) {
            System.out.print(e.getMessage());
        }
    }
}
