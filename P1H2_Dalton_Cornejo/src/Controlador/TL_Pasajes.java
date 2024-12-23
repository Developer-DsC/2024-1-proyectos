package Controlador;

import Entidades.LO_Pasajes;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dalton
 */
public class TL_Pasajes {

    public static List<LO_Pasajes> Lista = new ArrayList<LO_Pasajes>();

    public static void Insert(LO_Pasajes op) {
        Lista.add(op);
    }

    public static void Delete(int pos) {
        Lista.remove(pos);
    }

    public static void Edit(LO_Pasajes op, int pos) {
        Lista.set(pos, op);
    }

    public static int Search(String num) {

        int pos = -1;
        for (int i = 0; i < Lista.size(); i++) {
            if (Lista.get(i).getTicket().equals(num)) {
                pos = i;
                break;
            }
        }
        return pos;
    }

    public static LO_Pasajes getPasajes(int pos) {
        return Lista.get(pos);
    }

    public static DefaultTableModel Visualizar() {
        String[] Columnas = {"Ticket", "Destino", "Clase", "Cantidad", "Total a pagar"};
        String[] Datos = new String[5];
        DefaultTableModel dt = new DefaultTableModel(null, Columnas);

        for (int i = 0; i < Lista.size(); i++) {

            Datos[0] = Lista.get(i).getTicket();
            Datos[1] = Lista.get(i).getDestino();
            Datos[2] = Lista.get(i).getClase();
            Datos[3] = String.valueOf(Lista.get(i).getCantidad());
            Datos[4] = String.valueOf(Lista.get(i).Calcular());

            dt.addRow(Datos);
        }
        return dt;
    }

    public static void aDestino() {
        String cdes = JOptionPane.showInputDialog(null, "Digite un Destino");
        double candes = 0;

        for (int i = 0; i < Lista.size(); i++) {
            if (Lista.get(i).getDestino().equals(cdes)) {
                candes = candes + Lista.get(i).getCantidad();
            }
        }
        JOptionPane.showMessageDialog(null, "Destino: " + cdes + "\n"
                + "Cantidad de Pasajes: " + candes);
    }

    public static void bRecaudacion() {
        double totalC = 0, totalD = 0;

        for (int i = 0; i < Lista.size(); i++) {
            if (Lista.get(i).getClase().equals("Comun")) {
                totalC = totalC + Lista.get(i).Calcular();
            }
            if (Lista.get(i).getClase().equals("Diferencial")) {
                totalD = totalD + Lista.get(i).Calcular();
            }
        }

        JOptionPane.showMessageDialog(null, "Total recaudado por la clase Comun: " + totalC + "\n"
                + "Total recaudado por la clase diferencial: " + totalD);
    }

    public static void cMayorImporte() {
        double mayor = 0;
        String mayortTicket = null;
        for (int i = 0; i < Lista.size(); i++) {

            if (Lista.get(i).Calcular() > mayor) {
                mayor = Lista.get(i).Calcular();
                mayortTicket = Lista.get(i).getTicket();
            }
        }
        JOptionPane.showMessageDialog(null, "El ticket con mayor importe es: " + mayortTicket + "con un importe de: " + mayor);
    }

    public static void dTotalPasajes() {
        double totalC = 0, totalD = 0;

        for (int i = 0; i < Lista.size(); i++) {
            if (Lista.get(i).getClase().equals("Comun")) {
                totalC = totalC + Lista.get(i).getCantidad();
            }
            if (Lista.get(i).getClase().equals("Diferencial")) {
                totalD = totalD + Lista.get(i).getCantidad();
            }
        }

        JOptionPane.showMessageDialog(null, "Total de pasajes para la clase Comun: " + totalC + "\n"
                + "Total recaudado por la clase diferencial: " + totalD);
    }

    public static void eTotalPasajes() {
        String mayordes = null;
        double sumaM = 0, sumaN = 0, sumaC = 0, maysuma = 0;

        for (int i = 0; i < Lista.size(); i++) {
            if (Lista.get(i).getDestino().equals("Mendoza")) {
                sumaM = sumaM + Lista.get(i).Calcular();
            }
            if (Lista.get(i).getDestino().equals("Neuquen")) {
                sumaN = sumaN + Lista.get(i).Calcular();
            }
            if (Lista.get(i).getDestino().equals("Corrientes")) {
                sumaC = sumaC + Lista.get(i).Calcular();
            }

            if (sumaM > sumaN && sumaM > sumaC) {
                maysuma = sumaM;
                mayordes = Lista.get(i).getDestino();
            }

            if (sumaN > sumaM && sumaN > sumaC) {
                maysuma = sumaN;
                mayordes = Lista.get(i).getDestino();
            }

            if (sumaC > sumaN && sumaC > sumaM) {
                maysuma = sumaC;
                mayordes = Lista.get(i).getDestino();
            }
        }

        JOptionPane.showMessageDialog(null, "Destino con mayor recaudacion: " + mayordes + "\n"
                + "Total recaudado por el mayor destino: " + maysuma);
    }

    public static void fPorcentaje() {
        double contt, contpasm = 0, contpasn = 0, contpasc = 0, pm = 0, pn = 0, pc = 0;

        for (int i = 0; i < Lista.size(); i++) {
            if (Lista.get(i).getDestino().equals("Mendoza")) {
                contpasm = contpasm + Lista.get(i).Calcular();
            }
            if (Lista.get(i).getDestino().equals("Neuquen")) {
                contpasn = contpasn + Lista.get(i).Calcular();
            }
            if (Lista.get(i).getDestino().equals("Corrientes")) {
                contpasc = contpasc + Lista.get(i).Calcular();
            }
            contt = contpasm + contpasn + contpasc;
            pm = (contpasm * 100) / contt;
            pn = (contpasn * 100) / contt;
            pc = (contpasc * 100) / contt;
        }

        JOptionPane.showMessageDialog(null, "Porcentaje de Mendoza: " + pm + "\n"
                + "Porcentaje de Neuquen: " + pn + "\n"
                + "Porcentaje de Mendoza: " + pc);
    }

    public static void gDiferencial1() {
        double pas = 0;
        for (int i = 0; i < Lista.size(); i++) {
            if (Lista.get(i).getDestino().equals("Mendoza")) {
                if (Lista.get(i).getClase().equals("Diferencial")) {
                    pas = pas + Lista.get(i).getCantidad();
                }
            }
        }
        JOptionPane.showMessageDialog(null, "Cantidad de pasajes vendidos del destino 1 en clase diferencial: " + pas);

    }
}
