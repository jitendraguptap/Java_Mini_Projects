package stockManagementSystem;

public class Stock {
    private String name;
    private int quantity;
    private double price;

    public Stock(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

   
	public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public void removeQuantity(int quantityToRemove) {
        if (quantityToRemove <= quantity) {
            quantity -= quantityToRemove;
        } else {
            System.out.println("Not enough quantity to remove");
        }
    }

    public String toString() {
        return name + ", quantity: " + quantity + ", price: $" + price;
    }
}
