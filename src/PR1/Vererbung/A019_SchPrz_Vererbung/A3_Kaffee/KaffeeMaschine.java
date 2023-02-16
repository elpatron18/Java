package PR1.Vererbung.A019_SchPrz_Vererbung.A3_Kaffee;

import java.util.ArrayList;
import java.util.Scanner;

public class KaffeeMaschine {

    public static void main(String[] args) {

        ArrayList<Rezept>RezepteL = new ArrayList<Rezept>();

        RezepteL.add(
                new Rezept("Espresso", 0,0,0,0,0)
        );

        Scanner sc = new Scanner(System.in);

        for (;;) {
            RezepteL.forEach((n) -> n.getInfo());
            System.out.println("Welches Rezept möchten Sie wählen?");
            RezepteL.get(sc.nextInt()).machen();
        }

    }

}
