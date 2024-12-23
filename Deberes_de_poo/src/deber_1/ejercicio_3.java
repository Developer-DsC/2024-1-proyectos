package deber_1;

import javax.swing.JOptionPane;

/**
 *
 * @author Dalton
 */
public class ejercicio_3 extends javax.swing.JFrame {

    String nombre, anom = "";
    double sueldo, asueldo, promedio, sumapro = 0;
    int ant, aant, n = 0;
    int i = 1;
    int persoprom = 1;

    public ejercicio_3() {

        initComponents();
        n = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de empleados que desea ingreasar"));
        setSize(385, 317);
        setLocationRelativeTo(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        txt_sueldo = new javax.swing.JTextField();
        txt_antiguedad = new javax.swing.JTextField();
        btn_ingresar = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();
        btn_calcular = new javax.swing.JButton();
        btn_limpiar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel1.setText("Ingreso de datos de empleados");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 280, 30));

        jLabel2.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jLabel2.setText("Nombres:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 70, 20));

        jLabel3.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jLabel3.setText("Sueldo:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 70, 20));

        jLabel4.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jLabel4.setText("Antiguedad:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 90, 20));
        getContentPane().add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 180, -1));
        getContentPane().add(txt_sueldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 180, -1));
        getContentPane().add(txt_antiguedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 180, -1));

        btn_ingresar.setText("Ingresar");
        btn_ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ingresarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_ingresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, -1, -1));

        btn_salir.setText("Salir");
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });
        getContentPane().add(btn_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, -1, -1));

        btn_calcular.setText("Calcular");
        btn_calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_calcularActionPerformed(evt);
            }
        });
        getContentPane().add(btn_calcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, -1, -1));

        btn_limpiar.setText("Limpiar");
        btn_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpiarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, -1, -1));

        jLabel5.setText(".");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 50, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_btn_limpiarActionPerformed

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_salirActionPerformed

    private void btn_ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ingresarActionPerformed

        if (!txt_sueldo.getText().equals("") && !txt_antiguedad.getText().equals("")) {
            if (i <= n) {
                ingresar_datos();
                limpiar();
                jLabel5.setText(i + "/" + n);
                if (i == n) {
                    deshabilitar(false);
                }

                i++;

            } else {
                JOptionPane.showMessageDialog(null, "Plazas ocupadas, por favor presione el botón calcular");
            }
        } else {

            JOptionPane.showMessageDialog(null, "Digite un empleado con su sueldo y antiguedad.");
        }


    }//GEN-LAST:event_btn_ingresarActionPerformed

    private void btn_calcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_calcularActionPerformed
        imprimir();
    }//GEN-LAST:event_btn_calcularActionPerformed

    public void limpiar() {
        txt_nombre.setText("");
        txt_sueldo.setText("");
        txt_antiguedad.setText("");
    }

    public void deshabilitar(boolean vall) {
        txt_nombre.setEnabled(vall);
        txt_sueldo.setEnabled(vall);
        txt_antiguedad.setEnabled(vall);

        btn_ingresar.setEnabled(vall);

    }

    public void ingresar_datos() {
        nombre = txt_nombre.getText();
        sueldo = Double.parseDouble(txt_sueldo.getText());
        ant = Integer.parseInt(txt_antiguedad.getText());
        if (sueldo > asueldo) {
            asueldo = sueldo;
            anom = nombre;
            aant = ant;

            promedio();
        }
    }

    public void promedio() {

        if (sueldo >= 500) {
            persoprom = persoprom + 1;
            sumapro = sumapro + ant;
            promedio = sumapro / persoprom;

        }
    }

    public void imprimir() {
        JOptionPane.showMessageDialog(null, "El empleado con mayor sueldo es: " + "\nSr/a: " + anom
                + "\nSueldo: $" + asueldo
                + "\nAntiguedad: " + ant + " años");

        JOptionPane.showMessageDialog(null, "El promedio de empleados con un sueldo mayor a $500 es: " + promedio);
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
            java.util.logging.Logger.getLogger(ejercicio_3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ejercicio_3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ejercicio_3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ejercicio_3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ejercicio_3().setVisible(true);
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
    private javax.swing.JTextField txt_antiguedad;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_sueldo;
    // End of variables declaration//GEN-END:variables
}
