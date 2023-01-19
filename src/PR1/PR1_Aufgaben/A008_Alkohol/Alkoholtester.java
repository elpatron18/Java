package PR1.PR1_Aufgaben.A008_Alkohol;

import org.w3c.dom.ls.LSOutput;

public class Alkoholtester {

    public static void main(String[] args) {

        System.out.println("Alkoholgehalt von Bananensaft: " + Alkohol.BANANENSAFT.alkoholgehalt());

        System.out.println(Alkohol.BIER.abbauZeit(0.5, 80));

    }

}
