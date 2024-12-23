package Formularios;

import PolimorfismoInterface.SeleccionFutbol;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dalton
 */

public class frm_Tabla extends javax.swing.JFrame {

    /**
     * Creates new form frm_Tabla
     */
    
    public static String Cla;
    public frm_Tabla(String clase) {
        initComponents();
        jLabel1.setText("ADMINISTRAR: "+clase.toUpperCase());
        setLocationRelativeTo(this);
        this.Cla =  clase;
        listarTabla(Cla);
    }
    
    public static void listarTabla(String Clase){
        if(Clase.equals("Futbolista")){
            jTable1.setModel(Lista_Equipo.ImprimirListaFutbolista());
        }
        if(Clase.equals("Entrenador")){
            jTable1.setModel(Lista_Equipo.ImprimirListaEntrenador());
        }
        if(Clase.equals("Masajista")){
            jTable1.setModel(Lista_Equipo.ImprimirListaMasajista());
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btn_instertar = new javax.swing.JButton();
        btn_modificar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Lista Personas");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 530, 190));

        btn_instertar.setText("Insertar");
        btn_instertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_instertarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_instertar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 100, -1));

        btn_modificar.setText("Modificar");
        btn_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        btn_eliminar.setText("Eliminar");
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        btn_salir.setText("Salir");
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });
        getContentPane().add(btn_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarActionPerformed
        if(jTable1.getSelectedRow()>=0){
            int ced = Integer.valueOf(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString());
            int pos = Lista_Equipo.Buscar(ced);
            SeleccionFutbol op = Lista_Equipo.getSeleccionado(pos);
            frm_Instertar frmIn = new frm_Instertar("Modificar", Cla);
            frmIn.setDatos(op);
            frmIn.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(null, "Escoja la fila a modificar");
        }
        
    }//GEN-LAST:event_btn_modificarActionPerformed

    private void btn_instertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_instertarActionPerformed
        frm_Instertar frmIn = new frm_Instertar("Insertar", Cla);
        frmIn.setVisible(true);
    }//GEN-LAST:event_btn_instertarActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
         if(jTable1.getSelectedRow()>=0){
            int opcion = JOptionPane.showConfirmDialog(null, "ELIMINAR PERSONA", "Desea Eliminar Persona?",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE);
            if(opcion==JOptionPane.YES_OPTION){
                int ced = Integer.valueOf(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString());
                int pos = Lista_Equipo.Buscar(ced);
                Lista_Equipo.Delete(pos);
            }
            listarTabla(Cla);
        }else{
            JOptionPane.showMessageDialog(null, "Escoja la fila a Eliminars");
        }
    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_salirActionPerformed

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
            java.util.logging.Logger.getLogger(frm_Tabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_Tabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_Tabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_Tabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_Tabla("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_instertar;
    private javax.swing.JButton btn_modificar;
    private javax.swing.JButton btn_salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private static javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
