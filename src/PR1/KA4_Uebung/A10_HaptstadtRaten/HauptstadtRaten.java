package PR1.KA4_Uebung.A10_HaptstadtRaten;

import java.lang.reflect.Method;
import java.util.Scanner;

public class HauptstadtRaten {

    public static void frage(EULand land) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Was ist die Hauptstadt von " + land.name() + "?");

        if (sc.next().equalsIgnoreCase(land.hauptstadt)) System.out.println("Richtig!");
        else System.out.println("Falsch!");


    }

    public static void main(String[] args) {

        frage(EULand.KROATIEN);
        frage(EULand.BELGIEN);
        frage(EULand.SPANIEN);

    }

}
