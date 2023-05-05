package KA5_Uebung.GUIs;

import javax.swing.*;
import java.awt.*;

public class GUIExamples {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame1 = createWindow("FlowLayout Example", new FlowLayout());
            frame1.getContentPane().setBackground(Color.YELLOW);
            JLabel label1 = new JLabel("FlowLayout Example");
            label1.setBackground(Color.GREEN);
            frame1.add(label1);

            JFrame frame2 = createWindow("BorderLayout Example", new BorderLayout());
            frame2.getContentPane().setBackground(Color.CYAN);
            JButton button1 = new JButton("North");
            button1.setBackground(Color.RED);
            frame2.add(button1, BorderLayout.NORTH);

            JFrame frame3 = createWindow("GridLayout Example", new GridLayout(2, 2));
            frame3.getContentPane().setBackground(Color.ORANGE);
            JButton button2 = new JButton("1");
            button2.setBackground(Color.BLUE);
            frame3.add(button2);

            JFrame frame4 = createWindow("GridBagLayout Example", new GridBagLayout());
            frame4.getContentPane().setBackground(Color.PINK);
            JButton button3 = new JButton("GridBag");
            button3.setBackground(Color.MAGENTA);
            GridBagConstraints constraints = new GridBagConstraints();
            constraints.gridx = 0;
            constraints.gridy = 0;
            frame4.add(button3, constraints);

            frame1.setVisible(true);
            frame2.setVisible(true);
            frame3.setVisible(true);
            frame4.setVisible(true);
        });
    }

    private static JFrame createWindow(String title, LayoutManager layout) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle(title);
        frame.setSize(300, 200);
        frame.setLayout(layout);

        return frame;
    }
}
