package Controlador;

import Entidades.LO_Empresa_Electrica;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dalton
 */
public class TL_Empresa_Electrica {

    public static List<LO_Empresa_Electrica> ListaElectrica = new ArrayList<LO_Empresa_Electrica>();

    public static void Insert(LO_Empresa_Electrica op) {
        ListaElectrica.add(op);
    }

    public static void Edit(LO_Empresa_Electrica op, int pos) {
        ListaElectrica.set(pos, op);
    }

    public static void Delete(int pos) {
        ListaElectrica.remove(pos);
    }

    public static int Search(String usu) {
        int pos = -1;
        for (int i = 0; i < ListaElectrica.size(); i++) {
            if (ListaElectrica.get(i).getNumeroUsu().equals(usu)) {
                pos = i;
                break;
            }
        }
        return pos;

    }

    public static LO_Empresa_Electrica getEmpresaElectrica(int pos) {
        return ListaElectrica.get(pos);
    }

    public static DefaultTableModel MostrarTabla() {
        String[] Columnas = {"Usuario", "Zona", "Tipo", "Costo KW", "Consumo KW", "Total a pagar"};
        String[] Datos = new String[6];
        DefaultTableModel dt = new DefaultTableModel(null, Columnas);
        
        for (int i = 0; i < ListaElectrica.size(); i++) {
            Datos[0] = ListaElectrica.get(i).getNumeroUsu();
            Datos[1] = ListaElectrica.get(i).getNumeroZon();
            Datos[2] = ListaElectrica.get(i).getTipo();
            Datos[3] = String.valueOf(ListaElectrica.get(i).getCosto());
            Datos[4] = String.valueOf(ListaElectrica.get(i).getConsumo());
            Datos[5] = String.valueOf(ListaElectrica.get(i).Calcular());

            dt.addRow(Datos);
        }
        return dt;
    }

    public static int aZonaMayor() {
        int[] cont = new int[10];
        for (int i = 0; i < ListaElectrica.size(); i++) {
            if (ListaElectrica.get(i).getTipo().equals("Comercial")) {
                int numZona = Integer.parseInt(ListaElectrica.get(i).getNumeroZon());
                cont[numZona - 1]++;
            }
        }
        int zonaMaxComerciales = 0;
        int maxComerciales = cont[0];
        for (int i = 1; i < 10; i++) {
            if (cont[i] > maxComerciales) {
                maxComerciales = cont[i];
                zonaMaxComerciales = i + 1;
            }
        }
        return zonaMaxComerciales;
    }

    public static int bZonaMenor() {
        double[] cons = new double[10];
        boolean[] zona = new boolean[10];
        
        for (int i = 0; i < ListaElectrica.size(); i++) {
            int numZona = Integer.parseInt(ListaElectrica.get(i).getNumeroZon());
            double con = Double.parseDouble(String.valueOf(ListaElectrica.get(i).Calcular()));
            cons[numZona - 1] += con;
            zona[numZona - 1] = true;
        }
        
        int menorz = -1;
        double menor = Double.MAX_VALUE;
        
        for (int i = 0; i < 10; i++) {
            if (zona[i] && cons[i] < menor) {
                menor = cons[i];
                menorz = i + 1;
            }
        }
        return menorz;
    }

    //C
    public static String cMayorUsusario() {
        double may = 0;
        String mayusu = "";
        for (int i = 0; i < ListaElectrica.size(); i++) {
            double consumoKW = ListaElectrica.get(i).Calcular();
            if (consumoKW > may) {
                may = consumoKW;
                mayusu = ListaElectrica.get(i).getNumeroUsu();
            }
        }
        return mayusu;
    }
}
