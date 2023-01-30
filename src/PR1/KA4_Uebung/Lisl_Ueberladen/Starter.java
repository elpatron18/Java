package PR1.KA4_Uebung.Lisl_Ueberladen;

public class Starter {

    //Methode zum Berechnen von Flächeninhalt von Rechteck:

   public static double flaeche(double a, double b) {
       return a * b;
   }

    public static double flaeche(double a) {
        return a * a;
    }

    public static int flaeche(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {

        System.out.println(flaeche(2));
        System.out.println(flaeche(2, 3));

    }

}
