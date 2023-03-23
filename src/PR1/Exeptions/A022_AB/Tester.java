package PR1.Exeptions.A022_AB;

public class Tester {
    public static void main(String[] args) {
        try {
            BMIBerechner.berechneBMI(83, 193);
            Quersumme.berechneQuersumme(123);
            Wurzelberechner.berechneWurzel(20);

            for (double d : MNFBerechner.berechneMNF(1, 0, 0)) System.out.println(d);

        }
        catch (ArithmeticException e) { System.out.println(e.getMessage());}
    }
}
