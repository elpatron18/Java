package JavaGenerics.Einführung;

import java.util.List;
import java.util.Vector;

public class MAddierer_OLD {

    public static int addiere(List myList) {
        int sum = 0;
        for (Object o : myList) {
            if (o instanceof Integer) sum += (Integer) o;
            else throw new ClassCastException("Keine Liste von Integer");
        }
        return sum;
    }

    public static void main(String[] args) {
        int sum = 0;
        Integer zahl1 = 100;
        String name = "eins";
        List myList = new Vector();

        myList.add(zahl1);
        myList.add(10);
        myList.add(15);
        myList.add(name);

        sum = addiere(myList);

        System.out.println(sum);

    }

}
