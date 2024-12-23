package Controlador;

/**
 *
 * @author Dalton
 */
import Entidades.LO_Venta_Boletos;
import Formularios.frm_Admin_LO_Venta_Boletos;
import static Formularios.frm_Admin_LO_Venta_Boletos.tbl_1;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TL_Venta_Boletos {

    public static List<LO_Venta_Boletos> ListaBoleteria = new ArrayList<LO_Venta_Boletos>();
    //Ingreso de datos

    public static void Insertar(LO_Venta_Boletos ovb) {
        ListaBoleteria.add(ovb);
    }

    public static void Modificar(int pos, LO_Venta_Boletos ovb) {
        ListaBoleteria.set(pos, ovb);
    }

    public static void Eliminar(int pos) {
        ListaBoleteria.remove(pos);
    }

    public static int Buscar(String id) {
        int pos = -1;
        for (int i = 0; i < ListaBoleteria.size(); i++) {
            if (ListaBoleteria.get(i).getIdVenta().equals(id)) {
                pos = i;
                break;
            }
        }
        return pos;
    }

    public static DefaultTableModel MostrarBoleteria() {
        String[] Columnas = {"IdVenta", "Compañía", "Destino", "Cantidad de Boletos", "Servicio"};
        String[] Datos = new String[5];
        DefaultTableModel dt = new DefaultTableModel(null, Columnas);

        for (int i = 0; i < ListaBoleteria.size(); i++) {
            Datos[0] = ListaBoleteria.get(i).getIdVenta();
            Datos[1] = ListaBoleteria.get(i).getCompañia();
            Datos[2] = ListaBoleteria.get(i).getDestino();
            Datos[3] = String.valueOf(ListaBoleteria.get(i).getCantidad_boletos());
            Datos[4] = String.valueOf(ListaBoleteria.get(i).getServicio());
            dt.addRow(Datos);
        }

        return dt;
    }

    public static void calcular() {
        int fila = tbl_1.getSelectedRow();
        double st = 0;
        double descuento = 0;
        String cantaux = "";
        String compañia = "";
        String destino = "";
        double cantidad_boletos = 0;
        String servicio = "";

        for (int i = 0; i < ListaBoleteria.size(); i++) {

            compañia = (String) tbl_1.getValueAt(fila, 1);
            destino = (String) tbl_1.getValueAt(fila, 2);
            cantaux = (String) tbl_1.getValueAt(fila, 3);
            cantidad_boletos=Double.parseDouble(cantaux);
            servicio = (String) tbl_1.getValueAt(fila, 4);

            if (compañia.equals("Rutas Orenses")) {
                System.out.println("Compiló if Rutas Orenses");

                if (destino.equals("Quito")) {
                    st = 20 * cantidad_boletos;
                    System.out.println("\nCompiló if Quito =" + st);
                }
                if (destino.equals("Cuenca")) {
                    st = 15 * cantidad_boletos;
                    System.out.println("\nCompiló if Cuenca " + st);
                }
                if (destino.equals("Guayaquil")) {
                    st = 30 * cantidad_boletos;
                    System.out.println("\nCompiló if Guayaquiil " + st);
                }
            }

            if (compañia.equals("Cifa")) {
                if (destino.equals("Quito")) {
                    st = 22 * cantidad_boletos;
                }
                if (destino.equals("Cuenca")) {
                    st = 16.50 * cantidad_boletos;
                }
                if (destino.equals("Guayaquil")) {
                    st = 33 * cantidad_boletos;
                }
            }

            if (compañia.equals("Calderon")) {
                if (destino.equals("Quito")) {
                    st = 24 * cantidad_boletos;
                }
                if (destino.equals("Cuenca")) {
                    st = 18 * cantidad_boletos;
                }
                if (destino.equals("Guayaquil")) {
                    st = 36 * cantidad_boletos;
                }
            }

            if (cantidad_boletos >= 5) {
                descuento = st * 0.15;

                st = st - descuento;
            }

            if (servicio.equals("Diferencial")) {
                st = st + (st * 0.20);
            }
        }
        JOptionPane.showMessageDialog(null, "Cooperativa: " + compañia
                + "\nDestino: " + destino
                + "\nCantidad de boletos: " + cantidad_boletos
                + "\nTipo de tipo de boleto: " + servicio
                + "\nTotal: " + st
                + "\nDescuento aplicado: " + descuento);
    }

    public static LO_Venta_Boletos getVenta(int pos) {
        return ListaBoleteria.get(pos);

    }
}
