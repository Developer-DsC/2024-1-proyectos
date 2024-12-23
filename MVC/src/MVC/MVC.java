package MVC;

import Controlador.CONTROLADOR;
import Modelo.MODELO;
import Vista.VISTA;

/**
 *
 * @author Dalton
 */
public class MVC {
    public static void main (String[]args){
    MODELO mod = new MODELO();
    VISTA  vis = new VISTA();
    CONTROLADOR contrl = new CONTROLADOR(vis, mod);
    
    contrl.iniciar();
    vis.setVisible(true);
    }
}
