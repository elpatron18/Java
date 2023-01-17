package PR1.PR1_Aufgaben.StringStuff;

public class A1 {

    static String LEAS(String s) {
        String r = s.replace(" ", "");
        return r;
    }

    public static void main(String [] args) {
        String s = "A B C";
        System.out.println(LEAS(s));
    }

}
