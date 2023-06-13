package Auslesen.KA_Uebung;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;

public class A3 {

    public static void main(String[] args) throws IOException  {

        JFrame fenster = new JFrame();
        fenster.setSize(400, 250);
        fenster.setLayout(new FlowLayout());

        JLabel qdLabel = new JLabel("Name der Quelldatei");
        fenster.add(qdLabel);

        JTextField quelldatei = new JTextField(30);
        fenster.add(quelldatei);

        JLabel zdLabel = new JLabel("Name der Zieldatei");
        fenster.add(zdLabel);

        JTextField zieldatei = new JTextField(30);
        fenster.add(zieldatei);

        JButton button = new JButton();
        button.setText("Submit");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                BufferedReader reader = null;
                BufferedWriter bw = null;

                String ordner = "C:\\Users\\timoa\\Documents\\IntelliJ\\GitClone\\src\\Auslesen\\KA_Uebung\\";

                String line;

                Charset charset = Charset.forName("UTF-8");

                try {
                    reader = Files.newBufferedReader(Path.of(ordner + quelldatei.getText()));
                    bw = Files.newBufferedWriter(Path.of(ordner + zieldatei.getText()), charset, StandardOpenOption.CREATE);

                    while ((line = reader.readLine()) != null) {
                        System.out.println(line);
                        bw.write(line);
                        bw.newLine();
                    }
                    bw.close();
                } catch (Exception ex) {
                    System.out.println("Fehler:" + ex);
                } finally {
                    if (reader != null) {
                        try {
                            reader.close();
                        } catch (IOException ex) {
                            throw new RuntimeException(ex);
                        }
                    }
                }
            }
        });

        fenster.add(button);

        fenster.setVisible(true);
    }
}
