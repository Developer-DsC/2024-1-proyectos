package Controlador;

import Entidades.LO_Ingreso_Universidad;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dalton
 */
public class TL_Ingreso_Universidad {
    public static List<LO_Ingreso_Universidad> ListaEstudiante = new ArrayList<LO_Ingreso_Universidad>();
    
    
    
    public static void Insertar(LO_Ingreso_Universidad op) {
        ListaEstudiante.add(op);
    }
    
    public static void Modificar(int pos, LO_Ingreso_Universidad op){
        ListaEstudiante.set(pos, op);
    }
    
    public static void Eliminar(int pos){
        ListaEstudiante.remove(pos);
    }

    public static int Buscar(int id) {
        int pos = -1;
        for (int i = 0; i < ListaEstudiante.size(); i++) {
            if (ListaEstudiante.get(i).getId()==id) {
                pos = i;
                break;
            }
        }
        return pos;

    }
    
    public static LO_Ingreso_Universidad getEstudiante(int pos) {
        return ListaEstudiante.get(pos);
    }

   
    
    public static DefaultTableModel VisualizarLista() {
        String[] Columna = {"ID","Universidad", "CodUniversidad", "Nombre","Legajo", "puntaje"};
        String[] Datos = new String[6];
        DefaultTableModel dt = new DefaultTableModel(null, Columna);
        for (int i = 0; i < ListaEstudiante.size(); i++) {
            Datos[0] = String.valueOf(ListaEstudiante.get(i).getId());
            Datos[1] = ListaEstudiante.get(i).getUniversidad();
            Datos[2] = String.valueOf(ListaEstudiante.get(i).getCodUniversidad());
            Datos[3] = String.valueOf(ListaEstudiante.get(i).getNombre());
            Datos[4] = String.valueOf(ListaEstudiante.get(i).getLegajo());
            Datos[5] = String.valueOf(ListaEstudiante.get(i).getPuntaje());
            dt.addRow(Datos);
        }
        return dt;
    }
    
    //promedio de cada universidad
    public static void Promedio()
    {
        double promedio1=0,promedio2=0,promedio3=0;
        double acum1=0,acum2=0,acum3=0;
        int contador1=0,contador2=0,contador3=0;
        for (int i = 0; i < ListaEstudiante.size(); i++) {
           if(ListaEstudiante.get(i).getUniversidad().equals("Utmach"))
           {
               acum1+=ListaEstudiante.get(i).getPuntaje();
               contador1++;
           }
           if(ListaEstudiante.get(i).getUniversidad().equals("Unatch"))
           {
               acum2+=ListaEstudiante.get(i).getPuntaje();
               contador2++;
           }
           if(ListaEstudiante.get(i).getUniversidad().equals("USFQ"))
           {
               acum3+=ListaEstudiante.get(i).getPuntaje();
               contador3++;
           }
        }
        
        JOptionPane.showMessageDialog(null, "Estudiantes de Utmach "+"\n"+
                                            "Cantidad estudiantes: " + contador1+"\n"+
                "Suma de las notas d los estudiantes: " + acum1+"\n"+
                "Prom de la uni: " + acum1/contador1);
        JOptionPane.showMessageDialog(null, "Estudiantes de Unatch "+"\n"+
                                            "Cantidad estudiantes: " + contador2+"\n"+
                "Suma de las notas d los estudiantes: " + acum2+"\n"+
                "Prom de la uni: " + acum2/contador2);
        JOptionPane.showMessageDialog(null, "Estudiantes de USFQ "+"\n"+
                                            "Cantidad estudiantes: " + contador3+"\n"+
                "Suma de las notas d los estudiantes: " + acum3+"\n"+
                "Prom de la uni: " + acum3/contador3);
        
    }
}
