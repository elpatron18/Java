package KA4_Uebung.AB03_Assoziation;

public class Abteilung {

    private Angestellter [] angestelltenListe;

    public Abteilung(Angestellter[] angestelltenListe) {
        this.angestelltenListe = angestelltenListe;
    }

    public void angHinzufuegen(int index, Angestellter angestellter){
        this.angestelltenListe[index] = angestellter;
    }

    public void angEntfernen(int index) {
        this.angestelltenListe[index] = null;
    }

    public void zeigAlle() {
        for (Angestellter a : this.angestelltenListe) System.out.println(a.getName());
    }


}
