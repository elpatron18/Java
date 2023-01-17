package PR1.PR1_Aufgaben.ArrayMethodenAbgabe;

import java.util.Arrays;

public class FesterWertFuellung {

    public static void main(String[] args) {

        int [] leer = new int[10];

        Arrays.fill(leer,69);

        for (int i : leer) System.out.println(i);
    }

}
