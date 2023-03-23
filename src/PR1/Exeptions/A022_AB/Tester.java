package PR1.Exeptions.A022_AB;

public class Tester {
    public static void main(String[] args) {
        try {
            System.out.println(
                    BMIBerechner.berechneBMI(83, 193) + "\n" +
                    Quersumme.berechneQuersumme(123) + "\n " +
                    Wurzelberechner.berechneWurzel(20)
            );

        }
        catch (ArithmeticException e) { System.out.println(e.getMessage());}
    }
}
