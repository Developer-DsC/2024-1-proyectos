package deber_1;

import javax.swing.JOptionPane;

/**
 *
 * @author Dalton
 */
public class ejercicio_8 extends javax.swing.JFrame {

    public ejercicio_8() {
        initComponents();

        //n es el ciclo de empleados que se quiere ingresar
        n = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de personas que desea registrar"));
    }
    int mozo, n, cantpg, cantpl, cantply, totalper, amenormozo,impora = 0;
    int i = 1;
    double imp,impog, impol, impoly, amayor, amesa,sumimp,porg,porl,porly = 0;
    String amenornombre="";

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cmb_empleados = new javax.swing.JComboBox<>();
        cmb_mesa = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        txt_cantidad = new javax.swing.JTextField();
        txt_importe = new javax.swing.JTextField();
        btn_salir = new javax.swing.JButton();
        btn_calcular = new javax.swing.JButton();
        btn_ingresar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel5.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabel1.setText("Registro mozos restaruante \"El manaba\"");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 340, -1));

        jLabel2.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jLabel2.setText("Empleado:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 90, -1));

        jLabel4.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jLabel4.setText("Mesa:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 90, -1));

        jLabel3.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jLabel3.setText("Importe:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 90, -1));

        cmb_empleados.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Gabriel Escobar", "Leonel Chivirica", "Leyton Guanoluchi" }));
        getContentPane().add(cmb_empleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 120, -1));

        cmb_mesa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Mesa 1", "Mesa 2", "Mesa 3" }));
        getContentPane().add(cmb_mesa, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 120, -1));

        jLabel6.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jLabel6.setText("Cantidad:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 90, -1));
        getContentPane().add(txt_cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 120, -1));
        getContentPane().add(txt_importe, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 120, -1));

        btn_salir.setText("Salir");
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });
        getContentPane().add(btn_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, -1, -1));

        btn_calcular.setText("Calcular");
        btn_calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_calcularActionPerformed(evt);
            }
        });
        getContentPane().add(btn_calcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, -1, -1));

        btn_ingresar.setText("Ingresar");
        btn_ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ingresarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_ingresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        jLabel8.setText(" ");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, 100, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_salirActionPerformed

    private void btn_calcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_calcularActionPerformed
        imprimir();
    }//GEN-LAST:event_btn_calcularActionPerformed

    private void btn_ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ingresarActionPerformed
        if (!txt_cantidad.getText().equals("") && !txt_importe.getText().equals("")
                && (!cmb_empleados.getSelectedItem().equals(" "))) {
            if (i <= n) {
                ingresar_datos();
                menor_mozo();
                jLabel8.setText(i + "/" + n+" Registros");
                if (i == n) {
                    habilitar(false);
                }
                i++;
            } else {
                JOptionPane.showMessageDialog(null, "Plazas ocupadas, por favor presione el botón calcular");
            }
        } else {

            JOptionPane.showMessageDialog(null, "Ingrese la información requerida");
        }
    }//GEN-LAST:event_btn_ingresarActionPerformed

    public void Limpiar() {
        txt_cantidad.setText("");
        txt_importe.setText("");
        cmb_empleados.setSelectedItem(0);
        cmb_mesa.setSelectedItem(0);

    }

    public void ingresar_datos() {
        mozo = cmb_empleados.getSelectedIndex();
        int mesa = cmb_mesa.getSelectedIndex();
        imp = Double.parseDouble(txt_importe.getText());
        int can = Integer.parseInt(txt_cantidad.getText());

        if (mozo == 1) {
            cantpg = cantpg + can;
            impog = impog + imp;
            System.out.print("compiló selec 1");
        }

        if (mozo == 2) {
            cantpl = cantpl + can;
            impol = impol + imp;
            System.out.print("\ncompiló selec 2");
        }

        if (mozo == 3) {
            cantply = cantply + can;
            impoly = impoly + imp;
            System.out.print("\ncompiló selec 3");
        }
        if (imp > amayor) {
            amayor = imp;
            amesa = mesa;
            System.out.print("\ncompiló selec amayor");
        }
        
        sumimp=impog+impol+impoly;
        porg=impog*100/sumimp;
        porl=impol*100/sumimp;
        porly=impoly*100/sumimp;
        
        totalper = cantpg + cantpl + cantply;
        
        if(imp<50){
            impora++;
        }
        
    }
    
    public void menor_mozo(){
        if (cantpg < cantpl) {
            System.out.print("\nCompiló amenormozo op 1");
            if (cantpg < cantply) {
                amenormozo=cantpg;
                amenornombre = "Gabriel Escobar";
                System.out.print("\nCompiló amenormozo op 1.1");
            }
            if (cantply < cantpg) {
                amenormozo=cantply;
                amenornombre = "Leyton Guanoluchi";
                System.out.print("\nCompiló amenormozo op 1.2");
            }
        
        if (cantpl < cantpg) {
            System.out.print("\nCompiló amenormozo op 2");
            if (cantpl < cantply) {
                amenormozo=cantpl;
                amenornombre = "Leonel Chivirica";
                System.out.print("\nCompiló amenormozo op 2.1");
            }
            if (cantply < cantpl) {
                amenormozo=cantply;
                amenornombre = "Leyton Guanoluchi";
                System.out.print("\nCompiló amenormozo op 2.2");
            }
        }
        }
    }

    public void imprimir() {
        JOptionPane.showMessageDialog(null, "La cantidad de personas antendidas por cada mozo es: " + "" + " "
                + "\nGabriel Abreu:" + "\nClientes atendidos: " + cantpg + "\nReacudado: $" + impog
                + "\nLeonel Espinoza: " + "\nClientes atendidos: " + cantpl + "\nReacudado: $" + impol
                + "\nLeyton Guanoluchi: " + "\nClientes atendidos: " + cantply + "\nReacudado: $" + impoly);
        JOptionPane.showMessageDialog(null, "La mesa de mayor recaudación fue: " + amesa + "\nRecaudó: " + amayor);
        JOptionPane.showMessageDialog(null, "El total de personas atendidas en las 3 mesas fue de: " + totalper);
        JOptionPane.showMessageDialog(null, "El número de mesa del mozo que atendio menos personas es: \n" + amenornombre+
                                                        "\nAtendió un total de:  "+amenormozo+" personas");
        JOptionPane.showMessageDialog(null, "El total recaudado es : $" +sumimp+
                                                        "\nPorcentaje de recaudación por Gabriel: "+porg+"%"+
                                                        "\nPorcentaje de recaudación por Leonel: "+porl+"%"+
                                                        "\nPorcentaje de recaudación por Leyton: "+porly+"%");
        JOptionPane.showMessageDialog(null, "El número de cuentas menor a 50 es: "+impora);
    }

    public void habilitar(boolean bol) {
        txt_cantidad.setEditable(bol);
        txt_importe.setEditable(bol);
        cmb_empleados.setEnabled(bol);
        cmb_mesa.setEnabled(bol);
    }

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
            java.util.logging.Logger.getLogger(ejercicio_8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ejercicio_8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ejercicio_8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ejercicio_8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ejercicio_8().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_calcular;
    private javax.swing.JButton btn_ingresar;
    private javax.swing.JButton btn_salir;
    private javax.swing.JComboBox<String> cmb_empleados;
    private javax.swing.JComboBox<String> cmb_mesa;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField txt_cantidad;
    private javax.swing.JTextField txt_importe;
    // End of variables declaration//GEN-END:variables
}
