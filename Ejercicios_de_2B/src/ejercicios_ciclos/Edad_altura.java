package ejercicios_ciclos;

import javax.swing.JOptionPane;

/**
 *
 * @author Dalton
 */
public class Edad_altura extends javax.swing.JFrame {

    /**
     * Creates new form Edad_personas
     */
    public Edad_altura() {
       n=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la cantidad de personas que desea registrar"));
        initComponents();
        setLocationRelativeTo(this);
        setSize(400,400);
    }

    // variables globales
    int n =0, i =1 , p=0;             
    double edad=0, altura=0 , ep=0 , epb=0,cp=0 ;
    //proceso
    public void IngresoDatos()
    {
        
        edad = Double.parseDouble(txt_altura.getText());
        altura = Double.parseDouble(txt_edad.getText());
        ep = ep+ edad;
        
        if(altura>= 1.60 && altura <=1.80)
        {
            epb =epb+edad;
            cp= cp+1;
        }
        if(altura> 1.70 )
        {
            p=p+1;
        }
        }

    
    
    public void Limpiar()
    {
        txt_altura.setText("");
        txt_edad.setText("");
    }
    
    public void Calcular()
    {
        double eprom=(ep/n);
        double epromh=(epb/cp);
        JOptionPane.showMessageDialog(null, "La edad promedio de las personas es: " + eprom + "\n"
                                            + "La eda promedio de las personas que miden 1.60 - 1.80 : " + epromh+ "\n"+
                                            "La cantidad de personas mayor a 1.70 es: " + p);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_altura = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        txt_edad = new javax.swing.JTextField();
        btn_calcular = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();
        btn_limpiar = new javax.swing.JButton();
        btn_ingresar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabel1.setText("Programa para calular e informar");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 290, -1));

        jLabel2.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jLabel2.setText("Edad:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 80, 20));

        jLabel3.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jLabel3.setText("Nombre:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 80, 20));

        jLabel4.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jLabel4.setText("Altura:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 80, 20));
        getContentPane().add(txt_altura, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 120, -1));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 120, -1));
        getContentPane().add(txt_edad, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 120, -1));

        btn_calcular.setText("Calcular");
        btn_calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_calcularActionPerformed(evt);
            }
        });
        getContentPane().add(btn_calcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, -1, -1));

        btn_salir.setText("Salir");
        getContentPane().add(btn_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 200, -1, -1));

        btn_limpiar.setText("Limpiar");
        btn_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpiarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, -1, -1));

        btn_ingresar.setText("Ingresar");
        btn_ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ingresarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_ingresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        jLabel5.setText("...");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, 20, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_calcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_calcularActionPerformed
        Calcular();
    }//GEN-LAST:event_btn_calcularActionPerformed

    private void btn_ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ingresarActionPerformed
     if(i<=n)
        {
            IngresoDatos();   
            Limpiar();
            jLabel1.setText(i+"/"+n);
            if(i==n)
            {
                txt_edad.setEnabled(false);
                txt_altura.setEnabled(false);
                
            }
            i=i+1;
        }
    }//GEN-LAST:event_btn_ingresarActionPerformed

    private void btn_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiarActionPerformed
        Limpiar();
    }//GEN-LAST:event_btn_limpiarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Edad_altura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Edad_altura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Edad_altura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Edad_altura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Edad_altura().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_calcular;
    private javax.swing.JButton btn_ingresar;
    private javax.swing.JButton btn_limpiar;
    private javax.swing.JButton btn_salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField txt_altura;
    private javax.swing.JTextField txt_edad;
    // End of variables declaration//GEN-END:variables
}
