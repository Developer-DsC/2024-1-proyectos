package Formularios;

import Entidades.ejercicio_4_Venta_Boletos;

/**
 *
 * @author Dalton
 */
public class frm_ejercicio_4_Venta_Boletos extends javax.swing.JFrame {

    /**
     * Creates new form frm_Venta_Boletos
     */
    public frm_ejercicio_4_Venta_Boletos() {
        initComponents();
        setLocationRelativeTo(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cmb_compañia = new javax.swing.JComboBox<>();
        cmb_destino = new javax.swing.JComboBox<>();
        cmb_servicio = new javax.swing.JComboBox<>();
        txt_cantidad_boletos = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Venta de Boletos");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 166, -1));

        jLabel2.setText("Compañia:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        jLabel3.setText("Destino:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jLabel4.setText("Cantidad de boletos:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        jLabel5.setText("Tipo de Servicio:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        cmb_compañia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Rutas Orenses", "Cifa", "Calderón" }));
        getContentPane().add(cmb_compañia, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 140, -1));

        cmb_destino.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Quito", "Cuenca", "Guayaquil" }));
        getContentPane().add(cmb_destino, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 140, -1));

        cmb_servicio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Común", "Diferencial" }));
        getContentPane().add(cmb_servicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 140, -1));
        getContentPane().add(txt_cantidad_boletos, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 140, -1));

        jButton1.setText("Calcular");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        jButton2.setText("Salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String compañia = cmb_compañia.getSelectedItem().toString();
        String destino = cmb_destino.getSelectedItem().toString();
        int cantidad_boletos = Integer.parseInt(txt_cantidad_boletos.getText());
        String servicio = cmb_servicio.getSelectedItem().toString();

        ejercicio_4_Venta_Boletos bol1 = new ejercicio_4_Venta_Boletos(compañia, destino, cantidad_boletos, servicio);
        bol1.calcular();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(frm_ejercicio_4_Venta_Boletos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_ejercicio_4_Venta_Boletos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_ejercicio_4_Venta_Boletos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_ejercicio_4_Venta_Boletos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_ejercicio_4_Venta_Boletos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmb_compañia;
    private javax.swing.JComboBox<String> cmb_destino;
    private javax.swing.JComboBox<String> cmb_servicio;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txt_cantidad_boletos;
    // End of variables declaration//GEN-END:variables
}
