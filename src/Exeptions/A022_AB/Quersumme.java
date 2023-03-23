package Exeptions.A022_AB;

public class Quersumme {

        public static int berechneQuersumme(int zahl) {
            if (zahl < 0) throw new ArithmeticException("Deine Zahl muss größer als 0 sein");

            int quersumme = 0;
            while (zahl > 0) {
                quersumme += zahl % 10;
                zahl /= 10;
            }
            return quersumme;
        }

}
