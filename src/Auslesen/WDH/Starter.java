package Auslesen_Einlesen.WDH;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;

public class Starter {
    static String filename = "C:\\Users\\Timo\\IdeaProjects\\Java\\src\\Auslesen\\WDH\\daten.txt";

    public static void main(String[] args) throws IOException {

        BufferedReader reader = null;
        String [] datenarray = null;
        String trennzeichen = "\t";
        double zahl = 0, quadratzahl = 0, wurzelzahl = 0;
        String line, ersteZeile = "", zweiteZeile = "";

        try {
            reader = Files.newBufferedReader(Path.of(filename));

            ersteZeile = reader.readLine();
            System.out.println(ersteZeile);
            zweiteZeile = reader.readLine();
            System.out.println(zweiteZeile);


            while ((line = reader.readLine()) != null) {
                System.out.println(line);
                datenarray = line.split(trennzeichen);

                zahl += Double.parseDouble(datenarray[0]);
                quadratzahl += Double.parseDouble(datenarray[1]);
                wurzelzahl += Double.parseDouble(datenarray[2].replace(",", "."));
            }

            System.out.println("*****************");
            System.out.println(zahl + "\t" + quadratzahl + "\t" + wurzelzahl);

        } catch (NoSuchFileException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            if (reader != null) {
                reader.close();
            }
        }

    }

}
