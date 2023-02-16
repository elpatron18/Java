package PR1.Vererbung.A019_SchPrz_Vererbung.A3_Kaffee;

public class AbfallBehaelter extends Behaelter {

    public String toString() {
        return "Die Fuellmenge ist: " + this.fuellstand;
    }

    public void fuell(double kaffeeMenge){
        this.fuellstand += kaffeeMenge;
    }

}
