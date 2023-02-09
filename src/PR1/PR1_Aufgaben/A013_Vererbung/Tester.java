package PR1.PR1_Aufgaben.A013_Vererbung;

public class Tester {
    public static void main(String[] args) {
        Fuehrungskraft test = new Fuehrungskraft("Timo", "Antoniak", 10);
        Mitarbeiter lol = new Mitarbeiter("Manuel", "Weiskopf", 12);
        Hausmeister nesi = new Hausmeister();

        System.out.println(test.position);
        System.out.println(lol.getGehalt());
    }

}
