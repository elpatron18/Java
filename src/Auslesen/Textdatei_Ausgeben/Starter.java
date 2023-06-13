package Auslesen.Textdatei_Ausgeben;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.NoSuchFileException;
import java.text.DecimalFormat;

public class Starter {

    public static void main(String[] args) throws IOException {

        String speicherort = "C:\\Users\\Timo\\IdeaProjects\\Java\\src\\Auslesen\\Textdatei_Ausgeben\\daten.txt";
        FileWriter fw = null;

        DecimalFormat df = new DecimalFormat("#.##");

        try {
            File f = new File(speicherort);

            if (f.createNewFile())
                System.out.println("File created");
            else
                System.out.println("File already exists");

            fw = new FileWriter(speicherort);
            fw.write("Zahl" + "\t" + "Quadratzahl" + "\t" + "Wurzelzahl" + "\n");
            fw.write("**************");
            System.out.println("Successfully wrote to the file.");

            int zahl = 0;
            int qz = 0;
            double wz = 0;

            for (int i = 0; i <= 10; i++) {
                zahl = i;
                qz = i * i;
                wz = Math.sqrt(i);
                fw.write("\n" + zahl + "\t" + qz + "\t" + df.format(wz));
            }

        } catch (NoSuchFileException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            if (fw != null) {
                fw.close();
            }
        }

    }

}
