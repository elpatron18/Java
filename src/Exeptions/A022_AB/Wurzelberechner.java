package Exeptions.A022_AB;

public class Wurzelberechner{

    static double berechneWurzel(double x) {
        if (x < 0) throw new ArithmeticException("Deine Zahl muss größer als 0 sein");
        return Math.sqrt(x);
    }

}
