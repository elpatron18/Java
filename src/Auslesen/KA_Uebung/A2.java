package Auslesen.KA_Uebung;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class A2 {

    public static void main(String[] args) throws IOException {

        ArrayList<Double> celsius = new ArrayList<Double>();
        ArrayList<Double> kelvin = new ArrayList<Double>();

        String line;

        String speicherort = "C:\\Users\\Timo\\IdeaProjects\\Java\\src\\Auslesen\\KA_Uebung\\A2_gradcelsius.txt";

        BufferedReader reader;
        FileWriter fw = null;

        try {
            fw = new FileWriter(speicherort);

            reader = Files.newBufferedReader(Path.of(speicherort));

            while ((line = reader.readLine()) != null) {
                for (String s : line.split("")) {
                    celsius.add(Double.parseDouble(s));
                    kelvin.add(Double.parseDouble(s) + 273.15);
                }
            }
            
            for (String s : line.split("\n")) {
                celsius.add(Double.parseDouble(s));
                kelvin.add(Double.parseDouble(s) + 273.15);
            }

            for (int i = 0; i < celsius.size(); i++) {
                fw.write(celsius.indexOf(i) + "\t" + kelvin.indexOf(i) + "\n");
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            if (fw != null) {
                fw.close();
            }
        }

    }

}
