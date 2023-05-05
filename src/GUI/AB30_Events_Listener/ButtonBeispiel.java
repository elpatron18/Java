package GUI.AB30_Events_Listener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonBeispiel extends JFrame implements ActionListener {

    JButton bSchliessen;

    public ButtonBeispiel ( String text ) throws HeadlessException {

        super(text);

        this.setLayout(new FlowLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ImageIcon image = new ImageIcon("src/GUI/AB30_Events_Listener/exit.png", "Schliessen");

        bSchliessen = new JButton("Schliessen", new ImageIcon(image.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT)));
        bSchliessen.addActionListener(this);

        this.add(bSchliessen);

    }

    @Override
    public void actionPerformed ( ActionEvent e ) {
        System.exit(0);
    }

}
