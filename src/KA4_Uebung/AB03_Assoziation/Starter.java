package KA4_Uebung.AB03_Assoziation;

public class Starter {



    public static void main(String[] args) {

        Angestellter timo = new Angestellter("Timo");
        Angestellter manu = new Angestellter("Manu");
        Angestellter nessy = new Angestellter("Nessy");

        Abteilung marketing = new Abteilung(new Angestellter[] {timo, manu});
        marketing.zeigAlle();

        marketing.angEntfernen(1);
        marketing.angHinzufuegen(1, nessy);

        marketing.zeigAlle();

    }

}
