package deber_1;

import javax.swing.JOptionPane;

/**
 *
 * @author Dalton
 */
public class ejercicio_4 extends javax.swing.JFrame {

    int n, litros, no_factura, no_producto, totallitros1, factura300 = 0;
    int i = 1;
    double precio_u, factura, totalfacturado = 0;

    /**
     * Creates new form ejercicio_4
     */
    public ejercicio_4() {
        n = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el número de artículos que desea registrar"));
        initComponents();
        setSize(498, 300);
        setLocationRelativeTo(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cmb_noproductos = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        txt_nofactura = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_preciou = new javax.swing.JTextField();
        txt_litros = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btn_limpiar = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();
        btn_ingresar = new javax.swing.JButton();
        btn_calcular = new javax.swing.JButton();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabel1.setText("FACTURA EMPRESA DE BEBIDAS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 290, -1));

        jLabel2.setText("No. de productos: ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        cmb_noproductos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Artículo 1", "Artículo 2", "Artículo 3" }));
        getContentPane().add(cmb_noproductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 100, -1));

        jLabel3.setText("No. de factura: ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));
        getContentPane().add(txt_nofactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 100, -1));

        jLabel4.setText("Precio unitario:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));
        getContentPane().add(txt_preciou, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, 100, -1));

        txt_litros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_litrosActionPerformed(evt);
            }
        });
        getContentPane().add(txt_litros, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 100, -1));

        jLabel5.setText("Cantidad (Litros):");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        btn_limpiar.setText("Limpiar");
        btn_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpiarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, 80, -1));

        btn_salir.setText("Salir");
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });
        getContentPane().add(btn_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 100, -1, -1));

        btn_ingresar.setText("Ingresar");
        btn_ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ingresarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_ingresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 60, 80, -1));

        btn_calcular.setText("Calcular");
        btn_calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_calcularActionPerformed(evt);
            }
        });
        getContentPane().add(btn_calcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 60, 80, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_litrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_litrosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_litrosActionPerformed

    private void btn_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_limpiarActionPerformed

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_salirActionPerformed

    private void btn_ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ingresarActionPerformed
        if (!txt_nofactura.getText().equals("") && !txt_litros.getText().equals("") && !txt_preciou.getText().equals("")
                && !cmb_noproductos.equals(" ")) {
            if (i <= n) {
                ingresar_datos();
                jLabel3.setText(i + "/" + n);
                if (i == n) {
                    habilitar(false);
                }
                ingresar_datos();
                limpiar();
                i++;
                double total=totalfacturado;
            
            if (total > 300) {
                factura300++;
            }
            } else {
                JOptionPane.showMessageDialog(null, "Plazas ocupadas, porfavor presione el botón calcular");
            }
        } else {

            JOptionPane.showMessageDialog(null, "Porfavor, Ingrese los valores que desea registrar");
        }
    }//GEN-LAST:event_btn_ingresarActionPerformed

    private void btn_calcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_calcularActionPerformed
        imprimir();
    }//GEN-LAST:event_btn_calcularActionPerformed
    public void ingresar_datos() {
        if (!txt_litros.getText().equals("") && !txt_nofactura.getText().equals("") && !txt_preciou.getText().equals("")
                && !cmb_noproductos.equals(" ")) {
            no_factura = Integer.parseInt(txt_nofactura.getText());
            no_producto = cmb_noproductos.getSelectedIndex();
            litros = Integer.parseInt(txt_litros.getText());
            precio_u = Double.parseDouble(txt_preciou.getText());
            String opcion = cmb_noproductos.getSelectedItem().toString();

            if (opcion.equals("Artículo 1")) {
                totallitros1 = totallitros1 + litros;
            }

            factura = litros * precio_u;
            
            totalfacturado = factura + totalfacturado;
            
            
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese datos");
        }

    }

    public void habilitar(boolean and) {
        txt_nofactura.setEnabled(and);
        txt_litros.setEnabled(and);
        txt_preciou.setEnabled(and);
        cmb_noproductos.setEnabled(and);
        btn_ingresar.setEnabled(and);
    }

    public void imprimir() {
        
        JOptionPane.showMessageDialog(null, "el total facturado es: " + totalfacturado
                + " \nEl total de litros vendidos del articulo 1 son: " + totallitros1
                + "\nEl número de facturas con un valor mayor a $300 es: " + factura300);
    }

    public void limpiar() {
        txt_nofactura.setText("");
        txt_litros.setText("");
        txt_preciou.setText("");
        cmb_noproductos.setSelectedIndex(0);
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
            java.util.logging.Logger.getLogger(ejercicio_4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ejercicio_4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ejercicio_4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ejercicio_4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ejercicio_4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_calcular;
    private javax.swing.JButton btn_ingresar;
    private javax.swing.JButton btn_limpiar;
    private javax.swing.JButton btn_salir;
    private javax.swing.JComboBox<String> cmb_noproductos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JTextField txt_litros;
    private javax.swing.JTextField txt_nofactura;
    private javax.swing.JTextField txt_preciou;
    // End of variables declaration//GEN-END:variables
}
