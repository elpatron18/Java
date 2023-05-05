package KA5_Uebung.OnlineShop;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    public static List<Item> sortiment = new ArrayList<>();
    public static void addItem(Item item) {
        sortiment.add(item);
    }
    public static void removeItem(Item item) throws Exception{
        if (sortiment.contains(item)) sortiment.remove(item);
        else throw new Exception("Das Item gibts nichtmehr im Sortiment");
    }
    public static Item getItemByName(String name) throws Exception{
        for (Item i : sortiment) if (i.name == name) return i;
        throw new Exception("Das Item gibts nicht");
    }

}
