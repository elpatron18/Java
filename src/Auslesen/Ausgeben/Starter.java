package Auslesen_Einlesen.Ausgeben;

import java.io.BufferedReader;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Starter {

    public static void main(String[] args) {

        Path debug_info = Paths.get("C:\\Users\\timoa\\Documents\\GitHub\\Java\\src\\Auslesen\\Ausgeben\\Starter.java");
        Charset charset = Charset.forName("UTF-8");
        String text = "OS Build : 18362.720";
        try (BufferedReader writer = Files.newBufferedReader(debug_info, charset)) {
            String line = null;
            while ((line = writer.readLine()) != null) {
                if (line.contains(text)) {
                    System.out.println(line);
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }

}
