package GUI.Umwandler;

public enum Waehrungen {
    //mit Name und Wechselkurs
    DOLLAR("Dollar", 0.85),SINGAPURDOLLAR("Singapurdollar", 1.43), EURO("Euro", 1.0);

    Waehrungen(String name, double kurs) {
        this.name = name;
        this.kurs = kurs;
    }
    private String name;
    private double kurs;

}
