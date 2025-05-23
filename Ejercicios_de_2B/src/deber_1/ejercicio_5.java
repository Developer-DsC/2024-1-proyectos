/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package deber_1;

import javax.swing.JOptionPane;

/**
 *
 * @author Dalton
 */
public class ejercicio_5 extends javax.swing.JFrame {

    /**
     * Creates new form ejercicio_5
     */
    public ejercicio_5() {
        n = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de estudiantes que desea registrar"));
        initComponents();
        setLocationRelativeTo(this);
    }
    int cod_u, n, leg_e, cant_e = 0;
    double punt_ob, prome, total, totalpun, totalcae = 0;
    int i = 1;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_puo = new javax.swing.JTextField();
        txt_cant_e = new javax.swing.JTextField();
        txt_leg_e = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_cou = new javax.swing.JTextField();
        btn_ingresar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btn_imprimir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Registro de notas de estudiantes");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 300, 30));

        jLabel2.setText("Cantidad de estudiantes");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        jLabel3.setText("Legajo del estudiante");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, -1));

        jLabel4.setText("Puntaje obtenido");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, -1, -1));
        getContentPane().add(txt_puo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, 150, -1));
        getContentPane().add(txt_cant_e, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 150, -1));
        getContentPane().add(txt_leg_e, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 150, -1));

        jLabel5.setText("Codigo de la Universidad");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));
        getContentPane().add(txt_cou, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, 150, -1));

        btn_ingresar.setText("Ingresar");
        btn_ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ingresarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_ingresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, -1, -1));

        jButton2.setText("Salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 240, -1, -1));

        jLabel6.setText(" ");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 60, 20, -1));

        btn_imprimir.setText("Imprimir");
        btn_imprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_imprimirActionPerformed(evt);
            }
        });
        getContentPane().add(btn_imprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btn_ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ingresarActionPerformed
        if (!txt_cou.getText().equals("") && !txt_cant_e.getText().equals("")
                && !txt_leg_e.getText().equals("") && !txt_puo.getText().equals("")) {
            ingresarDatos();
            if (i <= n) {

                jLabel6.setText(i + "/" + n);
                if (i == n) {
                    deshabilitar(false);
                    limpiar();
                }
                limpiar();
                i++;
            }
        } else {

            JOptionPane.showMessageDialog(null, "Digite los datos requeridos");
        }
    }//GEN-LAST:event_btn_ingresarActionPerformed

    private void btn_imprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_imprimirActionPerformed
        imprimir();
    }//GEN-LAST:event_btn_imprimirActionPerformed

    public void ingresarDatos() {

        cod_u = Integer.parseInt(txt_cou.getText());
        cant_e = Integer.parseInt(txt_cant_e.getText());
        leg_e = Integer.parseInt(txt_leg_e.getText());
        punt_ob = Double.parseDouble(txt_puo.getText());

        if (cod_u == 0) {
            deshabilitar(false);
            limpiar();
            cant_e = 1;
            JOptionPane.showMessageDialog(null, "CODIGO UNIVERSIDAD" + "\n" + cod_u + "\n" + "CANTIDAD ESTUDIANTES" + "\n" + cant_e
                    + "\n" + "PROMEDIO" + "\n" + prome);
        } else {
            totalpun = totalpun + punt_ob;
            totalcae = totalcae + cant_e;
            prome = (totalcae * totalpun) / totalcae;
            System.out.println(totalpun + "/" + totalcae);
            limpiar();

        }

    }

    public void limpiar() {
        txt_cou.setText("");
        txt_cant_e.setText("");
        txt_leg_e.setText("");
        txt_puo.setText("");
    }

    public void deshabilitar(boolean vall) {
        txt_cou.setEnabled(vall);
        txt_cant_e.setEnabled(vall);
        txt_leg_e.setEnabled(vall);
        txt_puo.setEnabled(vall);
        btn_ingresar.setEnabled(vall);
    }

    public void imprimir() {
        JOptionPane.showMessageDialog(null, "CODIGO UNIVERSIDAD" + "\n" + cod_u + "\n" + "CANTIDAD ESTUDIANTES" + "\n" + totalcae
                + "\n" + "PROMEDIO" + "\n" + prome);
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
            java.util.logging.Logger.getLogger(ejercicio_5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ejercicio_5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ejercicio_5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ejercicio_5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ejercicio_5().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_imprimir;
    private javax.swing.JButton btn_ingresar;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txt_cant_e;
    private javax.swing.JTextField txt_cou;
    private javax.swing.JTextField txt_leg_e;
    private javax.swing.JTextField txt_puo;
    // End of variables declaration//GEN-END:variables
}
