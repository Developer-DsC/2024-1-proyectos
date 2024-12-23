package deber_1;

import javax.swing.JOptionPane;

/**
 *
 * @ Dalton
 */
public class ejercicio_9 extends javax.swing.JFrame {

    /**
     * Creates new form Frm_E9_VentaTickets
     */
    public ejercicio_9() {
        initComponents();
        n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de registros que desea realizar"));
        setSize(330, 340);
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
        txt_num = new javax.swing.JTextField();
        cb_destino = new javax.swing.JComboBox<>();
        cb_tipo = new javax.swing.JComboBox<>();
        txt_cantidad = new javax.swing.JTextField();
        btn_ingresar = new javax.swing.JButton();
        b_imprimir = new javax.swing.JButton();
        l_cont = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 153, 102));
        setForeground(new java.awt.Color(51, 255, 102));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Microsoft Tai Le", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("VENTA DE TICKETS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel2.setText("Numero :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        jLabel3.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel3.setText("Destino :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        jLabel4.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel4.setText("Tipo :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        jLabel5.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel5.setText("Cantidad : ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        txt_num.setForeground(new java.awt.Color(0, 153, 153));
        txt_num.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_numActionPerformed(evt);
            }
        });
        getContentPane().add(txt_num, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 100, -1));

        cb_destino.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mendoza", "Neuquen", "Corrientes " }));
        getContentPane().add(cb_destino, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 100, -1));

        cb_tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Comun", "Diferencial" }));
        getContentPane().add(cb_tipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 100, -1));

        txt_cantidad.setForeground(new java.awt.Color(0, 153, 153));
        getContentPane().add(txt_cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 100, -1));

        btn_ingresar.setBackground(new java.awt.Color(255, 255, 255));
        btn_ingresar.setText("Ingresar");
        btn_ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ingresarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_ingresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, -1, -1));

        b_imprimir.setBackground(new java.awt.Color(255, 255, 255));
        b_imprimir.setText("Imprimir");
        b_imprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_imprimirActionPerformed(evt);
            }
        });
        getContentPane().add(b_imprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, -1, -1));

        l_cont.setText(" ");
        getContentPane().add(l_cont, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, 20, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    int i = 1, n = 0, numero, cantidad, tickm, tickn, tickc, tickmd, anumero, bvendidosc, bvendidosd;
    String destino, tipo, adestino, atipo;
    double subtotal, descuento, total, recac, recad, aticketmayori = 0;


    private void txt_numActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_numActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_numActionPerformed

    private void b_imprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_imprimirActionPerformed
        double totalboletos = tickm + tickn + tickc;
        double porcm = (tickm * 100) / totalboletos;
        double porcn = (tickn * 100) / totalboletos;
        double porcc = (tickc * 100) / totalboletos;
        JOptionPane.showMessageDialog(null, "Cantidad de pasajes vendidos para cada uno de los destinos: " + "\n"
                + "Mendoza: " + tickm + "\n"
                + "Neuquen: " + tickn + "\n"
                + "Corrientes: " + tickc);

        JOptionPane.showMessageDialog(null, "Recaudación total para las clases común y diferencial: " + "\n"
                + "Comun: " + recac + "\n"
                + "Diferencial: " + recad);

        JOptionPane.showMessageDialog(null, "El número de ticket de mayor importe: " + "\n"
                + "Numero: " + anumero + "\n"
                + "Destino: " + adestino + "\n"
                + "Tipo: " + atipo + "\n"
                + "Total: " + aticketmayori);

        JOptionPane.showMessageDialog(null, "Cantidad total de pasajes vendidos en clase común y diferencial: " + "\n"
                + "Total boletos Comun: " + bvendidosc + "\n"
                + "Total boletos Diferencial: " + bvendidosd);

        JOptionPane.showMessageDialog(null, "Porcentaje de ventas de cada destino tomando como base la en cantidad de pasajes vendidos: " + "\n"
                + "Mendoza: " + "% " + porcm + "\n"
                + "Neuquen: " + "% " + porcn + "\n"
                + "Corrientes: " + "% " + porcc);

        JOptionPane.showMessageDialog(null, "Cantidad de pasajes vendidos del destino 1 en clase diferencial: " + "\n"
                + "Boletos vendidos clase diferencial: " + tickmd);
    }//GEN-LAST:event_b_imprimirActionPerformed

    private void btn_ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ingresarActionPerformed
        if (i <= n) {
            ingresarDatos();
            limpiar();
            l_cont.setText(i + " / " + n);
            if (i == n) {
                txt_num.setEnabled(false);
                cb_destino.setEnabled(false);
                cb_tipo.setEnabled(false);
                txt_cantidad.setEnabled(false);
                btn_ingresar.setEnabled(false);
            }
            i++;
        }
    }//GEN-LAST:event_btn_ingresarActionPerformed

    public void ingresarDatos() {
        numero = Integer.parseInt(txt_num.getText());
        destino = cb_destino.getSelectedItem().toString();
        tipo = cb_tipo.getSelectedItem().toString();
        cantidad = Integer.parseInt(txt_cantidad.getText());

        if (destino.equals("Mendoza")) {
            tickm = tickm + cantidad;
            if (tipo.equals("Diferencial")) {
                tickmd = tickmd + cantidad;
            }
        }
        if (destino.equals("Neuquen")) {
            tickn = tickn + cantidad;
        }
        if (destino.equals("Corrientes")) {
            tickc = tickc + cantidad;
        }

        if (tipo.equals("Comun")) {
            subtotal = 43 * cantidad;
            if (cantidad >= 10) {
                descuento = subtotal * 0.10;
            }
            total = subtotal - descuento;
            recac += total;
            bvendidosc = bvendidosc + cantidad;
        }
        if (tipo.equals("Diferencial")) {
            subtotal = 55 * cantidad;
            if (cantidad >= 10) {
                descuento = subtotal * 0.10;
            }
            total = subtotal - descuento;
            recad += total;
            bvendidosd = bvendidosd + cantidad;
        }

        if (total > aticketmayori) {
            anumero = numero;
            adestino = destino;
            atipo = tipo;
            aticketmayori = total;
        }
    }

    public void limpiar() {
        txt_num.setText("");
        cb_destino.setSelectedIndex(0);
        cb_tipo.setSelectedIndex(0);
        txt_cantidad.setText("");
        txt_num.requestFocus();
        descuento = 0;
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
            java.util.logging.Logger.getLogger(ejercicio_9.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ejercicio_9.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ejercicio_9.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ejercicio_9.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ejercicio_9().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_imprimir;
    private javax.swing.JButton btn_ingresar;
    private javax.swing.JComboBox<String> cb_destino;
    private javax.swing.JComboBox<String> cb_tipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel l_cont;
    private javax.swing.JTextField txt_cantidad;
    private javax.swing.JTextField txt_num;
    // End of variables declaration//GEN-END:variables
}
