package PR1.Exeptions.A022_AB;

public class BMIBerechner {

    static double berechneBMI(double gewicht, double groesse) {
        try {
            if (groesse <= 0 || groesse > 3) throw new ArithmeticException("Die Körpergröße ist nicht möglich");
            if (gewicht <= 0 || gewicht > 500) throw new ArithmeticException("Das Gewicht ist nicht möglich");
        }
        catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        return gewicht / (groesse * groesse);
    }

    public static void main(String[] args) throws Exception {
        System.out.println(berechneBMI(85, 1.93));
    }
}
