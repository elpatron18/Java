package PR1.PR1_Aufgaben.Methoden.A001_ArrayMethodenAbgabe;

import java.util.Arrays;

public class ArrayVergleich {

    public static void main(String [] args) {

        String [] array1 = {"Manuel","Nesim","Umut","Timo","Ramon","Abdullah"};

        String [] array2 = {"Lisa","Nesim","Umut","Timo","Neil","Abdullah"};
        String [] array3 = {"Manuel","Nesim","Umut","Timo","Ramon","Abdullah"};


        boolean einsZwei = Arrays.equals(array1, array2);
        boolean einsDrei = Arrays.equals(array1, array3);

        System.out.println("Array 1 ist gleich wie Array 2:\t" + einsZwei);
        System.out.println("Array 1 ist gleich wie Array 3:\t" + einsDrei);
    }

}
