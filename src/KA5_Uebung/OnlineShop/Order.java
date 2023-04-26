package KA5_Uebung.OnlineShop;

import java.util.List;

public class Order {

    public User user;
    public List<Item> items;
    public double total;

    public void processOrder() throws Exception{
        for (Item i : items) Inventory.removeItem(i);
    }

}
