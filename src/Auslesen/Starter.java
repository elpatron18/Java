package Auslesen;

import java.io.BufferedReader;
import java.io.FileReader;
public class Starter {

    public static void main(String[] args) {

        String logFile = "/Users/bd/dev_schule/projects_pr1/src/net/bdweb/gds2/pr1_x410_Anwendungen_Lesen_von_Dateien/ab50_Textdateien_Lesen/log.txt";

        try {
            BufferedReader myReader = new BufferedReader(new FileReader(logFile));
            String line;
            while ((line = myReader.readLine()) != null) {
                System.out.println(line);
            }
            myReader.close();
        } catch (Exception e) {

        }

    }

}
