package PR1.Vererbung.A019_SchPrz_Vererbung.A4_Polymorphismus;

import java.util.Scanner;

public class Kontro {
    public int kontrolliere( String[] namen, Ticket[] tickets, int zone, String datum ) {
        int schwarzFahrer = 0;
        if (namen.length != tickets.length) {
            System.out.println("ERROR: Arraylänge - Namen und Tickets unterschiedlich");
        } else {
            for (int i = 0; i < namen.length; i++) {
                if (tickets[i].gueltigInZone(zone) && !tickets[i].istEntwertet()) {
                    System.out.println(namen[i] + " hat ein gültiges Ticket");
                } else {
                    System.out.println(namen[i] + " hat ein ungültiges Ticket");
                    schwarzFahrer++;
                }
            }
        }
        return schwarzFahrer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (;;) {

            System.out.println("Wie viele Personen sollen kontrolliert werden?");
            int anzahl = sc.nextInt();
            System.out.println("Welche Zone soll kontrolliert werden?");
            String zone = sc.next();
            System.out.println("Welches Datum soll kontrolliert werden?");
            String datum = sc.next();

            String[] namen = new String[anzahl];
            Ticket[] tickets = new Ticket[anzahl];

            for (int i = 0; i < anzahl; i++) {
                System.out.println("Name der " + (i+1) + ". Person:");
                namen[i] = sc.next();
                System.out.println("Welches Ticket hat " + namen[i] + "?");
                System.out.println("1: Einzelticket");
                System.out.println("2: Tageskarte");
            System.out.println("3: Mehrfahrtenkarte");
                int ticket = sc.nextInt();
                switch (ticket) {
                    case 1:
                        tickets[i] = new Einzelticket(100);
                        break;
                    case 2:
                        tickets[i] = new Generalabo(200, namen[i], datum);
                        break;
                    case 3:
                        System.out.println("Wie viele Fahrten hat die Mehrfahrtenkarte?");
                        int fahrten = sc.nextInt();
                        tickets[i] = new Mehrfahrtenkarte(300, fahrten, Integer.parseInt(zone));
                        break;
                    default:
                        System.out.println("ERROR: Ungültige Eingabe");
                        break;
                }
            }

        }
    }

    }
