package Projekt;

public class Gericht {

    public String name;
    public double preis;
    public String bildadresse;
    public int id;

    public Gericht(String name, double preis, String bildadresse, int ID) {
        this.name = name;
        this.preis = preis;
        this.bildadresse = bildadresse;
        this.id = ID;
    }

    @Override
    public String toString() {
        return "Gericht{" +
                "name='" + name + '\'' +
                ", Preis=" + preis +
                ", bildadresse='" + bildadresse + '\'' +
                ", ID=" + id +
                '}';
    }


}
