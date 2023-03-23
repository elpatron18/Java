package Vererbung.A019_SchPrz_Vererbung.A3_Kaffee;

import java.util.ArrayList;
import java.util.Scanner;

public class KaffeeMaschine {

    static ZutatenBehaelter wasser = new ZutatenBehaelter("Wasser");
    static ZutatenBehaelter kaffee = new ZutatenBehaelter("Kaffee");
    static ZutatenBehaelter kakao = new ZutatenBehaelter("Kakao");
    static ZutatenBehaelter zucker = new ZutatenBehaelter("Zucker");
    static ZutatenBehaelter milch = new ZutatenBehaelter("Milch");
    static AbfallBehaelter abfall = new AbfallBehaelter();

    public static void main(String[] args) {

        ArrayList<Rezept>RezepteL = new ArrayList<Rezept>();

        RezepteL.add(new Rezept("Espresso", 0,0,0,0,0));
        RezepteL.add(new Rezept("Kaffe Schwarz", 0.2,0.02,0,0.02,0));
        RezepteL.add(new Rezept("Kakao", 0.2,0,0.2,0.2,0.02));

        Scanner sc = new Scanner(System.in);

        for (;;) {
            RezepteL.forEach((n) -> n.getInfo());
            System.out.println("Welches Rezept möchten Sie wählen?");
            RezepteL.get(sc.nextInt()).machen();
        }

    }

}
