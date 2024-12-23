package deber_1;

import javax.swing.JOptionPane;

/**
 *
 * @author Dalton
 */
public class ejercicio_7 extends javax.swing.JFrame {

    /**
     * Creates new form Banco_sucursales
     */
    public ejercicio_7() {
        n = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el valor de n"));
        initComponents();
        setSize(503, 350);
        setLocationRelativeTo(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_monto = new javax.swing.JTextField();
        txt_numero = new javax.swing.JTextField();
        txt_nombre = new javax.swing.JTextField();
        cmb_transaccion = new javax.swing.JComboBox<>();
        cmb_sucursal = new javax.swing.JComboBox<>();
        btn_ingresar = new javax.swing.JButton();
        btn_mostrar = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel1.setText("Operaciones de Banco Central del Ecuador");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 400, -1));

        jLabel2.setText("Monto");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, -1));

        jLabel3.setText("Número:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        jLabel4.setText("Nombre:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        jLabel5.setText("Surcursal:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        jLabel6.setText("Transacción:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));
        getContentPane().add(txt_monto, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 140, -1));
        getContentPane().add(txt_numero, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 140, -1));
        getContentPane().add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 140, -1));

        cmb_transaccion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Depósito", "Extracción" }));
        getContentPane().add(cmb_transaccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 200, 140, -1));

        cmb_sucursal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Cuenca", "Machala", "Pasaje" }));
        getContentPane().add(cmb_sucursal, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 160, 140, -1));

        btn_ingresar.setText("Ingresar");
        btn_ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ingresarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_ingresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 110, -1, -1));

        btn_mostrar.setText("Mostrar");
        btn_mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_mostrarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_mostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 170, -1, -1));

        btn_salir.setText("Salir");
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });
        getContentPane().add(btn_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 230, 70, -1));

        jLabel7.setText(".");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 60, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    int n, i = 1, numero = 0, dep_1000 = 0, tc = 0, tq = 0, tg = 0, canDepPasaje = 0, canDepMachala = 0, canDepCuenca = 0;
    double monto = 0, auxmonto = 0, totcuen = 0, totmach = 0, totquit = 0;
    String nombre, sucursal, tipo, anombre, asucursal, SucursmasDep;
    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_salirActionPerformed

    private void btn_ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ingresarActionPerformed
        if (i <= n) {
            IngresoDatos();
            Limpiar();
            jLabel7.setText(i + "/" + n);
            if (i == n) {
                habilitar(false);
            }
            i = i + 1;
        }

    }//GEN-LAST:event_btn_ingresarActionPerformed

    private void btn_mostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_mostrarActionPerformed
        Imprimir();
    }//GEN-LAST:event_btn_mostrarActionPerformed
    public void IngresoDatos() {
        numero = Integer.parseInt(txt_numero.getText());
        nombre = txt_nombre.getText();
        sucursal = cmb_sucursal.getSelectedItem().toString();
        tipo = cmb_transaccion.getSelectedItem().toString();
        monto = Double.parseDouble(txt_monto.getText());

        if (monto>= 1000) {
            dep_1000 = dep_1000 + 1;
             System.out.print("if corrio bien");
        }
        if (tipo.equals("Extracción")) {
            if (monto > auxmonto) {
                auxmonto = monto;
                anombre = nombre;
                asucursal = sucursal;
                System.out.print("if corrio bien");
            }
        }
        if (sucursal.equals("Cuenca")) {
            tc = tc + 1;
            if (tipo.equals("Depósito")) {
                totcuen = totcuen + monto;
                canDepCuenca++;
            System.out.print("if corrio bien");
            }
        }
        if (sucursal.equals("Machala")) {
            tg = tg + 1;
            if (tipo.equals("Depósito")) {
                totmach = totmach + monto;
                canDepMachala++;
            }
        }
        if (sucursal.equals("Pasaje")) {
            tq = tq + 1;
            if (tipo.equals("Depósito")) {
                totquit = totquit + monto;
                canDepPasaje++;
            }
        }

        if (canDepCuenca > canDepMachala && canDepCuenca > canDepPasaje) {
            SucursmasDep = "Cuenca";
        } else if (canDepMachala > canDepCuenca && canDepMachala > canDepPasaje) {
            SucursmasDep = "Machala";
        } else if (canDepPasaje > canDepCuenca && canDepPasaje > canDepMachala) {
            SucursmasDep = "Pasaje";
        }
    }

    public void Imprimir() {
        double total, pc, pq, pg, recaudado;
        total = tg + tc + tq;

        pc = (tc * 100) / total;
        pg = (tg * 100) / total;
        pq = (tq * 100) / total;

        recaudado = totcuen + totmach + totquit;
        //Literal a
        JOptionPane.showMessageDialog(null, "Cantidad de depositos por mas de $1000: " + dep_1000);
        //Literal b
        JOptionPane.showMessageDialog(null, """
                                            El nombre del cliente que hizo la extraccion por mayor monto: 
                                            Cliente: """ + anombre + "\n"
                + "sucursal: " + asucursal + "\n"
                + "Monto: " + auxmonto);
        //Literal c
        JOptionPane.showMessageDialog(null, """
                                            Porcentaje de transacciones 
                                            Cuenca: """ + pc + " %" + "\n"
                + "Machala: " + pg + " %" + "\n"
                + "Pasaje: " + pq + " %" + "\n");
        //Literal d
        JOptionPane.showMessageDialog(null, """
                                            Total de dinero depositados en cada una de las sucursales:
                                            Valor total: """ + recaudado + "\n"
                + "Total Cuenca" + totcuen + "\n"
                + "Total Machala" + totmach + "\n"
                + "Total Pasaje" + totquit + "\n");

        //Literal e
        JOptionPane.showMessageDialog(null, "Cantidad de depósitos en la sucursal de Pasaje: " + canDepPasaje);

        //Literal F
        //Literal g
        JOptionPane.showMessageDialog(null, "sucursal que recibió más cantidad de depósitos: " + SucursmasDep);

    }

    public void Limpiar() {
        txt_numero.setText("");
        txt_nombre.setText("");
        txt_monto.setText("");
        cmb_sucursal.setSelectedIndex(0);
        cmb_transaccion.setSelectedIndex(0);
        txt_numero.requestFocus();
    }

    public void habilitar(boolean vall) {
        txt_numero.setEnabled(vall);
        txt_nombre.setEnabled(vall);
        txt_monto.setEnabled(vall);
        cmb_sucursal.setEnabled(vall);
        cmb_transaccion.setEnabled(vall);
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
            java.util.logging.Logger.getLogger(ejercicio_7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ejercicio_7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ejercicio_7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ejercicio_7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new ejercicio_7().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_ingresar;
    private javax.swing.JButton btn_mostrar;
    private javax.swing.JButton btn_salir;
    private javax.swing.JComboBox<String> cmb_sucursal;
    private javax.swing.JComboBox<String> cmb_transaccion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txt_monto;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_numero;
    // End of variables declaration//GEN-END:variables
}
