/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CONTROLADOR;

import ENTIDADES.ASAMBLEISTA;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class LISTAASAMBLEISTA {
    public static List<ASAMBLEISTA> ListaAsambleista = new ArrayList<ASAMBLEISTA>();
    
    
    public static void Insertar(ASAMBLEISTA asam){
        ListaAsambleista.add(asam);
    }
    
    public static void Actualizar(ASAMBLEISTA asam, int pos){
        ListaAsambleista.set(pos, asam);
    }
    
    public static void Eliminar(int pos){
        ListaAsambleista.remove(pos);
    }
    
    public static int Buscar(String ced) {
        int pos = 0;
        for (int i = 1; i<ListaAsambleista.size(); i++){
        if (ListaAsambleista.get(i).getCedula().equals(ced)) {
            pos = i;
            break;
        }
    }
        return pos;
    }
    
    public static ASAMBLEISTA getAsambleista(int pos){
        return ListaAsambleista.get(pos);
    }
    
    public static DefaultTableModel MostrarTablaAsambleista() {
        String[] Columnas = {"ID COdigo", "Cedula", "Nombre", "Apellido", "Edad", "Tipo", "Sueldo"};
        String[] Datos = new String[7];
        DefaultTableModel dt = new DefaultTableModel(null, Columnas);
        for (int i = 0; i < ListaAsambleista.size(); i++) {
            Datos[0] = ListaAsambleista.get(i).getIdCodigo();
            Datos[1] = ListaAsambleista.get(i).getCedula();
            Datos[2] = ListaAsambleista.get(i).getNombre();
            Datos[3] = ListaAsambleista.get(i).getApellido();
            Datos[4] = ListaAsambleista.get(i).getEdad()+"";
            Datos[5] = ListaAsambleista.get(i).getTipo();
            Datos[6] = ListaAsambleista.get(i).Sueldo()+"";
            
            dt.addRow(Datos);
        }
        return dt;
    }
    
    //TOTAL RECAUDADO
    
    public static String Recaudadofijo() {
        
        double totalfijo = 0;
        
        for (int i = 0; i < ListaAsambleista.size(); i++) {
            
            totalfijo = totalfijo + ListaAsambleista.get(i).Sueldo();
            
        }
        
        return "El total recaudado por los trabajadores en ventas es de "+totalfijo+" dolares";
    }
    
    public static String MayorFijo() {
        
        double mayor = 0;
        String nom = "";
        String ced = "";
        
        for (int i = 0; i < ListaAsambleista.size(); i++) {
            
            if (ListaAsambleista.get(i).Sueldo() > mayor) {
                mayor = ListaAsambleista.get(i).Sueldo();
                nom = ListaAsambleista.get(i).getNombre();
                ced = ListaAsambleista.get(i).getCedula();
            } 
            
        }
        
        return "El empleado con mayor sueldo es de un trabajador fijo de nombre "+nom+" con numero de cedula"
                +ced;
    }
    
}
