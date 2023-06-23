package Lambda.Teiluebungen;

import javax.swing.*;
import java.awt.*;

public class A1 extends JFrame {

    private JFrame frame;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    A1 window = new A1();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public A1() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 434, 10);
        frame.getContentPane().add(panel);

        JButton btnNewButton = new JButton("Lampda Auslöser");
        btnNewButton.setBounds(151, 50, 141, 41);
        frame.getContentPane().add(btnNewButton);

        btnNewButton.setActionCommand("la");
        btnNewButton.addActionListener(e -> System.exit(0));


    }
}

