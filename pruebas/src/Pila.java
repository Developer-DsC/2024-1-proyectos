import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;

public class Pila extends JFrame {
    private JPanel stackPanel;
    private JTextField inputField;

    private Stack<String> stack;

    private static final int LABEL_WIDTH = 60;
    private static final int LABEL_HEIGHT = 20;
    private static final int LABEL_SPACING = 10;

    public Pila() {
        setTitle("Horizontal Positioned Stack Simulation");
        setSize(400, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        stack = new Stack<>();

        stackPanel = new JPanel();
        stackPanel.setLayout(null);

        JScrollPane scrollPane = new JScrollPane(stackPanel);

        inputField = new JTextField();
        JButton pushButton = new JButton("Push");
        JButton popButton = new JButton("Pop");

        pushButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input = inputField.getText();
                if (!input.isEmpty()) {
                    stack.push(input);
                    updateStackDisplay();
                }
            }
        });

        popButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!stack.isEmpty()) {
                    stack.pop();
                    updateStackDisplay();
                }
            }
        });

        JPanel buttonPanel = new JPanel(new FlowLayout());
        buttonPanel.add(inputField);
        buttonPanel.add(pushButton);
        buttonPanel.add(popButton);

        setLayout(new BorderLayout());
        add(scrollPane, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);

        setVisible(true);
    }

    private void updateStackDisplay() {
        stackPanel.removeAll();

        int xPosition = 10; // Posición inicial
        for (String item : stack) {
            JLabel label = new JLabel(item);
            label.setBounds(xPosition, 10, LABEL_WIDTH, LABEL_HEIGHT);
            stackPanel.add(label);
            xPosition += LABEL_WIDTH + LABEL_SPACING; // Actualiza la posición para el siguiente elemento
        }

        revalidate();
        repaint();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Pila());
    }
}
