package Projekt;

import javax.lang.model.element.Name;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DBTabelleLesen implements Daten {
    public static Connection bauVerbindungAuf(){
        Connection con = null;
        try {
            Class.forName(dbTreiber);
            String s = "jdbc:mariadb://" + host + ":" + port + "/" + db + "?" + "user=" + user + "&password=" + passwd;
            con = DriverManager.getConnection(s);
        } catch (ClassNotFoundException e) {
            System.out.println("Treiber nicht gefunden");
        } catch (SQLException e) {
            System.out.println("Verbindung nicht möglich");
        }
        return con;
    }
    public static void speicherTabelle(Connection dbVerbindung, ArrayList <Gericht> speisekarte, ArrayList <Rabattcode> codes)
    {
        String sQuery = "SELECT Name, Preis, Bildadresse,"
                + " ID FROM speisekarte";
        try (Statement stmt = dbVerbindung.createStatement())
        {
            ResultSet rs = stmt.executeQuery(sQuery);
            while (rs.next())
            {
                String sName = rs.getString("Name");
                double sPreis = rs.getDouble("Preis");
                String sBildadresse = rs.getString("Bildadresse");
                int sID = rs.getInt("ID");

                //System.out.println(sName + sPreis + sBildadresse + sID);

                Gericht gericht = new Gericht(sName, sPreis, sBildadresse, sID);
                speisekarte.add(gericht);
            }
        }
        catch (SQLException e) {
            System.out.println(e.getMessage());;
        }

        String sQuery2 = "SELECT Code, Rabatt From rabattcodes";
        try (Statement stmt = dbVerbindung.createStatement()) {
            ResultSet rs = stmt.executeQuery(sQuery2);
            while (rs.next()) {
                String sCode = rs.getString("Code");
                double sRabatt = rs.getDouble("Rabatt");

                System.out.println(sCode + " " + sRabatt);

                Rabattcode rc = new Rabattcode(sCode, sRabatt);
                codes.add(rc);
            }
        }
        catch (SQLException e) {
            System.out.println(e.getMessage());;
        }
    }
    public static void bestellungVerarbeiten(Connection dbVerbindung, Bestellung bestellung) {

        try (Statement stmt = dbVerbindung.createStatement()) {
            String sQuery = "INSERT INTO `bestellungen`(`ID`, `Datum`, `Summe`) " +
                    "VALUES ('" + bestellung.id + "','" + bestellung.datum + "','" + bestellung.summe + "')";
           stmt.executeQuery(sQuery);
           LoggerUtil.log("Neue Bestellung \n" + "ID:" + bestellung.id + " | " + bestellung.summe);
        }
        catch (SQLException e) {
            System.out.println("Fehler: " +  e.getMessage());;
        }
    }
    public static int wieVieleBestellungen(Connection dbVerbindung) throws SQLException {

        Statement stmt = dbVerbindung.createStatement();
        String sQuery = "SELECT COUNT(*) AS IDs FROM bestellungen";
        ResultSet rs = stmt.executeQuery(sQuery);
        while (rs.next()) {
            return rs.getInt("IDs");
        }
        return 0;
    }

    public static void create_new_BestellungsItem(Connection dbVerbindung, Bestellung bestellung,ArrayList <Gericht> gerichte) {
        try (Statement stmt = dbVerbindung.createStatement()) {
            for (Gericht g : gerichte) stmt.executeQuery(
            "INSERT INTO `bestellungs_items`(`BestellungsID`, `SpeiseID`) " +
                "VALUES ('" + bestellung.id + "','" + g.id + "')"
            );
        }
        catch (SQLException e) {
            System.out.println("Fehler: " +  e.getMessage());;
        }
    }


}
