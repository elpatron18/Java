package PR1.KA4_Uebung.Himmelsrichtung_Enum;

public class Starter {

    public static void main(String[] args) {

        Himmelsrichtung meine = Himmelsrichtung.NORD;

        System.out.println(meine.gegenueber().zuString());

    }

}
