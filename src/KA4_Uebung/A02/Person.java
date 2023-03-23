package KA4_Uebung.A02;

/* Erstelle eine Klasse, die eine Person repräsentiert, mit Attributen für den Namen, das Alter und das Geschlecht.
 Überlade die toString-Methode, um die Details der Person auszugeben.*/

public class Person extends Starter {

    String name;
    int alter;
    Geschlecht sex;

    public Person(String name, int alter, Geschlecht sex) {
        this.name = name;
        this.alter = alter;
        this.sex = sex;
    }

    public String toString() {
        return "Hallo mein Name ist " + this.name + " ich bin " + this.alter + " Jahre alt und " + this.sex.toAdjektiv();
    }

}
