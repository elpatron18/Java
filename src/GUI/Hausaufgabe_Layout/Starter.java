package GUI.Hausaufgabe_Layout;

import javax.swing.*;
import java.awt.*;

public class Starter {

    public static void flowLayout() {
        JFrame fenster = new JFrame();
        fenster.setSize(500, 500);
        fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        fenster.setTitle("Fenster im FlowLayout");

        JLabel text = new JLabel("Hello ADV World");
        fenster.add(text);

        fenster.setLayout(new FlowLayout());

        fenster.setVisible(true);
    }

    public static void boxLayout() {
        JFrame fenster = new JFrame();
        fenster.setSize(500, 500);
        fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button = new JButton("Drück mich");
        button.setBackground(Color.GREEN);

        JTextField eingabe = new JTextField("Ich nehme Texte entgegen");
        eingabe.setBackground(Color.CYAN);

        JMenu auswahl = new JMenu("Ihre Auswahl");
        auswahl.setBackground(Color.YELLOW);

        JButton ok = new JButton("Ich bin OK");
        ok.setBackground(Color.MAGENTA);

        fenster.add(button);
        fenster.add(eingabe);
        fenster.add(auswahl);
        fenster.add(ok);

        //3 Boxen nebeneinander und 1 drunter


        fenster.setVisible(true);
    }

    public static void main(String[] args) {
        boxLayout();
    }

}
