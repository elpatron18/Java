package KA5_Uebung.Collection_Classes;

import java.util.ArrayList;

public class Aufgabe2 {

    public static void main(String[] args) {

        ArrayList<String> liste = new ArrayList<>();

        liste.add("Hans");
        liste.add("Emil");
       liste.add("Frauke");
       liste.add("Evelyn");

       for (String element : liste) System.out.println(element);

        System.out.println("Index von Frauke: " + liste.indexOf("Frauke"));

        //Einfügen von Hannah vor Frauke
        liste.add(liste.indexOf("Frauke"), "Hanna");

        System.out.println("Zweite liste: ");
        for (String element : liste) System.out.println(element);

    }

}
