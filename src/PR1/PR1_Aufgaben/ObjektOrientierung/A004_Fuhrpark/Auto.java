package PR1.PR1_Aufgaben.ObjektOrientierung.A004_Fuhrpark;

public class Auto {

    private String typ;
    private int gewicht;
    private boolean automatikgetriebe = false;
    private int kw;
    private String farbe;
    private int sitze;
    private String modell;
    private String marke;
    private double mietpreise;
    private String kennzeichen;
    private int aktuell_kilometerstand;
    private int anfangs_kilometerstand;
    private boolean vermietet;

    public String getTyp() {
        return typ;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }

    public int getGewicht() {
        return gewicht;
    }

    public void setGewicht(int gewicht) {
        this.gewicht = gewicht;
    }

    public boolean isAutomatikgetriebe() {
        return automatikgetriebe;
    }

    public void setAutomatikgetriebe(boolean automatikgetriebe) {
        this.automatikgetriebe = automatikgetriebe;
    }

    public int getKw() {
        return kw;
    }

    public void setKw(int kw) {
        this.kw = kw;
    }

    public String getFarbe() {
        return farbe;
    }

    public void setFarbe(String farbe) {
        this.farbe = farbe;
    }

    public int getSitze() {
        return sitze;
    }

    public void setSitze(int sitze) {
        this.sitze = sitze;
    }

    public String getModell() {
        return modell;
    }

    public void setModell(String modell) {
        this.modell = modell;
    }

    public String getMarke() {
        return marke;
    }

    public void setMarke(String marke) {
        this.marke = marke;
    }

    public double getMietpreise() {
        return mietpreise;
    }

    public void setMietpreise(double mietpreise) {
        this.mietpreise = mietpreise;
    }

    public String getKennzeichen() {
        return kennzeichen;
    }




    public Auto(String typ, int gewicht, boolean automatikgetriebe, int kw, String farbe, int sitze, String modell, String marke, double mietpreise, String kennzeichen) {
        this.typ = typ;
        this.gewicht = gewicht;
        this.automatikgetriebe = automatikgetriebe;
        this.kw = kw;
        this.farbe = farbe;
        this.sitze = sitze;
        this.modell = modell;
        this.marke = marke;
        this.mietpreise = mietpreise;
        this.kennzeichen = kennzeichen;
    }

    public Auto () {

    }
    public void setKennzeichen(String kennzeichen) {
        this.kennzeichen = kennzeichen;
    }
    public double berechneKmStand(double endkm) {
        return endkm;
    }

    public double berechneMietKosten() {
        double kosten = 0;

        return kosten;
    }

}
