package Controlador;

import Modelo.MODELO;
import Vista.VISTA;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author Dalton
 */

public class CONTROLADOR implements ActionListener {
    
   private VISTA view;
   
   private MODELO model;

    public CONTROLADOR(VISTA view, MODELO model) {
        
        this.view = view;
        
        this.model = model;
        
        this.view.btn_resultado.addActionListener(this);
    }
    
    public void iniciar() {
    view.setTitle("MVC multiplicar");
    view.setLocationRelativeTo(null);
    }
    
    /**
     *
     * @param e
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        model.setNumero1(Integer.parseInt(view.txt1.getText()));
        
        model.setNumero2(Integer.parseInt(view.txt2.getText()));
        
        model.multiplicar();
     
        view.txtresultado.setText(String.valueOf(model.getResultado()));
    }
}