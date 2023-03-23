package Exeptions.A021;

public class VInteger extends Integer implements Vergleichbar{

    public VInteger(int wert) {
        super(wert);
    }

    @Override
    public int vergleichenMit(Vergleichbar obj) {
        if (this.getWert() > ((VInteger) obj).getWert()) return 1;
        if (this.getWert() < ((VInteger) obj).getWert()) return -1;
        return 0;
    }

}
