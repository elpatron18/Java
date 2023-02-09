package PR1.PR1_Aufgaben.Methoden.A001_ArrayMethodenAbgabe;

import java.util.Arrays;

public class ArraySortierung {

    public static void main(String [] args) {

        String [] unsortiert1 = {"Manuel","Nesim","Umut","Timo","Ramon","Abdullah"};
        String [] unsortiert2 = {"Manuel","Nesim","Umut","Timo","Ramon","Abdullah"};

        Arrays.sort(unsortiert1);
        for (String s : unsortiert1) System.out.print(s + " ");
        System.out.println("");

        Arrays.sort(unsortiert2, 1, 5);
        for (String s : unsortiert2) System.out.print(s + " ");
        System.out.println("");

    }

}
