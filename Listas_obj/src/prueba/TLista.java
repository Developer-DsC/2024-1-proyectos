package prueba;

import Entidades.Persona;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Dalton
 */
public class TLista {

    public static void main(String[] args) {
        List<Persona> Lista = new ArrayList<Persona>();

        Persona per1 = new Persona(1, "0706", "naomi", "paredes", "12/02/2004", "divorsiada");
        Persona per3 = new Persona(3, "12345", "angel", "loaiza", "15/06/1991", "Casado");
        Persona per4 = new Persona(4, "123456", "Gabo", "ola", "6/04/2003", "Casado");

       
        
        Lista.add(per1);
        Lista.add(1,new Persona(2, "1223", "Dalton", "Cornejo", "23/04/2003", "Soltero"));
        Lista.add(2, per3);
        
        Lista.set(2,per4);

        
  

        for (int i = 0; i < Lista.size(); i++) {
            JOptionPane.showMessageDialog(null, Lista.get(i).imprimirPersona());
        }
        JOptionPane.showMessageDialog(null, Lista.size());
    }
}
