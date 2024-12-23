package deber_1;

import javax.swing.JOptionPane;

/**
 *
 * @author Dalton
 */
public class ejercicio_6 extends javax.swing.JFrame {

    /**
     * Creates new form ejercicio_6
     */
    public ejercicio_6() {
        n = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el número de registros que desea realizar"));
        initComponents();
        setLocationRelativeTo(this);

    }
    int zon1, zon2, zon3, zon4, zon5, zon6, zon7, zon8, zon9, zon10, can1, can2, can3, can4, can5, can6, can7, can8, can9, can10,
            cant_us_zona, num_cli, medidor_mes_ant, medidor_mes_act, n, cons1, cons2, cons3, cons4, cons5, cons6, cons7, cons8, cons9,
            cons10;
    int i = 1;
    double tot1, tot2, tot3, tot4, tot5, tot6, tot7, tot8, tot9, tot10;
    double totfac1, totfac2, totfac3, totfac4, totfac5, totfac6, totfac7, totfac8, totfac9, totfac10;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cmb_zona = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        txt_num_cliente = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_medidor_act = new javax.swing.JTextField();
        txt_medidor_ant = new javax.swing.JTextField();
        btn_ingresar = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();
        btn_imprimir = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel1.setText("Registro empresa electrica");

        jLabel2.setText("Zona");

        cmb_zona.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        jLabel3.setText("Lectura medidor mes actual");

        jLabel4.setText("Número de cliente");

        jLabel5.setText("Lectura medidor mes anterior");

        txt_medidor_act.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_medidor_actActionPerformed(evt);
            }
        });

        txt_medidor_ant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_medidor_antActionPerformed(evt);
            }
        });

        btn_ingresar.setText("Ingresar");
        btn_ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ingresarActionPerformed(evt);
            }
        });

        btn_salir.setText("Salir");
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });

        btn_imprimir.setText("Imprimir");
        btn_imprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_imprimirActionPerformed(evt);
            }
        });

        jLabel6.setText(" ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(141, 141, 141)
                                .addComponent(btn_salir))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btn_ingresar)
                                        .addGap(118, 118, 118)
                                        .addComponent(btn_imprimir))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(135, 135, 135)
                                        .addComponent(cmb_zona, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(64, 64, 64)
                                        .addComponent(txt_num_cliente))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_medidor_ant, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(15, 15, 15)
                                        .addComponent(txt_medidor_act, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 65, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(8, 8, 8)
                        .addComponent(jLabel6)
                        .addGap(3, 3, 3)
                        .addComponent(cmb_zona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jLabel2)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_num_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel4)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_medidor_ant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_medidor_act, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_ingresar)
                    .addComponent(btn_imprimir))
                .addGap(9, 9, 9)
                .addComponent(btn_salir))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_medidor_actActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_medidor_actActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_medidor_actActionPerformed

    private void txt_medidor_antActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_medidor_antActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_medidor_antActionPerformed

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_salirActionPerformed

    private void btn_ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ingresarActionPerformed
        if (!txt_num_cliente.getText().equals("") && !txt_medidor_act.getText().equals("")
                && !txt_medidor_ant.getText().equals("")) {
            ingresar_datos();
            if (i <= n) {
                jLabel6.setText(i + "/" + n);
                if (i == n) {
                    limpiar();
                    deshabilitar(false);
                }
                i++;
                limpiar();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Digite los datos requeridos");
        }
    }//GEN-LAST:event_btn_ingresarActionPerformed

    private void btn_imprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_imprimirActionPerformed
        imprimir();
    }//GEN-LAST:event_btn_imprimirActionPerformed
    public void ingresar_datos() {
        int zona = cmb_zona.getSelectedIndex();
        num_cli = Integer.parseInt(txt_num_cliente.getText());
        medidor_mes_ant = Integer.parseInt(txt_medidor_ant.getText());
        medidor_mes_act = Integer.parseInt(txt_medidor_act.getText());

        if (zona == 1) {
            zon1 = zona;
            cons1 = medidor_mes_act + medidor_mes_ant;
            if (cons1 <= 100) {
                tot1 = cons1 * 0.10;
                System.out.print("if 1 completado");
            }
            if (cons1 > 100 && cons1 <= 200) {
                tot1 = (100 * 0.10) + (cons1 - 100) * 0.12;
                System.out.print("if 2 completado");
            }
            if (cons1 > 200) {
                tot1 = (100 * 0.10) + (100 * 0.12) + (cons1 - 200) * 0.15;
                System.out.print("if 3 completado");
            }
            totfac1 = totfac1 + tot1;
            can1++;
            System.out.print("Total completado");
        }

        System.out.print("\n" + totfac1);
        if (zona == 2) {
            zon2 = zona;
            cons2 = medidor_mes_act + medidor_mes_ant;
            if (cons2 <= 100) {
                tot2 = cons2 * 0.10;
                System.out.print("if 1 completado");
            }
            if (cons2 > 100 && cons2 <= 200) {
                tot2 = (100 * 0.10) + (cons2 - 100) * 0.12;
                System.out.print("if 2 completado");
            }
            if (cons2 > 200) {
                tot2 = (100 * 0.10) + (100 * 0.12) + (cons2 - 200) * 0.15;
                System.out.print("if 3 completado");
            }
            totfac2 = totfac2 + tot2;
            can2++;
            System.out.print("Total completado");
        }

        if (zona == 3) {
            zon3 = zona;
            cons3 = medidor_mes_act + medidor_mes_ant;
            if (cons3 <= 100) {
                tot3 = cons3 * 0.10;
                System.out.print("if 1 completado");
            }
            if (cons3 > 100 && cons3 <= 200) {
                tot3 = (100 * 0.10) + (cons3 - 100) * 0.12;
                System.out.print("if 2 completado");
            }
            if (cons3 > 200) {
                tot3 = (100 * 0.10) + (100 * 0.12) + (cons3 - 200) * 0.15;
                System.out.print("if 3 completado");
            }
            totfac3 = totfac3 + tot3;
            can3++;
            System.out.print("Total completado");
        }

        if (zona == 4) {
            zon4 = zona;
            cons4 = medidor_mes_act + medidor_mes_ant;
            if (cons4 <= 100) {
                tot4 = cons4 * 0.10;
                System.out.print("if 1 completado");
            }
            if (cons4 > 100 && cons4 <= 200) {
                tot4 = (100 * 0.10) + (cons4 - 100) * 0.12;
                System.out.print("if 2 completado");
            }
            if (cons4 > 200) {
                tot4 = (100 * 0.10) + (100 * 0.12) + (cons4 - 200) * 0.15;
                System.out.print("if 3 completado");
            }
            totfac4 = totfac4 + tot4;
            can4++;
            System.out.print("Total completado");
        }

        if (zona == 5) {
            zon5 = zona;
            cons5 = medidor_mes_act + medidor_mes_ant;
            if (cons5 <= 100) {
                tot5 = cons5 * 0.10;
                System.out.print("if 1 completado");
            }
            if (cons5 > 100 && cons5 <= 200) {
                tot5 = (100 * 0.10) + (cons5 - 100) * 0.12;
                System.out.print("if 2 completado");
            }
            if (cons5 > 200) {
                tot5 = (100 * 0.10) + (100 * 0.12) + (cons5 - 200) * 0.15;
                System.out.print("if 3 completado");
            }
            totfac5 = totfac5 + tot5;
            can5++;
            System.out.print("Total completado");
        }

        if (zona == 6) {
            zon6 = zona;
            cons6 = medidor_mes_act + medidor_mes_ant;
            if (cons6 <= 100) {
                tot6 = cons6 * 0.10;
                System.out.print("if 1 completado");
            }
            if (cons6 > 100 && cons6 <= 200) {
                tot6 = (100 * 0.10) + (cons6 - 100) * 0.12;
                System.out.print("if 2 completado");
            }
            if (cons6 > 200) {
                tot6 = (100 * 0.10) + (100 * 0.12) + (cons6 - 200) * 0.15;
                System.out.print("if 3 completado");
            }
            totfac6 = totfac6 + tot6;
            can6++;
            System.out.print("Total completado");
        }

        if (zona == 7) {
            zon7 = zona;
            cons2 = medidor_mes_act + medidor_mes_ant;
            if (cons7 <= 100) {
                tot7 = cons7 * 0.10;
                System.out.print("if 1 completado");
            }
            if (cons7 > 100 && cons7 <= 200) {
                tot7 = (100 * 0.10) + (cons7 - 100) * 0.12;
                System.out.print("if 2 completado");
            }
            if (cons7 > 200) {
                tot7 = (100 * 0.10) + (100 * 0.12) + (cons7 - 200) * 0.15;
                System.out.print("if 3 completado");
            }
            totfac7 = totfac7 + tot7;
            can7++;
            System.out.print("Total completado");
        }

        if (zona == 8) {
            zon8 = zona;
            cons8 = medidor_mes_act + medidor_mes_ant;
            if (cons8 <= 100) {
                tot8 = cons8 * 0.10;
                System.out.print("if 1 completado");
            }
            if (cons8 > 100 && cons8 <= 200) {
                tot8 = (100 * 0.10) + (cons8 - 100) * 0.12;
                System.out.print("if 2 completado");
            }
            if (cons8 > 200) {
                tot8 = (100 * 0.10) + (100 * 0.12) + (cons8 - 200) * 0.15;
                System.out.print("if 3 completado");
            }
            totfac8 = totfac8 + tot8;
            can8++;
            System.out.print("Total completado");
        }

        if (zona == 9) {
            zon9 = zona;
            cons9 = medidor_mes_act + medidor_mes_ant;
            if (cons9 <= 100) {
                tot9 = cons9 * 0.10;
                System.out.print("if 1 completado");
            }
            if (cons9 > 100 && cons9 <= 200) {
                tot9 = (100 * 0.10) + (cons9 - 100) * 0.12;
                System.out.print("if 2 completado");
            }
            if (cons9 > 200) {
                tot9 = (100 * 0.10) + (100 * 0.12) + (cons9 - 200) * 0.15;
                System.out.print("if 3 completado");
            }
            totfac9 = totfac9 + tot9;
            can9++;
            System.out.print("Total completado");
        }

        if (zona == 10) {
            zon10 = zona;
            cons10 = medidor_mes_act + medidor_mes_ant;
            if (cons10 <= 100) {
                tot10 = cons10 * 0.10;
                System.out.print("if 1 completado");
            }
            if (cons10 > 100 && cons10 <= 200) {
                tot10 = (100 * 0.10) + (cons10 - 100) * 0.12;
                System.out.print("if 2 completado");
            }
            if (cons10 > 200) {
                tot10 = (100 * 0.10) + (100 * 0.12) + (cons10 - 200) * 0.15;
                System.out.print("if 3 completado");
            }
            totfac10 = totfac10 + tot10;
            can10++;
            System.out.print("Total completado");
        }

    }

    public void imprimir() {
        if (can1 > 0) {
            JOptionPane.showMessageDialog(null,
                    "Zona: " + zon1
                    + "\nCantidad de Usuarios de la zona: " + can1
                    + "\nTotal Facturado en la zona: " + totfac1);
        }
        if (can2 > 0) {
            JOptionPane.showMessageDialog(null,
                    "Zona: " + zon2
                    + "\nCantidad de Usuarios de la zona: " + can2
                    + "\nTotal Facturado en la zona: " + totfac2);
        }
        if (can3 > 0) {
            JOptionPane.showMessageDialog(null,
                    "Zona: " + zon3
                    + "\nCantidad de Usuarios de la zona: " + can3
                    + "\nTotal Facturado en la zona: " + totfac3);
        }
        if (can4 > 0) {
            JOptionPane.showMessageDialog(null,
                    "Zona: " + zon4
                    + "\nCantidad de Usuarios de la zona: " + can4
                    + "\nTotal Facturado en la zona: " + totfac4);
        }
        if (can5 > 0) {
            JOptionPane.showMessageDialog(null,
                    "Zona: " + zon5
                    + "\nCantidad de Usuarios de la zona: " + can5
                    + "\nTotal Facturado en la zona: " + totfac5);
        }
        if (can6 > 0) {
            JOptionPane.showMessageDialog(null,
                    "Zona: " + zon6
                    + "\nCantidad de Usuarios de la zona: " + can6
                    + "\nTotal Facturado en la zona: " + totfac6);
        }
        if (can7 > 0) {
            JOptionPane.showMessageDialog(null,
                    "Zona: " + zon7
                    + "\nCantidad de Usuarios de la zona: " + can7
                    + "\nTotal Facturado en la zona: " + totfac7);
        }
        if (can1 > 8) {
            JOptionPane.showMessageDialog(null,
                    "Zona: " + zon8
                    + "\nCantidad de Usuarios de la zona: " + can8
                    + "\nTotal Facturado en la zona: " + totfac8);
        }
        if (can9 > 0) {
            JOptionPane.showMessageDialog(null,
                    "Zona: " + zon9
                    + "\nCantidad de Usuarios de la zona: " + can9
                    + "\nTotal Facturado en la zona: " + totfac9);
        }
        if (can10 > 0) {
            JOptionPane.showMessageDialog(null,
                    "Zona: " + zon10
                    + "\nCantidad de Usuarios de la zona: " + can10
                    + "\nTotal Facturado en la zona: " + totfac10);
        }

    }

    public void limpiar() {
        txt_num_cliente.setText("");
        txt_medidor_act.setText("");
        txt_medidor_ant.setText("");
        cmb_zona.setSelectedIndex(0);
    }
    
    public void deshabilitar(boolean vall){
        txt_num_cliente.enable(vall);
        txt_medidor_act.enable(vall);
        txt_medidor_ant.enable(vall);
        btn_ingresar.enable(true);
        
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
            java.util.logging.Logger.getLogger(ejercicio_6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ejercicio_6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ejercicio_6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ejercicio_6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new ejercicio_6().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_imprimir;
    private javax.swing.JButton btn_ingresar;
    private javax.swing.JButton btn_salir;
    private javax.swing.JComboBox<String> cmb_zona;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txt_medidor_act;
    private javax.swing.JTextField txt_medidor_ant;
    private javax.swing.JTextField txt_num_cliente;
    // End of variables declaration//GEN-END:variables
}
