package KA3_Uebung;

public class w3r_String_21 {

    final static String sample = "The quick brown fox jumps over the lazy dog.";

    final static char [] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n',
                                        'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

    public static int lastIndex(char c) {
        int lastPos = -1;

        for (int pos = 0; pos < sample.length(); pos++) {
            if (sample.charAt(pos) == c) lastPos = pos;
        }

        return lastPos;
    }

    public static void main(String[] args) {

        for (char c : alphabet) System.out.println(lastIndex(c));

    }

}
