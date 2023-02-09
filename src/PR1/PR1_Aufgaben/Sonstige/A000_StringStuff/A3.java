package PR1.PR1_Aufgaben.Sonstige.A000_StringStuff;

public class A3 {

    public static String reverse(String s) {
        String r = null;

        for (int i = s.length()-1; i >= 0; i--) r += s.charAt(i);
        return r;
    }

    public static void main(String [] args) {
        String s = "Hallo";

        System.out.println(reverse(s));

    }

}
