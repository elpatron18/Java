package Auslesen.KA_Uebung;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;

public class A1 {
    public static void main(String[] args) throws IOException {

        String speicherort = "C:\\Users\\Timo\\IdeaProjects\\Java\\src\\Auslesen\\KA_Uebung\\A1_zahlen.txt";
        FileWriter fw = null;

        String tz = "\t";

        DecimalFormat df = new DecimalFormat("#");

        try {
            File f = new File(speicherort);

            fw = new FileWriter(speicherort);

            fw.write("Geschwindigkeit [km/h]"  + tz + tz + "ca. Anhalteweg [m]" + "\n");
            fw.write("----------------------------------------------------" + "\n");

            for (int v = 10; v <= 100; v += 10) {

                double ahw = (v / 10) * (v / 10) + (v / 10) * 3;

                fw.write(v + tz + tz + tz+ tz+ tz+ tz + tz+ tz+ tz+ df.format(ahw) + "\n");
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
