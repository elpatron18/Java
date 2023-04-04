package Collection_Class.A1;

import java.util.ArrayList;

public class Starter {
    public static void main(String[] args) {
        ArrayList<String> liste = new ArrayList<>();

        liste.add("Emil");
        liste.add("Emil");
        liste.add("Emil");
        liste.add("Frauke");
        liste.add("Emil");
        liste.add("Emil");

        System.out.println("Ausgabe der Liste");
        for (String s : liste) {
            System.out.println(s);
        }

        System.out.println("Index von Frauke:" + liste.indexOf("Frauke"));

        liste.add(liste.indexOf("Frauke"), "Hannah");

        System.out.println("Ausgabe der Liste");
        for (String s : liste) {
            System.out.println(s);
        }
    }
}
