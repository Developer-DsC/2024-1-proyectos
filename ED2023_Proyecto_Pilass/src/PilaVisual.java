
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;
import tadPila.*;

public class PilaVisual extends JFrame {

    private final Stack<String> pila = new Stack<>();
    private final JTextArea textArea;

    public PilaVisual() {
        super("Pila Visual");

        textArea = new JTextArea(1, 20); // Ajustar el número de filas a 1
        textArea.setEditable(false);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);

        JButton pushButton = new JButton("Apilar");
        JButton popButton = new JButton("Desapilar");

        pushButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String dato = JOptionPane.showInputDialog("Ingrese un dato:");
                if (dato != null) {
                    pila.push(dato);
                    actualizarPantalla();
                }
            }
        });

        popButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!pila.isEmpty()) {
                    pila.pop();
                    actualizarPantalla();
                } else {
                    JOptionPane.showMessageDialog(PilaVisual.this, "La pila está vacía", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        JPanel panel = new JPanel();
        panel.add(pushButton);
        panel.add(popButton);

        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(textArea, BorderLayout.CENTER);
        getContentPane().add(panel, BorderLayout.SOUTH);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void actualizarPantalla() {
        StringBuilder contenidoPila = new StringBuilder();
        for (String dato : pila) {
            contenidoPila.append(dato).append(" ..."); // Espacios horizontales entre los datos
        }
        textArea.setText(contenidoPila.toString());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new PilaVisual();
            }
        });
    }
}