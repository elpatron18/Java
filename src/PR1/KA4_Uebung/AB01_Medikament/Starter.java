package PR1.KA4_Uebung.AB01_Medikament;

public class Starter {

    public static double medikamentenmenge(int tag) {
        if (tag != 0) return (5 + medikamentenmenge(tag-1)* 0.6) ;
        else return 5;
    }

    public static void main(String[] args) {
        System.out.println(medikamentenmenge(3));
    }

}
