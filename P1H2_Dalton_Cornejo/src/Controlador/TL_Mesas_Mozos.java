package Controlador;

import Entidades.LO_Mesas_Mozos;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dalton
 */
public class TL_Mesas_Mozos {

    public static List<LO_Mesas_Mozos> ListaRestaurante = new ArrayList<LO_Mesas_Mozos>();

    public static void Insertar(LO_Mesas_Mozos om) {
        ListaRestaurante.add(om);
    }

    public static void Modificar(int pos, LO_Mesas_Mozos om) {
        ListaRestaurante.set(pos, om);
    }

    public static void Eliminar(int pos) {
        ListaRestaurante.remove(pos);
    }

    public static int Buscar(int id) {
        int pos = -1;
        for (int i = 0; i < ListaRestaurante.size(); i++) {
            if (ListaRestaurante.get(i).getIDventa() == id) {
                pos = i;
                break;
            }
        }
        return pos;

    }

    //Ingreso de datos
    public static DefaultTableModel MostrarRestaruante() {
        String[] Columnas = {"ID Venta", "Mesero", "Número de Mesa", "Importe", "Cantidad de Personas"};
        String[] Datos = new String[5];
        DefaultTableModel dt = new DefaultTableModel(null, Columnas);

        for (int i = 0; i < ListaRestaurante.size(); i++) {
            Datos[0] = String.valueOf(ListaRestaurante.get(i).getIDventa());
            Datos[1] = ListaRestaurante.get(i).getNombre_mozo();
            Datos[2] = String.valueOf(ListaRestaurante.get(i).getNumero_mesa());
            Datos[3] = String.valueOf(ListaRestaurante.get(i).getImporte());
            Datos[4] = String.valueOf(ListaRestaurante.get(i).getCantidad());
            dt.addRow(Datos);
        }
        return dt;
    }

    public static void CantidadPersonaAtendidas() {
        int ctd_moso1 = 0, ctd_moso2 = 0, ctd_moso3 = 0;
        for (int i = 0; i < ListaRestaurante.size(); i++) {
            if (ListaRestaurante.get(i).getNombre_mozo().equals("Dalton")) {
                ctd_moso1 = ctd_moso1 + ListaRestaurante.get(i).getCantidad();
            }

            if (ListaRestaurante.get(i).getNombre_mozo().equals("Carlos")) {
                ctd_moso2 = ctd_moso2 + ListaRestaurante.get(i).getCantidad();
            }

            if (ListaRestaurante.get(i).getNombre_mozo().equals("Nayib")) {
                ctd_moso3 = ctd_moso3 + ListaRestaurante.get(i).getCantidad();
            }
        }

        JOptionPane.showMessageDialog(null, "La cantidad de personas atendidas: "
                + "\nDalton : " + ctd_moso1
                + "\nCarlos: " + ctd_moso2
                + "\nNayib: " + ctd_moso3);
    }

    public static void RecaudacionMosos() {

        double ctd_moso1 = 0, ctd_moso2 = 0, ctd_moso3 = 0;
        for (int i = 0; i < ListaRestaurante.size(); i++) {
            if (ListaRestaurante.get(i).getNombre_mozo().equals("Dalton")) {
                ctd_moso1 = ctd_moso1 + ListaRestaurante.get(i).getImporte();
            }

            if (ListaRestaurante.get(i).getNombre_mozo().equals("Carlos")) {
                ctd_moso2 = ctd_moso2 + ListaRestaurante.get(i).getImporte();
            }

            if (ListaRestaurante.get(i).getNombre_mozo().equals("Nayib")) {
                ctd_moso3 = ctd_moso3 + ListaRestaurante.get(i).getImporte();
            }
        }

        JOptionPane.showMessageDialog(null, "Total recaudado por los 3 mosos: "
                + "\nDalton : " + ctd_moso1
                + "\nCarlos: " + ctd_moso2
                + "\nNayib: " + ctd_moso3);
    }

    public static void Mayorimporte() {
        double impog = 0, impol = 0, impoly = 0, amayor = 0;
        int n = 0, cantpg = 0, cantpl = 0, cantply = 0, amesa = 0;

        for (int i = 0; i < ListaRestaurante.size(); i++) {
            if (ListaRestaurante.get(i).getNombre_mozo().equals("Dalton")) {
                cantpg = cantpg + ListaRestaurante.get(i).getCantidad();
                impog = impog + ListaRestaurante.get(i).getImporte();
                System.out.print("compiló selec 1 : " + cantpg + " : " + impog);
            }

            if (ListaRestaurante.get(i).getNombre_mozo().equals("Carlos")) {
                cantpl = cantpl + ListaRestaurante.get(i).getCantidad();
                impol = impol + ListaRestaurante.get(i).getImporte();
                System.out.print("compiló selec 2");
            }

            if (ListaRestaurante.get(i).getNombre_mozo().equals("Nayib")) {
                cantply = cantply + ListaRestaurante.get(i).getCantidad();
                impoly = impoly + ListaRestaurante.get(i).getImporte();

                System.out.print("compiló selec 3");
            }

            if (ListaRestaurante.get(i).getImporte() > amayor) {
                amayor = ListaRestaurante.get(i).getImporte();
                amesa = ListaRestaurante.get(i).getNumero_mesa();
                System.out.print("compiló selec 4");
            }
        }

        JOptionPane.showMessageDialog(null, "Mesa con mayor importe:"
                + "\nMesa con mayor recaudo es la mesa: " + amesa
                + "\nRecaudó: " + amayor);
    }

    public static void TotalComieronPersonas() {
        int ctd_moso1 = 0, ctd_moso2 = 0, ctd_moso3 = 0;
        for (int i = 0; i < ListaRestaurante.size(); i++) {
            if (ListaRestaurante.get(i).getNumero_mesa() == 1) {
                ctd_moso1 = ctd_moso1 + ListaRestaurante.get(i).getCantidad();
            }

            if (ListaRestaurante.get(i).getNumero_mesa() == 2) {
                ctd_moso2 = ctd_moso2 + ListaRestaurante.get(i).getCantidad();
            }

            if (ListaRestaurante.get(i).getNumero_mesa() == 3) {
                ctd_moso3 = ctd_moso3 + ListaRestaurante.get(i).getCantidad();
            }
        }

        JOptionPane.showMessageDialog(null, "La cantidad de personas atendidas: "
                + "\nMesa 1 : " + ctd_moso1
                + "\nMesa 2: " + ctd_moso2
                + "\nMesa 3: " + ctd_moso3
                + "\nTotal: " + (ctd_moso1 + ctd_moso2 + ctd_moso3));

    }

    public static void menor_mozo() {
        int ctd_moso1 = 0, ctd_moso2 = 0, ctd_moso3 = 0;
        for (int i = 0; i < ListaRestaurante.size(); i++) {
            if (ListaRestaurante.get(i).getNumero_mesa() == 1) {
                ctd_moso1 = ctd_moso1 + ListaRestaurante.get(i).getCantidad();
            }

            if (ListaRestaurante.get(i).getNumero_mesa() == 2) {
                ctd_moso2 = ctd_moso2 + ListaRestaurante.get(i).getCantidad();
            }

            if (ListaRestaurante.get(i).getNumero_mesa() == 3) {
                ctd_moso3 = ctd_moso3 + ListaRestaurante.get(i).getCantidad();
            }
        }
        if (ctd_moso1 < ctd_moso2 && ctd_moso1 < ctd_moso3) {
            JOptionPane.showMessageDialog(null, "El número de mesa del mozo que atendio menos personas es: "
                    + "\nMozo: Dalton");
        }

        if (ctd_moso2 < ctd_moso1 && ctd_moso2 < ctd_moso3) {
            JOptionPane.showMessageDialog(null, "El número de mesa del mozo que atendio menos personas es: "
                    + "\nMozo: Carlos");
        }

        if (ctd_moso3 < ctd_moso2 && ctd_moso3 < ctd_moso1) {
            JOptionPane.showMessageDialog(null, "El número de mesa del mozo que atendio menos personas es: "
                    + "\nMozo: Nayib");
        }

        if (ctd_moso1 == ctd_moso2 && ctd_moso1 == ctd_moso3) {
            JOptionPane.showMessageDialog(null, "Todos los mozos atendieron a la misma cantidad de personas");
        }
    }

    public static void Porcentaje() {

        double sumimp = 0, porg = 0, porl = 0, porly = 0, impog = 0, impol = 0, impoly = 0, amayor = 0;
        int n = 0, cantpg = 0, cantpl = 0, cantply = 0, amesa = 0;

        for (int i = 0; i < ListaRestaurante.size(); i++) {
            if (ListaRestaurante.get(i).getNombre_mozo().equals("Dalton")) {
                cantpg = cantpg + ListaRestaurante.get(i).getCantidad();
                impog = impog + ListaRestaurante.get(i).getImporte();
                System.out.print("compiló selec 1 : " + cantpg + " : " + impog);
            }

            if (ListaRestaurante.get(i).getNombre_mozo().equals("Carlos")) {
                cantpl = cantpl + ListaRestaurante.get(i).getCantidad();
                impol = impol + ListaRestaurante.get(i).getImporte();
                System.out.print("compiló selec 2");
            }

            if (ListaRestaurante.get(i).getNombre_mozo().equals("Nayib")) {
                cantply = cantply + ListaRestaurante.get(i).getCantidad();
                impoly = impoly + ListaRestaurante.get(i).getImporte();

                System.out.print("compiló selec 3");
            }

            sumimp = impog + impol + impoly;
            porg = impog * 100 / sumimp;
            porl = impol * 100 / sumimp;
            porly = impoly * 100 / sumimp;

        }
        JOptionPane.showMessageDialog(null, "El total recaudado es : $" + sumimp
                + "\nPorcentaje de recaudación por Dalton: " + porg + "%"
                + "\nPorcentaje de recaudación por Carlos: " + porl + "%"
                + "\nPorcentaje de recaudación por Nayib: " + porly + "%");
    }

    public static void Menor50() {
        int impora = 0;
        for (int i = 0; i < ListaRestaurante.size(); i++) {
            if (ListaRestaurante.get(i).getImporte() < 50) {
                impora++;
            }
        }
        JOptionPane.showMessageDialog(null, "El número de cuentas con un impuesto menor de 50 es: " + impora);

    }

    public static LO_Mesas_Mozos getMesa(int pos) {
        return ListaRestaurante.get(pos);
    }
}
