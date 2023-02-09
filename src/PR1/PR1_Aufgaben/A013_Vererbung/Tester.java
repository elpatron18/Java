package PR1.PR1_Aufgaben.A013_Vererbung;

import PR1.PR1_Aufgaben.A013_Vererbung.Ordner1.Fuehrungskraft;
import PR1.PR1_Aufgaben.A013_Vererbung.Ordner1.Mitarbeiter;

public class Tester {
    public static void main(String[] args) {
        Fuehrungskraft test = new Fuehrungskraft("Timo", "Antoniak", 10);
        Mitarbeiter lol = new Mitarbeiter("Manuel", "Weiskopf", 12);

        System.out.println(test.position);
        System.out.println(lol.getGehalt());
    }

}
