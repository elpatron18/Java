package Vererbung.A019_SchPrz_Vererbung.A1;

public class Tester {
    public static void main(String[] args) {
        Wohnung o1 = new Wohnung(2005, "Ulm", 85,185000);
        Wohnhaus o2 = new Wohnhaus(1996, "Esslingen", 180, 575000, 450);

        o1.getInfo();
        o2.getInfo();
    }

}
