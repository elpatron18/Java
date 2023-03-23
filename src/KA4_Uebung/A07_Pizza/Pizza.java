package KA4_Uebung.A07_Pizza;

public class Pizza {
    private Lieferstatus status;
    private Sorte sorte;

    public Pizza(Lieferstatus status, Sorte sorte) {
        this.status = status;
        this.sorte = sorte;
    }

    public boolean lieferbar(){
        if (this.status ==Lieferstatus.ZUBEREITUNG) return true;
        else return false;
    }

    public static void main(String[] args) {
        Pizza timo = new Pizza(Lieferstatus.ZUBEREITUNG, Sorte.SUCUK);

        System.out.println(timo.lieferbar());
    }
}
