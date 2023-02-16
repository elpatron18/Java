package PR1.Methoden.A012_RekursionTelefonkette;

public class VolleyInfo {

    final static Spieler [] Nationalmannschaft = new Spieler[10];

    static int dauer = 0;

    public static int Telefonalarm(int telefonnummern) {

        dauer = dauer + 15;
        System.out.println(telefonnummern);

        if (telefonnummern == 1) {
            return 1;
        }
        else {
            return Telefonalarm(1) + Telefonalarm(telefonnummern / 2);
        }
    }



    public static void main(String[] args) {
        System.out.println(Telefonalarm(12));
        System.out.println(dauer);
    }

}
