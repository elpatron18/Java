package KA5_Uebung.OnlineShop;

public class User {

    public String name;
    public String email;
    public ShoppingCart cart;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
        this.cart = new ShoppingCart();
    }

    public void addToCard(Item item) {
        cart.addItem(item);
    }
    public void checkout(){
        Order order = new Order();

        order.user = this;
        order.items = this.cart.items;
        order.total = this.cart.getTotal();

        try {
            order.processOrder();
            this.cart.checkout(this, new PaymentGateway());
        } catch (Exception e) {
            System.out.println(
                    "Es gab ein Problem beim Checkout \n" +
                    "Error: " + e.getMessage()
            );
        }
    }

}
