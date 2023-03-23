package Vererbung.A015_Bundespraesident;

public class Bundespraesident extends Kunde{

    private int rabattprozent;

    public Bundespraesident(String name, int rabattprozent) {
        super(name);
        this.rabattprozent = rabattprozent;

        System.out.println("Ich heiße " + name + " und erhalte überall " + rabattprozent + " Prozent Rabatt");
    }

    public static void main(String[] args) {
        Kunde k = new Bundespraesident("test", 4);
    }
}