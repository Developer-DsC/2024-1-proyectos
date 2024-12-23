package Controlador;
import Entidades.Sueldos;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * @author Joffre Cartuche C
 * @version 1.0
 * @created 23-ago.-2023 20:35:38
 */
public class TLista {

	public static List<Sueldos> ListaEmpleados=new ArrayList<Sueldos>();
	
        public static void Insert(Sueldos os)
        {
           ListaEmpleados.add(os);
	}
	public static int Buscar(int cod)
        {
	    int pos=-1;
            for(int i=0; i < ListaEmpleados.size(); i++)
            {
            if(ListaEmpleados.get(i).getCodigo()==cod)
            {
                pos=i;
                break;
            }
            }
        return pos;
	}

	public static Sueldos getEmpleado(int pos){
	    return ListaEmpleados.get(pos);
	}

	public static DefaultTableModel Visualizar()
        {
	    String[] Columna={"Codigo","Nombre","Antiguedad","Sueldo"};
            String[] Datos= new String[4];
            DefaultTableModel dt= new DefaultTableModel(null,Columna);
            for(int i=0; i< ListaEmpleados.size(); i++)
            {
            Datos[0]= String.valueOf(ListaEmpleados.get(i).getCodigo());
            Datos[1]= ListaEmpleados.get(i).getNombre();
            Datos[2]= String.valueOf(ListaEmpleados.get(i).getAntiguedad());
            Datos[3]= String.valueOf(ListaEmpleados.get(i).getSueldo());
            dt.addRow(Datos);
            }
            return dt;
	}

	public static Sueldos LiteralA()
        {
	    double asueldo=0;int pos=-1;
            for(int i=0; i< ListaEmpleados.size(); i++)
            {
                if(ListaEmpleados.get(i).getSueldo()>asueldo)
                {
                    asueldo=ListaEmpleados.get(i).getSueldo();
                    pos=i;
                    
                }
            }
            return getEmpleado(pos);
	}

	public static double LiteralB()
        {
	    
            int c=0,as=0;
            for(int i=0; i< ListaEmpleados.size(); i++)
            {
                if(ListaEmpleados.get(i).getSueldo()>500)
                {
                    as= as + ListaEmpleados.get(i).getAntiguedad();
                    c=c+1;
                }
            }
            if(c==0)
            {
                c=1;
            }
            return as/c;
           
	}

}