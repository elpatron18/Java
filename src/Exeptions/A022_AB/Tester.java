package Exeptions.A022_AB;

public class Tester {
    public static void main(String[] args) {
        try {
            System.out.println(
                    BMIBerechner.berechneBMI(83, 1.93) + "\n" +
                    Quersumme.berechneQuersumme(123) + "\n" +
                    Wurzelberechner.berechneWurzel(4) + "\n"
            );
            for (double d : MNFBerechner.berechneMNF(1, 0, 0)) System.out.println(d);
        }
        catch (Exception e) { System.out.println(e.getMessage());}
    }

}
