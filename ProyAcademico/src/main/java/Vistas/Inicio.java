package Vistas;

import Controladores.Global;
import Controladores.cEstudiante;
import java.io.IOException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author berth
 */
public class Inicio {
    public static void main(String[] args) throws IOException{
        //System.out.println(Global.getPath());
        /*cEstudiante lis =new cEstudiante();
        try {
            lis.leer();
        } catch (IOException ex) {
            System.out.println("Error de lectura de archivo");
        }*/
        //lis.nuevo(new Estudiante("071111111","Garcìa","Leo", "Masculino","Machala","Leonardo", "Amanda"));
        //lis.guardar();
        
        frmPrincipal frm =new frmPrincipal();
	frm.setVisible(true);
    }
}
