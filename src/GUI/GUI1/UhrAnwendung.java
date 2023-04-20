package GUI.GUI1;

import javax.swing.*;
import java.util.Date;

public class UhrAnwendung {

    public static void main(String[] args) {

        JFrame helloWorldFrame = new JFrame("Uhrzeit in der ADV");

        //Position & Größe vom Fenster
        helloWorldFrame.setBounds(400, 100, 500, 500);
        helloWorldFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel text = new JLabel("Die Uhrzeit ist: ");
        text.setBounds(50, 50, 100, 20);
        helloWorldFrame.add(text);


        JLabel datum = new JLabel(String.format("%tT", new Date()));
        datum.setBounds(50, 100, 100, 20);
        helloWorldFrame.add(datum);

        helloWorldFrame.setVisible(true);

        for (;;) {
            datum.setText(String.format("%tT", new Date()));
        }

    }

}
