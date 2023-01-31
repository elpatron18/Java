package PR1.KA4_Uebung.Stundenplan;

public enum Kurse {
    IGW(1, "405", Lehrer.BURGER), WPR(2, "F111", Lehrer.RIDDER),
    MG(3, "F111", Lehrer.RIDDER), PR(4,"F111", Lehrer.WELLSTEIN);

    int blockT;
    String raumT;
    Lehrer lehrerT;

    Kurse(int block, String raum, Lehrer lehrer) {
        this.blockT = block;
        this.raumT = raum;
        this.lehrerT = lehrer;
    }

    public void getInfo() {
        System.out.println("Du hast " + this.name() + "in Block" + this.blockT + " im Raum " + this.raumT + " bei " + this.lehrerT.toString());
    }

}
