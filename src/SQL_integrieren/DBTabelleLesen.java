package SQL_integrieren;

import java.sql.*;

public class DBTabelleLesen implements Daten{
    public static Connection bauVerbindungAuf(){
        Connection con = null;
        try {
            Class.forName(dbTreiber);
            String s = "jdbc:mariadb://" + host + ":" + port + "/" + db + "?" + "user=" + user + "&" + "password=" + passwd;
            con = DriverManager.getConnection(s);
        } catch (ClassNotFoundException e) {
            System.out.println("Treiber nicht gefunden");
        } catch (SQLException e) {
            System.out.println("Verbindung nicht möglich");
        }
        return con;
    }
    public static void leseTabelle(Connection dbVerbindung)
    {
        String sQuery = "select ArtikelNr, ArtikelName, Artikelgruppe,"
                + " Einstandspreis, Lagerbestand from Artikel";
        try (Statement stmt = dbVerbindung.createStatement())
        {
            ResultSet rs = stmt.executeQuery(sQuery);
            while (rs.next())
            {
                String sArtikelNr = rs.getString("ArtikelNr");
                String sArtikelName = rs.getString("ArtikelName");
                String sArtikelgruppe = rs.getString("Artikelgruppe");
                double dEinstandspreis = rs.getFloat("Einstandspreis");
                int iLagerbestand = rs.getInt("Lagerbestand");
                if (sArtikelName.length() > 50)
                    sArtikelName = sArtikelName.substring(0, 50);
                System.out.printf("%-6s %-50s %-13s %8.2f € %5d\n", sArtikelNr,
                        sArtikelName, sArtikelgruppe, dEinstandspreis, iLagerbestand);
            }
        }
        catch (SQLException e)
        {
            System.out.println(e.getMessage());;
        }
    }
}
