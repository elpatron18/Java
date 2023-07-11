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
    public static void speicherTabelle(Connection dbVerbindung, ArrayList <Gericht> speisekarte)
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
    }
}
