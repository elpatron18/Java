package Sonstige.A002;

public class Rechteck {

    public static double rectArea(double a, double b) {
        double flaeche = a * b;
        return flaeche;
    }
    public static double rectArea(double a) {
        double flaeche = a * a;
        return flaeche;
    }

    public static void main(String[] args) {
        double a = 8, b = 4;
        System.out.println("Rechteckfläche: " +  rectArea(a, b));
    }

}
