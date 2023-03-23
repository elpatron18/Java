package JavaGenerics.Einführung;

import java.util.List;
import java.util.Vector;

public class MAddierer_NEW {

    public static int addiere(List<Integer> myList) {
        int sum = 0;
        for (Integer i : myList) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        int sum = 0;
        Integer zahl1 = 100;
        String name = "eins";
        List<Integer> myList = new Vector<Integer>();

        myList.add(zahl1);
        myList.add(10);
        myList.add(15);

        sum = addiere(myList);

        System.out.println(sum);

    }

}
