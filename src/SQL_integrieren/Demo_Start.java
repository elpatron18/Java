package SQL_integrieren;

import java.sql.Connection;
import java.sql.SQLException;

public class Demo_Start {

    public static void main(String[] args) throws SQLException {

        Connection dbVerbindung = null;
        dbVerbindung = DBTabelleLesen.bauVerbindungAuf();
        if (dbVerbindung != null) {
            DBTabelleLesen.leseTabelle(dbVerbindung);
            dbVerbindung.close();
        }
    }

}
