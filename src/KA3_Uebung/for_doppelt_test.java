package KA3_Uebung;

public class for_doppelt_test {

    public static void main(String[] args) {

       /* int [] array = {1,2,3,4,5};

        for (int unten = 0, oben = array.length-1; unten <= oben; unten++, oben-- ) {
            if (unten != oben) System.out.println("Unten: " + unten + "\t Oben: " + oben );
            else System.out.println("Gleich");
        } */

        StringBuilder sb = new StringBuilder("Test ");

        sb.append("Yo was geht? ");

        sb.append("Okay Test");

        String s = sb.toString();

        System.out.println(s.replaceAll("[eiou]","a"));

        char [] charArray = s.toCharArray();

    }

}
