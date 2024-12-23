package Controlador;

import Entidades.Aviones;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dalton
 */
public class Tlista_Aviones {
  public static List<Aviones> Lista_Aviones = new ArrayList<Aviones>();

    public static void Insertar(Aviones oa) {
        Lista_Aviones.add(oa);
    }

    public static void Modificar(Aviones oa, int pos) {
        Lista_Aviones.set(pos, oa);
    }

    public static void Eliminar(int pos) {
        Lista_Aviones.remove(pos);
    }

    public static int Buscar(int id) {
        int pos = -1;
        for (int i = 0; i < Lista_Aviones.size(); i++) {
            if (Lista_Aviones.get(i).getId()==id) {
                pos = i;
                break;
            }
        }
        return pos;
    }

    public static Aviones getAvion(int pos) {

        return Lista_Aviones.get(pos);
    }
    
    public static int cantidad_personas(int i){
        return Lista_Aviones.get(i).getTercera_edad()+Lista_Aviones.get(i).getAdultos()+Lista_Aviones.get(i).getNiños();
    }
    
    public double combustible(int i){
        double combus=0;
       if(Lista_Aviones.get(i).getDestino().equals("Cuenca-quito")){
           combus=100;
       }
       
       if(Lista_Aviones.get(i).getDestino().equals("Quito-Machala")){
           combus=50;
       }
       
       if(Lista_Aviones.get(i).getDestino().equals("Guayaquil-Quito")){
           combus=25;
       }
       return combus;
    }
    
    
    public static void total_recaudado(int i){
     double total_pagar=0;
       if(Lista_Aviones.get(i).getDestino().equals("Cuenca-quito")){
         double adul=Lista_Aviones.get(i).getAdultos()*200;
         double descuento1 = (Lista_Aviones.get(i).getTercera_edad()*200)*0.4;
         double tercera=Lista_Aviones.get(i).getTercera_edad()*200-descuento1;
         double descuento2=(Lista_Aviones.get(i).getNiños()*200)*0.5;
         double niñ= Lista_Aviones.get(i).getNiños()*200-descuento2;
       }
       
       if(Lista_Aviones.get(i).getDestino().equals("Quito-Machala")){
         double adul=Lista_Aviones.get(i).getAdultos()*100;
         double descuento1 = (Lista_Aviones.get(i).getTercera_edad()*100)*0.4;
         double tercera=Lista_Aviones.get(i).getTercera_edad()*100-descuento1;
         double descuento2=(Lista_Aviones.get(i).getNiños()*100)*0.5;
         double niñ= Lista_Aviones.get(i).getNiños()*100-descuento2;
       }
       
       if(Lista_Aviones.get(i).getDestino().equals("Guayaquil-Quito")){
         double adul=Lista_Aviones.get(i).getAdultos()*80;
         double descuento1 = (Lista_Aviones.get(i).getTercera_edad()*80)*0.4;
         double tercera=Lista_Aviones.get(i).getTercera_edad()*80-descuento1;
         double descuento2=(Lista_Aviones.get(i).getNiños()*80)*0.5;
         double niñ= Lista_Aviones.get(i).getNiños()*200-descuento2;
       }
    }
    
   public static void total_combustible(int i){
       double combus1=0, combus2=0, combus3=0;
       String amayor="";
       if(Lista_Aviones.get(i).getNombre_avion().equals("Pilatus")){
      
       }
   }
    public static DefaultTableModel Mostrar_tabla() {
        String[] Titulos = {"ID Venta","Nombre del avión","Destino","Cantidad Tercera edad","Cantidad Adultos","Cantidad niños","Cantidad total personas","Total recaudado"};
        String[] Datos = new String[8];
        DefaultTableModel dt = new DefaultTableModel(null, Titulos);
        for (int i = 0; i < Lista_Aviones.size(); i++) {
            Datos[0] = String.valueOf(Lista_Aviones.get(i).getId());
            Datos[1] = Lista_Aviones.get(i).getNombre_avion();
            Datos[2] = Lista_Aviones.get(i).getDestino(); 
            Datos[3] = String.valueOf(Lista_Aviones.get(i).getTercera_edad());
            Datos[4] = String.valueOf(Lista_Aviones.get(i).getAdultos());
            Datos[5] = String.valueOf(Lista_Aviones.get(i).getNiños());
            Datos[6] = String.valueOf(cantidad_personas(i));
            Datos[7] = String.valueOf(Lista_Aviones.get(i).getTercera_edad());
            dt.addRow(Datos);
        }
        return dt;
    }
}  
