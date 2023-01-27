package PR1.PR1_Aufgaben.A012_RekursionTelefonkette;

public class Starter {

    static int dauer = 0;

    public static int Telefonalarm(int telefonnummern) {

        dauer = dauer + 15;

        if (telefonnummern == 1) {
            return 1;
        }
        else {
            return Telefonalarm(telefonnummern / 2) + Telefonalarm(telefonnummern - (telefonnummern / 2));
        }
    }

    public static void main(String[] args) {
        System.out.println(Telefonalarm(12));
        System.out.println(dauer);
    }

}
