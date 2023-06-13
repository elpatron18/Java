package Auslesen.KA_Uebung;

import java.io.FileReader;

public class A3 {

    public static void main(String[] args) {

        String speicherort = "C:\\Users\\Timo\\IdeaProjects\\Java\\src\\Auslesen\\KA_Uebung\\startDatei.txt";

        FileReader fr = null;

        try {
            fr = new FileReader(speicherort);

        } catch (Exception e) {

        }


    }

}
