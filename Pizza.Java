public class Pizza {
    private String description;
    private double price;

    // Constructor
    public Pizza(String description, double price) {
        this.description = description;
        this.price = price;
    }

    // Display method
    public void display() {
        System.out.println("Pizza Description: " + description);
        System.out.println("Price: $" + price + "\n");
    }

    public static void main(String[] args) {
        // Example usage
        Pizza margherita = new Pizza("Mushroom and Onions Pizza", 19.99);
        margherita.display();

        PizzaService pepperoniDelivery = new PizzaService("Pepperoni Pizza", 10.99, "1234 Address St.");
        pepperoniDelivery.display();

        Pizza carryOutSpecial = new Pizza("Onions, Black Olives, Sausage Pizza", 21.99);
        carryOutSpecial.display();

        PizzaService supremeDelivery = new PizzaService("Supreme Pizza", 24.99, "5678 Address Loop");
        supremeDelivery.display();
    }
}

class PizzaService extends Pizza {
    private double fee;
    private String address;

    // Constructor
    public PizzaService(String description, double price, String serviceAddress) {
        super(description, price); // Call the superclass constructor
        this.address = serviceAddress;
        this.fee = calculateDeliveryFee(price);
    }

    // Calculate delivery fee based on order price
    private double calculateDeliveryFee(double price) {
        if (price > 25) {
            return 2.0; // $2 fee for orders greater than $25
        } else {
            return 4.0; // $4 fee for other orders
        }
    }

    // Display method
    @Override
    public void display() {
        super.display(); // Call the superclass display method
        System.out.println("Service Address: " + address);
        System.out.println("Delivery Fee: $" + fee);
    }
}