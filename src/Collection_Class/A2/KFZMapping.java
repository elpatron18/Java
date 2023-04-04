package Collection_Class.A2;

import java.util.HashMap;

public class KFZMapping {

    private HashMap<String, String> map = new HashMap<String, String>();
    void insert(String kennzeichen, String landkreis) {
        map.put(kennzeichen, landkreis);
    }
    void remove(String kennzeichen) {
        map.remove(kennzeichen);
    }
    void printLandkreis(String kennzeichen) {
        System.out.println(map.get(kennzeichen));
    }

    public static void main(String[] args) {
        KFZMapping map = new KFZMapping();
        map.insert("TU", "Tübingen");
        map.insert("MU", "München");
        map.insert("BB", "Böblingen");

        map.printLandkreis("TU");
        map.remove("MU");

        map.insert("MU", "Musterstadt");
        map.printLandkreis("MU");

    }
}
