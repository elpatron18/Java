package PR1.Methoden.A001_ArrayMethodenAbgabe;

import java.util.Arrays;

public class Halbierungssuche {

    public static void main(String [] args) {

        int [] array = {12, 53, 23, 8, 18, 0, 65, 98, 56, 32};
        Arrays.sort(array);

        int zahlIndex = Arrays.binarySearch(array,18);

        System.out.println(array[zahlIndex]);




    }

}
