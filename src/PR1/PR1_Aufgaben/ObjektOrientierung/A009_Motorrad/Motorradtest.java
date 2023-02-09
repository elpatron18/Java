package PR1.PR1_Aufgaben.ObjektOrientierung.A009_Motorrad;

public class Motorradtest {

    /*** Test der Klasse Motorrad */

        public static void main(String[] args) {
            Motorrad motorrad = new Motorrad(
                    new Motor(100, 1.5),
                    new Reifen(17, 3, "Sommer"),
                    new Reifen(17, 3, "Sommer"));
            motorrad.getInfo();
        }
}
