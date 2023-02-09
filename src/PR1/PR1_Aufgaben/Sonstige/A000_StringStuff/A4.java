package PR1.PR1_Aufgaben.Sonstige.A000_StringStuff;

import java.util.Random;

public class A4 {

    final static String ERLAUBTEZEICHEN =
            "abcdefghijklmnopqrstuvwxyz" +
            "ABCDEFGHIJKLMNOPQRSTUVWXYZ" +
            "0123456789";

    static String ErzeugeZufaelligesPasswort(int x) {

        StringBuilder passwort = new StringBuilder();

        if (x < 5) System.out.println("Error");

        else {
            Random r = new Random();
            for (int i = 0; i < x; i++) passwort.append(ERLAUBTEZEICHEN.charAt(r.nextInt(ERLAUBTEZEICHEN.length())));
        }

        return passwort.toString();
    }

    public static void main(String [] args) {

        System.out.println(ErzeugeZufaelligesPasswort(8));

    }

}
