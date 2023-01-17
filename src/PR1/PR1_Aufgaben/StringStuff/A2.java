package PR1.PR1_Aufgaben.StringStuff;

public class A2 {

    static String TextOhneVokale(String s) {
        return s.replaceAll("[AaEeIiOoUu]","");
    }

    public static void main(String [] args) {
        String s = "Das ist ein Beispiel";

        System.out.println(TextOhneVokale(s));
    }

}
