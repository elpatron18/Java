package Vererbung.A019_SchPrz_Vererbung.A1;

public class Wohnung {

    int baujahr;
    String ort;
    double wohnflaeche;
    double preis;

    public Wohnung(int baujahr, String ort, double wohnflaeche, double preis) {
        this.baujahr = baujahr;
        this.ort = ort;
        this.wohnflaeche = wohnflaeche;
        this.preis = preis;
    }

    public void getInfo(){
        System.out.println(this.baujahr+" "+ this.ort +" "+ this.wohnflaeche +" "+ this.preis);
    }

}
