package KA5_Uebung.OnlineShop;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    public List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }
    public void removeItem(Item item) {
        items.remove(item);
    }
    public double getTotal() {
        double sum = 0;
        for (Item i : items) sum += i.price;
        return sum;
    }
    public boolean checkout(User user, PaymentGateway paymentGateway) {
        if (paymentGateway.processPayment(user, getTotal())) return true;
        else return false;
    }

}
