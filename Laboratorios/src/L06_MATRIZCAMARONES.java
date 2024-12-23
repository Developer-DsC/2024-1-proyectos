
import javax.swing.table.DefaultTableModel;

public class L06_MATRIZCAMARONES extends javax.swing.JFrame {

    int f;
    
    public L06_MATRIZCAMARONES() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_filas = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        t_tabla = new javax.swing.JTable();
        btn_ingresar = new javax.swing.JButton();
        t_tabla2 = new javax.swing.JScrollPane();
        t_tabla1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btn_total = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Tabla de precio por kilogramos");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 320, 210, 20));

        jLabel2.setText("Ingrese la cantida de productores:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 190, 20));

        txt_filas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_filasActionPerformed(evt);
            }
        });
        getContentPane().add(txt_filas, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 50, 60, -1));

        t_tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(t_tabla);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 530, 190));

        btn_ingresar.setText("Ingresar");
        btn_ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ingresarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_ingresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 50, 90, -1));

        t_tabla1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Productores", "Chico (x5)", "Mediano (x6)", "Grande (x8)", "Gigante (x10)", "Total a pagar"
            }
        ));
        t_tabla2.setViewportView(t_tabla1);

        getContentPane().add(t_tabla2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, 530, 190));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Programa de gestión de camarones");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 300, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Tabla de kilogramos por talla");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, 200, 20));

        btn_total.setText("Total");
        btn_total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_totalActionPerformed(evt);
            }
        });
        getContentPane().add(btn_total, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 50, 90, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_filasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_filasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_filasActionPerformed

    private void btn_ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ingresarActionPerformed

        ingresar();
    }//GEN-LAST:event_btn_ingresarActionPerformed

    private void btn_totalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_totalActionPerformed

    }


    public void ingresar() {
        
        f = Integer.valueOf(txt_filas.getText());
        String[] columna1 = {"Productores", "Gigantes", "Grandes", "Mediano", " Chico"};
        DefaultTableModel modelo = new DefaultTableModel(columna1,f);
        t_tabla.setModel(modelo);
       for(int i=0;i<f;i++){
       
       }
    }
   
    public void modelotabla() {
        DefaultTableModel modelo1 = new DefaultTableModel();
        String[] col1 = {"Productores", "Gigantes", "Grandes", "Mediano", " Chico", "Total a pagar"};
        modelo1.setColumnIdentifiers(col1);
        t_tabla1.setModel(modelo1);


    }//GEN-LAST:event_btn_totalActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new L06_MATRIZCAMARONES().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton btn_ingresar;
    public static javax.swing.JButton btn_total;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable t_tabla;
    public static javax.swing.JTable t_tabla1;
    public static javax.swing.JScrollPane t_tabla2;
    public static javax.swing.JTextField txt_filas;
    // End of variables declaration//GEN-END:variables
}
