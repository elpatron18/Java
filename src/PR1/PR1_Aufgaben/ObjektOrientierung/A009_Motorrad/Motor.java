package PR1.PR1_Aufgaben.ObjektOrientierung.A009_Motorrad;

public class Motor {

    private int leistung;
    private double hubraum;

    public Motor(int leistung, double hubraum) {
        this.leistung = leistung;
        this.hubraum = hubraum;
    }

    public int getLeistung() {
        return leistung;
    }

    public double getHubraum() {
        return hubraum;
    }

    public void getInfo() {
        System.out.println("Leistung: " + leistung + " Hubraum: " + hubraum);
    }

}
