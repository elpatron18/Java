package PR1.KA3_Uebung;

import java.util.Scanner;
import java.util.StringTokenizer;

public class BD1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Gib einen Text ein: ");
        StringTokenizer text = new StringTokenizer(sc.nextLine());

        int zaehler = 0;
        while (text.hasMoreTokens()) {
            zaehler++;
            if (zaehler % 2 == 0) System.out.println(text.nextToken().toUpperCase());
            else System.out.println(text.nextToken().toLowerCase());
        }

    }

}
