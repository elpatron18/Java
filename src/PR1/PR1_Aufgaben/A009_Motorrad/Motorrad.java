package PR1.PR1_Aufgaben.A009_Motorrad;

public class Motorrad {

    private Reifen [] meineReifen = new Reifen[2];

    private Motor pMotor;

    public Motorrad(Motor pMotor, Reifen pVorne, Reifen pHinten) {
        this.pMotor = pMotor;
        meineReifen[0] = pVorne;
        meineReifen[1] = pHinten;
    }

    public Motor getMotor() {
        return pMotor;
    }

    public Reifen getVorderreifen() {
        return this.meineReifen[0];
    }

    public Reifen getHinterreifen() {
        return this.meineReifen[1];
    }

    public void getInfo() {
        System.out.println("Motor: ");
        pMotor.getInfo();
        System.out.println("Vorderreifen: ");
        meineReifen[0].getInfo();
        System.out.println("Hinterreifen: ");
        meineReifen[0].getInfo();
    }

}
