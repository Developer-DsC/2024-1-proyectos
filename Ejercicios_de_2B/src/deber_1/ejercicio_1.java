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
public class ejercicio_1 extends javax.swing.JFrame {

    String estudiante = "";
    int notas1, notas2, notas3, notas4 = 0;
    double nt = 0;

    public ejercicio_1() {
        initComponents();
        setLocation(422, 233);
        setLocationRelativeTo(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_estudiante = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_notas4 = new javax.swing.JTextField();
        ingresar = new javax.swing.JButton();
        btn_mostrar = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();
        btn_limpiar = new javax.swing.JButton();
        txt_notas1 = new javax.swing.JTextField();
        txt_notas2 = new javax.swing.JTextField();
        txt_notas3 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        jLabel1.setText("Programa notas de un estudiante");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 400, -1));

        jLabel2.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jLabel2.setText("Estudiante:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 80, -1));
        getContentPane().add(txt_estudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 140, -1));

        jLabel3.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jLabel3.setText("Notas:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 70, -1));

        txt_notas4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_notas4KeyTyped(evt);
            }
        });
        getContentPane().add(txt_notas4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, 40, -1));

        ingresar.setText("Ingresar");
        ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresarActionPerformed(evt);
            }
        });
        getContentPane().add(ingresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, -1, -1));

        btn_mostrar.setText("Mostrar");
        btn_mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_mostrarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_mostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, -1, -1));

        btn_salir.setText("Salir");
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });
        getContentPane().add(btn_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, -1, -1));

        btn_limpiar.setText("Limpiar");
        btn_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpiarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, -1, -1));

        txt_notas1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_notas1KeyTyped(evt);
            }
        });
        getContentPane().add(txt_notas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 40, -1));

        txt_notas2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_notas2KeyTyped(evt);
            }
        });
        getContentPane().add(txt_notas2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 40, -1));

        txt_notas3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_notas3KeyTyped(evt);
            }
        });
        getContentPane().add(txt_notas3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 40, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_notas4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_notas4KeyTyped

    }//GEN-LAST:event_txt_notas4KeyTyped

    private void btn_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiarActionPerformed
        txt_estudiante.setText("");
        txt_notas1.setText("");
        txt_notas2.setText("");
        txt_notas3.setText("");
        txt_notas4.setText("");
    }//GEN-LAST:event_btn_limpiarActionPerformed

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_salirActionPerformed

    private void ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresarActionPerformed
        estudiante = txt_estudiante.getText();
        notas1 = Integer.valueOf(txt_notas1.getText());
        notas2 = Integer.valueOf(txt_notas2.getText());
        notas3 = Integer.valueOf(txt_notas3.getText());
        notas4 = Integer.valueOf(txt_notas4.getText());
        {

        }

    }//GEN-LAST:event_ingresarActionPerformed

    private void txt_notas1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_notas1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_notas1KeyTyped

    private void txt_notas2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_notas2KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_notas2KeyTyped

    private void txt_notas3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_notas3KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_notas3KeyTyped

    private void btn_mostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_mostrarActionPerformed
        nt = notas1 + notas2 + notas3 + notas4;

        if (notas1>=7 && notas2>=7 && notas3>=7 && notas4>=7) {
            JOptionPane.showMessageDialog(null, "El estudiante " + estudiante + " con notas de " + notas1
                    + ", " + notas2
                    + ", " + notas3
                    + ", " + notas4
                    + " \nObtuvo: *Promociona*");
        } else {
            if (notas1>=4 && notas2>=4 && notas3>=4 && notas4>=4) {
                JOptionPane.showMessageDialog(null, "El " + estudiante + " con notas de " + notas1
                        + ", " + notas2
                        + ", " + notas3
                        + ", " + notas4
                        + " \nObtuvo: *Rinde examen final*");
            } else {
                if (nt >= 4 && nt < 12) {
                    JOptionPane.showMessageDialog(null, "El " + estudiante + " con notas de " + notas1
                            + ", " + notas2
                            + ", " + notas3
                            + ", " + notas4
                            + " \nObtuvo: *Recupera Parciales*");
                } else {
                    JOptionPane.showMessageDialog(null, "El " + estudiante + " con notas de " + notas1
                            + ", " + notas2
                            + ", " + notas3
                            + ", " + notas4
                            + " \nObtuvo: *Recursa la materia*");

                }
            }
        }
    }//GEN-LAST:event_btn_mostrarActionPerformed

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
            java.util.logging.Logger.getLogger(ejercicio_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ejercicio_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ejercicio_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ejercicio_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ejercicio_1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_limpiar;
    private javax.swing.JButton btn_mostrar;
    private javax.swing.JButton btn_salir;
    private javax.swing.JButton ingresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txt_estudiante;
    private javax.swing.JTextField txt_notas1;
    private javax.swing.JTextField txt_notas2;
    private javax.swing.JTextField txt_notas3;
    private javax.swing.JTextField txt_notas4;
    // End of variables declaration//GEN-END:variables
}
