package Auslesen.KA_Uebung;

import javax.swing.*;
import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;

public class A3 {

    public static void main(String[] args) throws IOException {

        ArrayList<String> text = new ArrayList<String>();

        String speicherort = "C:\\Users\\Timo\\IdeaProjects\\Java\\src\\Auslesen\\KA_Uebung\\startDatei.txt";
        String outputOrt = "C:\\Users\\Timo\\IdeaProjects\\Java\\src\\Auslesen\\KA_Uebung\\outputDatei.txt";

        String line;

        Charset charset = Charset.forName("UTF-8");

        BufferedReader reader = null;
        BufferedWriter bw = null;

        JFrame fenster = new JFrame();
        fenster.setSize(400, 250);
        fenster.setVisible(true);

        JTextField quelldatei = new JTextField();
        //quelldatei.setText("Dateiname der Quelldatei");
        fenster.add(quelldatei);

        JButton button = new JButton();
        button.setText("Submit");

        fenster.add(button);

        try {

            reader = Files.newBufferedReader(Path.of(speicherort));
            bw = Files.newBufferedWriter(Path.of(outputOrt), charset, StandardOpenOption.CREATE);

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
                bw.write(line);
                bw.newLine();
            }
            bw.close();

        } catch (Exception e) {
            System.out.println("Fehler:" + e);
        }finally {
            if (reader != null) {
                reader.close();
            }

        }


    }

}
