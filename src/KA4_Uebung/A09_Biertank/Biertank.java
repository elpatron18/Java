package KA4_Uebung.A09_Biertank;

public class Biertank {

    private double literstand;

    public Biertank(double literstand) {
        this.literstand = literstand;
    }

    public void getFuellstand() {
        System.out.println("Der Literstand beträgt: \t" + this.literstand + " Liter");
    }

    public void getFuellstand(Masseinheit masseinheit) {
        System.out.println(
                "Der Füllstand beträgt: \t" + this.literstand / masseinheit.liter +
                        " " + masseinheit.name);
    }

    public void hinzufuegen(double liter) {
        this.literstand += liter;
    }

    public void entfernen(double menge, Masseinheit masseinheit) {
        this.literstand -= menge * masseinheit.liter;
    }

    public void entfernen(double liter) {
        this.literstand -= liter;
    }

    public static void main(String[] args) {

        Biertank bt = new Biertank(10);

        bt.entfernen(5);

        bt.getFuellstand(Masseinheit.HALBE);

        bt.entfernen(3, Masseinheit.HALBE);

        bt.getFuellstand();

        bt.hinzufuegen(10);

        bt.getFuellstand();

    }


}
