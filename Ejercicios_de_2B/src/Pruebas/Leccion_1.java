package Pruebas;

import javax.swing.JOptionPane;

/**
 *
 * @author Dalton
 */
public class Leccion_1 extends javax.swing.JFrame {

    /**
     * Creates new form Leccion_1
     */
    public Leccion_1() {
        initComponents();
        setLocationRelativeTo(this);
        n = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de registros de desea realizar"));
    }
    int n, por_tipo_pasaje, por_tipo_machala, por_tipo_cuenca, surcusal, dia_venta, tipo_dia, raza, cant_litros,
            M_raza1, M_raza2, M_raza3, M_tot_raza, M_sum_raza, c_raza1, c_raza2, c_raza3, c_tot_raza, c_sum_raza,
            c_1, c_2, c_3,
            p_raza1, p_raza2, p_raza3, p_tot_raza, p_sum_raza, p_1, p_2, p_3 = 0;
    int i = 1;
    double total_venta, m_1, m_2, m_3, m_mayor_porcentaje, c_mayor_porcentaje, p_mayor_porcentaje, total_recaudacion, recaudacion1, recaudacion2 = 0;
    String m_amayorraza, c_amayorraza, p_amayorraza = "";

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cmb_surcursal = new javax.swing.JComboBox<>();
        cmb_dia_venta = new javax.swing.JComboBox<>();
        cmb_tipo_dia = new javax.swing.JComboBox<>();
        txt_nombre = new javax.swing.JTextField();
        cmb_raza = new javax.swing.JComboBox<>();
        txt_total_venta = new javax.swing.JTextField();
        txt_cantidad_litros = new javax.swing.JTextField();
        btn_ingresar = new javax.swing.JButton();
        btn_calcular = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        jCheckBox1.setText("jCheckBox1");

        jCheckBox2.setText("jCheckBox2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Ganaderia");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 100, -1));

        jLabel2.setText("Sucursal: ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jLabel3.setText("Día de venta:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        jLabel4.setText("Tipo de día:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jLabel5.setText("Nombre:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        jLabel6.setText("Raza vendida:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        jLabel7.setText("Total de venta:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        jLabel8.setText("Cantidad de litros de vaca:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));

        cmb_surcursal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Machala", "Cuenca", "Pasaje" }));
        getContentPane().add(cmb_surcursal, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, -1, -1));

        cmb_dia_venta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "1 a 15 primera quincena", "15 a 30 segunda quincena" }));
        getContentPane().add(cmb_dia_venta, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, -1, -1));

        cmb_tipo_dia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Hábil", "Fin de semana" }));
        getContentPane().add(cmb_tipo_dia, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, -1, -1));
        getContentPane().add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 120, -1));

        cmb_raza.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Holsteing", "Brahman", "Jersey" }));
        getContentPane().add(cmb_raza, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, -1, -1));

        txt_total_venta.setText(" ");
        getContentPane().add(txt_total_venta, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 110, -1));
        getContentPane().add(txt_cantidad_litros, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 300, 110, -1));

        btn_ingresar.setText("Ingresar");
        btn_ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ingresarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_ingresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, -1, -1));

        btn_calcular.setText("Calcular");
        btn_calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_calcularActionPerformed(evt);
            }
        });
        getContentPane().add(btn_calcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 360, -1, -1));

        btn_salir.setText("Salir");
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });
        getContentPane().add(btn_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 360, -1, -1));
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, 70, 20));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_salirActionPerformed

    private void btn_ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ingresarActionPerformed
        if (!txt_nombre.getText().equals("") && !txt_total_venta.getText().equals("")
                && (!cmb_surcursal.getSelectedItem().equals(" "))) {
            if (i <= n) {
                ingresar_datos();
                mayor_porcentaje1();
                recaudacion();

                jLabel9.setText(i + "/" + n + " Registros");
                if (i == n) {

                }
                i++;
            } else {
                JOptionPane.showMessageDialog(null, "Plazas ocupadas, por favor presione el botón calcular");
            }
        } else {

            JOptionPane.showMessageDialog(null, "Ingrese la información requerida");
        }
    }//GEN-LAST:event_btn_ingresarActionPerformed

    private void btn_calcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_calcularActionPerformed
        imprimir();

    }//GEN-LAST:event_btn_calcularActionPerformed

    public void ingresar_datos() {
        surcusal = cmb_surcursal.getSelectedIndex();
        dia_venta = cmb_dia_venta.getSelectedIndex();
        tipo_dia = cmb_tipo_dia.getSelectedIndex();
        raza = cmb_raza.getSelectedIndex();
        total_venta = Double.parseDouble(txt_total_venta.getText());
        cant_litros = Integer.parseInt(txt_cantidad_litros.getText());

        if (surcusal == 1) {
            if (raza == 1) {
                M_raza1 = M_raza1 + 1;

                System.out.print("\nSucursal 1 op 1 Compiló");
            }
            if (raza == 2) {
                M_raza2 = M_raza2 + 1;
                System.out.print("\nSucursal 1 op 2 Compiló");
            }

            if (raza == 3) {
                M_raza3 = M_raza3 + 1;
                System.out.print("\nSucursal 1 op 3 Compiló");
            }
            M_sum_raza = M_raza1 + M_raza2 + M_raza3;
            m_1 = (M_raza1 * 100) / M_sum_raza;
            m_2 = (M_raza2 * 100) / M_sum_raza;
            m_3 = (M_raza3 * 100) / M_sum_raza;
            M_tot_raza = (M_raza1 * 100) / M_sum_raza;
            System.out.print("\nSucursal 1 total Compiló");
        }

        if (surcusal == 2) {
            if (raza == 1) {
                c_raza1 = c_raza1 + 1;

                System.out.print("\nSucursal 2 op 1 Compiló");
            }
            if (raza == 2) {
                c_raza2 = c_raza2 + 1;
                System.out.print("\nSucursal 2 op 1 Compiló");
            }

            if (raza == 3) {
                c_raza3 = c_raza3 + 1;
                System.out.print("\nSucursal 3 op 1 Compiló");
            }
            c_sum_raza = c_raza1 + c_raza2 + c_raza3;
            c_1 = (c_raza1 * 100) / c_sum_raza;
            c_2 = (c_raza2 * 100) / c_sum_raza;
            c_3 = (c_raza3 * 100) / c_sum_raza;
            c_tot_raza = (c_raza1 * 100) / c_sum_raza;
            System.out.print("\nSucursal 2 total Compiló");
        }

        if (surcusal == 3) {
            if (raza == 1) {
                p_raza1 = p_raza1 + 1;
                System.out.print("\nSucursal 3 op 1 Compiló");
            }
            if (raza == 2) {
                p_raza2 = p_raza2 + 1;
                System.out.print("\nSucursa3 1 op 2 Compiló");
            }
            if (raza == 3) {
                p_raza3 = p_raza3 + 1;
                System.out.print("\nSucursal 3 op 3 Compiló");
            }

            p_sum_raza = p_raza1 + p_raza2 + p_raza3;
            p_1 = (p_raza1 * 100) / p_sum_raza;
            p_2 = (p_raza2 * 100) / p_sum_raza;
            p_3 = (p_raza3 * 100) / p_sum_raza;
            p_tot_raza = (p_raza1 * 100) / p_sum_raza;
            System.out.print("\nSucursal 3 total Compiló");

        }
    }

    public void mayor_porcentaje1() {
        if (surcusal == 1) {
            if (m_1 > m_2 && m_1 > m_3) {
                m_amayorraza = "Holsteing";
                m_mayor_porcentaje = m_1;
                System.out.print("\nCompiló porcentaje op 2.1");
            }

            if (m_2 > m_1 && m_2 > m_3) {
                m_amayorraza = "Brahman";
                m_mayor_porcentaje = m_2;
                System.out.print("\nCompiló porcentaje op 2.2.1");
            }

            if (m_3 > m_1 && m_3 > m_2) {
                m_amayorraza = "Jersey";
                m_mayor_porcentaje = m_3;
                System.out.print("\nCompiló porcentaje op 2.2");
            }

        }

        if (surcusal == 2) {
            if (c_1 > c_2 && c_1 > c_3) {
                c_amayorraza = "Holsteing";
                c_mayor_porcentaje = c_1;
                System.out.print("\nCompiló porcentaje op 2.1");
            }

            if (c_2 > c_1 && c_2 > c_3) {
                c_amayorraza = "Brahman";
                c_mayor_porcentaje = c_2;
                System.out.print("\nCompiló porcentaje op 2.2.1");
            }

            if (c_3 > c_1 && c_3 > c_2) {
                c_amayorraza = "Jersey";
                c_mayor_porcentaje = c_3;
                System.out.print("\nCompiló porcentaje op 2.2");
            }

        }

        if (surcusal == 3) {
            if (p_1 > p_2 && p_1 > p_3) {
                p_amayorraza = "Holsteing";
                p_mayor_porcentaje = p_1;
                System.out.print("\nCompiló porcentaje op 2.1");
            }

            if (p_2 > p_1 && p_2 > p_3) {
                p_amayorraza = "Brahman";
                p_mayor_porcentaje = p_2;
                System.out.print("\nCompiló porcentaje op 2.2.1");
            }

            if (p_3 > p_1 && p_3 > p_2) {
                p_amayorraza = "Jersey";
                p_mayor_porcentaje = p_3;
                System.out.print("\nCompiló porcentaje op 2.2");
            }

        }
    }

    public void recaudacion() {
        int recaudacion = cmb_dia_venta.getSelectedIndex();
        if (recaudacion == 1) {
            recaudacion1 = recaudacion1 + Double.parseDouble(txt_total_venta.getText());
        }
        if (recaudacion == 2) {
            recaudacion2 = recaudacion2 + Double.parseDouble(txt_total_venta.getText());
        }
        total_recaudacion = recaudacion1 + recaudacion2;
    }

    public void imprimir() {
        JOptionPane.showMessageDialog(null,
                "Surcusal Machala"
                + "\nPorcentaje raza 1: " + m_1 + "%"
                + "\nPorcentaje raza 2: " + m_2 + "%"
                + "\nPorcentaje raza 3: " + m_3 + "%" + "\n"
                + "\nSurcusal Cuenca"
                + "\nPorcentaje raza 1: " + c_1 + "%"
                + "\nPorcentaje raza 2: " + c_2 + "%"
                + "\nPorcentaje raza 3: " + c_3 + "%" + "\n"
                + "\nSurcusal Pasaje"
                + "\nPorcentaje raza 1: " + p_1 + "%"
                + "\nPorcentaje raza 2: " + p_2 + "%"
                + "\nPorcentaje raza 3: " + p_3 + "%");

        JOptionPane.showMessageDialog(null,
                "Surcusal Machala"
                + "\nPorcentaje: " + m_mayor_porcentaje + "%"
                + "\nTipo de ganado vendido: " + m_amayorraza
                + "\nSurcusal Cuenca"
                + "\nPorcentaje: " + c_mayor_porcentaje + "%"
                + "\nTipo de ganado vendido: " + c_amayorraza
                + "\nSurcusal Pasaje"
                + "\nPorcentaje: " + p_mayor_porcentaje + "%"
                + "\nTipo de ganado vendido: " + p_amayorraza);

        JOptionPane.showMessageDialog(null, "La recaudación total acumulada para la primera y segunda quincena es: "
                + "\n" + total_recaudacion
                + "\nPrimera quincena: " + recaudacion1
                + "\nSegunda quincena: " + recaudacion2);
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
            java.util.logging.Logger.getLogger(Leccion_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Leccion_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Leccion_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Leccion_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Leccion_1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_calcular;
    private javax.swing.JButton btn_ingresar;
    private javax.swing.JButton btn_salir;
    private javax.swing.JComboBox<String> cmb_dia_venta;
    private javax.swing.JComboBox<String> cmb_raza;
    private javax.swing.JComboBox<String> cmb_surcursal;
    private javax.swing.JComboBox<String> cmb_tipo_dia;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txt_cantidad_litros;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_total_venta;
    // End of variables declaration//GEN-END:variables
}
