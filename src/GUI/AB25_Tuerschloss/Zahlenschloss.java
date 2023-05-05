package GUI.AB25_Tuerschloss;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Zahlenschloss extends JFrame implements ActionListener {

    private final Color defaultBackgroundColor = Color.LIGHT_GRAY;
    private final String correctCode = "123";
    private StringBuilder currentCode = new StringBuilder();
    private JPanel panel;
    private ArrayList<JButton> buttons = new ArrayList<>();

    public Zahlenschloss ( String title ) throws HeadlessException {

        super(title);

        this.panel = new JPanel();
        this.panel.setLayout(new GridLayout(3, 3));

        for ( int i = 1; i < 10; i++ ) {
            JButton button = new JButton(String.valueOf(i));
            button.addActionListener(this);
            this.panel.add(button);
            this.buttons.add(button);
        }

        this.add(panel);

        JButton resetButton = new JButton("Reset");
        resetButton.addActionListener(this);
        this.add(resetButton);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(300, 300, 300, 300);
        this.setLayout(new FlowLayout());
        this.getContentPane().setBackground(defaultBackgroundColor);
        this.panel.setBackground(defaultBackgroundColor);

        this.setVisible(true);

    }

    @Override
    public void actionPerformed ( ActionEvent e ) {

        if ( e.getActionCommand().equals("Reset") ) {
            this.currentCode = new StringBuilder();
            this.getContentPane().setBackground(defaultBackgroundColor);
            this.panel.setBackground(defaultBackgroundColor);
            this.buttons.forEach(button -> button.setEnabled(true));
            return;
        }

        this.currentCode.append(e.getActionCommand());

        if ( this.currentCode.length() == this.correctCode.length() ) {
            if ( this.currentCode.toString().equals(correctCode) ) {
                this.getContentPane().setBackground(Color.GREEN);
                this.panel.setBackground(Color.GREEN);
            } else {
                this.getContentPane().setBackground(Color.RED);
                this.panel.setBackground(Color.RED);
            }

            this.currentCode = new StringBuilder();

            this.buttons.forEach(button -> button.setEnabled(false));
        } else {
            this.getContentPane().setBackground(defaultBackgroundColor);
            this.panel.setBackground(defaultBackgroundColor);
        }

    }

}