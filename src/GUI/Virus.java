package GUI;

import javax.swing.*;
import java.util.Random;

public class Virus {

    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {

            Random posX = new Random();
            Random posY = new Random();

            JFrame fenster = new JFrame("Virus");
            JButton button = new JButton("OK");
            button.setSize(50, 20);

            fenster.add(button);

            fenster.setBounds(posX.nextInt(0, 1920), posY.nextInt(0, 1080), 100, 100);
            fenster.setVisible(true);

        }

    }

}
