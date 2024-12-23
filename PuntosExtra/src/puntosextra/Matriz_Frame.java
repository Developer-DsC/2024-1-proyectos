package puntosextra;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dalton
 */
public class Matriz_Frame extends javax.swing.JFrame {

    static int f, c;
    int[][] M = new int[f][c];

    public Matriz_Frame() {
        initComponents();
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        txt_filas = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_columnas = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_area = new javax.swing.JTextArea();
        btn_ingresar = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();
        btn_sumpro = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        t_tabla = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Programa para sumar y promediar valores de una matriz");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 370, 20));

        txt_filas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_filasActionPerformed(evt);
            }
        });
        getContentPane().add(txt_filas, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 40, -1));

        jLabel3.setText("Cantidad de columnas:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 130, 20));
        getContentPane().add(txt_columnas, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, 40, -1));

        jLabel4.setText("Cantidad de filas:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 100, 20));

        txt_area.setColumns(20);
        txt_area.setRows(5);
        jScrollPane1.setViewportView(txt_area);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 420, -1));

        btn_ingresar.setText("Ingresar");
        btn_ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ingresarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_ingresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 50, 80, -1));

        btn_salir.setText("Salir");
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });
        getContentPane().add(btn_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 360, 80, -1));

        btn_sumpro.setText("Suma y Promedio");
        btn_sumpro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sumproActionPerformed(evt);
            }
        });
        getContentPane().add(btn_sumpro, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, -1, -1));

        t_tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(t_tabla);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 420, 150));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ingresarActionPerformed
        f = Integer.parseInt(txt_filas.getText());
        c = Integer.parseInt(txt_columnas.getText());
        int[][] M = new int[f][c];

        this.mostrarmatriz(M, f, c);

    }//GEN-LAST:event_btn_ingresarActionPerformed

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
    System.exit(0);    }//GEN-LAST:event_btn_salirActionPerformed

    private void txt_filasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_filasActionPerformed

    }//GEN-LAST:event_txt_filasActionPerformed

    private void btn_sumproActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sumproActionPerformed

        totalizar();

    }//GEN-LAST:event_btn_sumproActionPerformed

    public void totalizar() {
        double t = 0;
        double p = 0;
        double pr = 0;
        if (t_tabla.getRowCount() > 0) {
            for (int i = 0; i < f; i++) {
                for (int j = 0; j < c; j++) {
                    p = Double.parseDouble(t_tabla.getValueAt(i, j).toString());
                    t += p;
                    pr = t / (f * c);
                    txt_area.setText("El total es: " + t + "\nEl promedio es: " + pr);
                }
            }
        }
    }

    public void mostrarmatriz(int[][] M, int f, int c) {
        DefaultTableModel model = (DefaultTableModel) t_tabla.getModel();
        model.setColumnCount(c);
        model.setRowCount(f);
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                t_tabla.setValueAt(M[i][j], i, j);
            }
        }
        txt_area.setText("Vector con dimensiones de " + f + " por " + c);
    }

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
            java.util.logging.Logger.getLogger(Matriz_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Matriz_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Matriz_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Matriz_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Matriz_Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton btn_ingresar;
    public static javax.swing.JButton btn_salir;
    public static javax.swing.JButton btn_sumpro;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JTable t_tabla;
    public static javax.swing.JTextArea txt_area;
    public static javax.swing.JTextField txt_columnas;
    public static javax.swing.JTextField txt_filas;
    // End of variables declaration//GEN-END:variables
}
