package PR1.Exeptions.A022_AB;

public class BMIBerechner {

    static double berechneBMI(double gewicht, double groesse) throws Exception {
        if (groesse <= 0 || groesse > 3) throw new Exception("Die Körpergröße ist nicht möglich");
        if (gewicht <= 0 || gewicht > 500) throw new Exception("Das Gewicht ist nicht möglich");

        return gewicht / (groesse * groesse);
    }
}
