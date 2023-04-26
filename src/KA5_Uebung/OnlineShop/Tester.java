package KA5_Uebung.OnlineShop;

public class Tester {

    public static void main(String[] args) {
        // Erstellen eines Users
        User nesi = new User("John Doe", "john@example.com");


        // Erstellen einiger Items
        Item item1 = new Item("Item 1", "Description 1", 10.99);
        Item item2 = new Item("Item 2", "Description 2", 5.99);
        Item item3 = new Item("Item 3", "Description 3", 15.99);

        Inventory.addItem(item1);
        Inventory.addItem(item2);
        Inventory.addItem(item3);

        // Hinzufügen der Items zum ShoppingCart
        nesi.addToCard(item1);
        nesi.addToCard(item2);
        nesi.addToCard(item3);

        // Ausgabe des aktuellen Warenkorb-Inhalts
        System.out.println("ShoppingCart Contents:");
        for (Item item : nesi.cart.items) {
            System.out.println(item.name + " - " + item.price);
        }
        nesi.checkout();
    }
}


