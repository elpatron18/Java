package PR1.Exeptions.A022_AB;

public class MNFBerechner {
    static double [] berechneMNF(double a, double b, double c) throws Exception {
        try {
            if (a == 0) throw new ArithmeticException("Die erste Zahl darf nicht 0 sein");
            if (b*b - 4*a*c < 0) throw new ArithmeticException("Die Wurzel darf nicht kleiner als 0 sein");
        }
        catch (ArithmeticException e) { System.out.println(e.getMessage());}

        double [] ergebnis = new double[2];
        double wurzel = Wurzelberechner.berechneWurzel(b*b - 4*a*c);
        ergebnis[0] = (-b + wurzel) / (2*a);
        ergebnis[1] = (-b - wurzel) / (2*a);
        return ergebnis;
    }
}
