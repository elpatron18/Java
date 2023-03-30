package Aggregation.Aufgabe1;

public class Tester {
    public static void main(String[] args) {
        Industrieroboter test = new Industrieroboter();

        Bohrer bohrer1 = new Bohrer(10, 0);
        Bohrer bohrer2 = new Bohrer(10, 0);

        System.out.println(
                "test.werkzeugHinzufuegen(5, bohrer1): " +
                test.werkzeugHinzufuegen(5, bohrer1) + "\n" +

                "test.werkzeugHinzufuegen(5, bohrer2): " +
                test.werkzeugHinzufuegen(5, bohrer2) + "\n" +

                "test.werkzeugHinzufuegen(10, bohrer2):" +
                test.werkzeugHinzufuegen(10, bohrer2) +"\n" +

                "test.werkzeugHinzufuegen(-1, bohrer2): " +
                test.werkzeugHinzufuegen(-1, bohrer2) + "\n " +

                "test.werkzeugEntfernen(-1): " +
                test.werkzeugEntfernen(5) + "\n " +

                "test.werkzeugEntfernen(5): " +
                test.werkzeugEntfernen(5) + "\n " +

                "test.werkzeugEntfernen(10): " +
                test.werkzeugEntfernen(10) + "\n " +

                "test.werkzeugEntfernen(-1): " +
                test.werkzeugEntfernen(-1) + "\n "
        );


    }
}
