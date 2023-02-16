package PR1.Vererbung.A019_SchPrz_Vererbung.A1;

public class Wohnhaus extends Wohnung{

    public double grundstueckflaeche;

    public Wohnhaus(int baujahr, String ort, double wohnflaeche, double preis, double grundstueckflaeche) {
        super(baujahr, ort, wohnflaeche, preis);
        this.grundstueckflaeche = grundstueckflaeche;
    }

    public void getInfo(){
        System.out.println(this.baujahr+" "+ this.ort +" "+ this.wohnflaeche +" "+ this.preis +" "+ this.grundstueckflaeche );
    }
}
