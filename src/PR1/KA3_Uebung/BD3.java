package PR1.KA3_Uebung;

import java.util.Arrays;
import java.util.Scanner;

public class BD3 {

    public static boolean ganzFertig(boolean [] array) {
        boolean gF = true;

        for (boolean b : array) if (!b) gF = false;

        return gF;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        //test

        System.out.println("Wieviele Aufgaben hast du?");
        int anzahlAufg = sc.nextInt();
        sc.nextLine();
        String [] aufgaben = new String[anzahlAufg];
        boolean [] fertigTF = new boolean[anzahlAufg];

        Arrays.fill(fertigTF, false);

        for (int i = 0, z = 1; i < anzahlAufg; i++, z++) {
            System.out.println(z + ". Aufgabe: ");
            aufgaben[i] = sc.nextLine();
        }

        do {

            for (int pos = 0; pos < anzahlAufg; pos++) {
                System.out.print((pos+1) + ". Aufgabe: " + aufgaben[pos]);
                if (fertigTF[pos]) System.out.println(" [X]");
                else System.out.println(" [ ]");
            }

            fertigTF[sc.nextInt()-1] = true;

        }while (!ganzFertig(fertigTF));

        System.out.println("Fertig");

    }

}
