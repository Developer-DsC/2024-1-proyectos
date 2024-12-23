/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CONTROLADOR;

import ENTIDADES.SENADOR;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class LISTASENADOR {
    public static List<SENADOR> ListaSenador = new ArrayList<SENADOR>();
    
    
    public static void Insertar(SENADOR sena){
        ListaSenador.add(sena);
    }
    
    public static void Actualizar(SENADOR sena, int pos){
        ListaSenador.set(pos, sena);
    }
    
    public static void Eliminar(int pos){
        ListaSenador.remove(pos);
    }
    
    public static int Buscar(String ced) {
        int pos = 0;
        for (int i = 1; i<ListaSenador.size(); i++){
        if (ListaSenador.get(i).getCedula().equals(ced)) {
            pos = i;
            break;
        }
    }
        return pos;
    }
    
    public static SENADOR getFijo(int pos){
        return ListaSenador.get(pos);
    }
    
    public static DefaultTableModel MostrarTablaFijo() {
        String[] Columnas = {"Cedula", "Nombre", "Apellido", "Edad", "Sexo", "Tipo", "Sueldo"};
        String[] Datos = new String[7];
        DefaultTableModel dt = new DefaultTableModel(null, Columnas);
        for (int i = 0; i < ListaSenador.size(); i++) {
            Datos[0] = ListaSenador.get(i).getIdCodigo();
            Datos[1] = ListaSenador.get(i).getCedula();
            Datos[2] = ListaSenador.get(i).getNombre();
            Datos[3] = ListaSenador.get(i).getApellido();
            Datos[4] = ListaSenador.get(i).getEdad()+"";
            Datos[5] = ListaSenador.get(i).getTipo();
            Datos[6] = ListaSenador.get(i).Sueldo()+"";
            
            dt.addRow(Datos);
        }
        return dt;
    }
    
    //TOTAL RECAUDADO
    
    public static String Recaudadofijo() {
        
        double totalfijo = 0;
        
        for (int i = 0; i < ListaSenador.size(); i++) {
            
            totalfijo = totalfijo + ListaSenador.get(i).Sueldo();
            
        }
        
        return "El total recaudado por los trabajadores en ventas es de "+totalfijo+" dolares";
    }
    
    public static String MayorFijo() {
        
        double mayor = 0;
        String nom = "";
        String ced = "";
        
        for (int i = 0; i < ListaSenador.size(); i++) {
            
            if (ListaSenador.get(i).Sueldo() > mayor) {
                mayor = ListaSenador.get(i).Sueldo();
                nom = ListaSenador.get(i).getNombre();
                ced = ListaSenador.get(i).getCedula();
            } 
            
        }
        
        return "El empleado con mayor sueldo es de un trabajador fijo de nombre "+nom+" con numero de cedula"
                +ced;
    }
}
