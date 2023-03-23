package PR1.Exeptions.A022_AB;

public class Wurzelberechner{

    static double berechneWurzel(double x) {
        try { if (x < 0) throw new ArithmeticException("Deine Zahl muss größer als 0 sein");}
        catch (ArithmeticException e) { System.out.println(e.getMessage());}

        return Math.sqrt(x);
    }

}
