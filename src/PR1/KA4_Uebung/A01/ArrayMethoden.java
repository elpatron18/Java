package PR1.KA4_Uebung.A01;

public class ArrayMethoden {

    public static int [] hinzufuegen(int i, int [] array) {
        int [] hArray = new int[array.length + 1];

        for (int counter = 0; counter < array.length; counter++) {
            hArray[counter] = array[counter];
        }

        hArray[hArray.length - 1] = i;

        return hArray;
    }

    public static boolean drinnen(int i, int [] array) {
        boolean drin = false;

        for (int x : array) {
            if (x == i) {
                drin = true;
                break;
            }
        }

        return drin;
    }

    public static int [] entfernt(int i, int [] array) {
        int vorgekommen = 0;

        for (int x : array) if (x == i) vorgekommen++;

        int [] eArray = new int[array.length-vorgekommen];

        int zaehler = 0;

        for (int x : array) if (x != i) {
            eArray[zaehler] = x;
            zaehler++;
        }

        return eArray;
    }

    public static void main(String[] args) {

        int [] array = {1, 2, 3, 4, 5, 2};

        for (int x : entfernt(2,array)) System.out.println(x);

    }

}
