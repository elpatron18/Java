package PR1.ObjektOrientierung.A004_Fuhrpark;

public class Fuhrpark {

    private static int stellplaetze = 1200;

    private Auto sportwagen;
    private Auto stadtwagen;

    public Fuhrpark(Auto sportwagen, Auto stadtwagen) {
        this.sportwagen = sportwagen;
        this.stadtwagen = stadtwagen;
    }

}
