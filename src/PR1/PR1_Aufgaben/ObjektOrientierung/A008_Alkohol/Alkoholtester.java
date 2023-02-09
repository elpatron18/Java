package PR1.PR1_Aufgaben.ObjektOrientierung.A008_Alkohol;

public class Alkoholtester {

    public static void main(String[] args) {

        System.out.println("Alkoholgehalt von Bananensaft: " + Alkohol.BANANENSAFT.alkoholgehalt());

        System.out.println(Alkohol.BIER.abbauZeit(0.5, 80));

    }

}
