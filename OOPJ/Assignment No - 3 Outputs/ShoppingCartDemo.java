class Product {
    private int productId;
    private String name;
    private double price;

    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }
}

abstract class CartItem {
    abstract double calculateTotalPrice();
}

interface Discountable {
    void applyDiscount(double percentage);
}

class Cart extends CartItem implements Discountable {
    private Product[] products;
    private int count;

    Cart(int size) {
        products = new Product[size];
        count = 0;
    }

    void addProduct(Product p) {
        if (count < products.length) {
            products[count++] = p;
        }
    }

    public double calculateTotalPrice() {
        double total = 0;
        for (int i = 0; i < count; i++) {
            total += products[i].getPrice();
        }
        return total;
    }

    public void applyDiscount(double percentage) {
        if (count > 0) {
            double price = products[0].getPrice();
            double discount = price * (percentage / 100);
            products[0].setPrice(price - discount);
            System.out.println("Applying " + percentage + "% discount to " + products[0].getName());
        }
    }
}

public class ShoppingCartDemo {
    public static void main(String[] args) {
        Cart cart = new Cart(3);

        Product p1 = new Product(1, "Laptop", 50000);
        Product p2 = new Product(2, "Mouse", 500);
        Product p3 = new Product(3, "Keyboard", 1200);

        cart.addProduct(p1);
        cart.addProduct(p2);
        cart.addProduct(p3);

        cart.applyDiscount(10);
        System.out.println("Total Cart Price = " + cart.calculateTotalPrice());
    }
}
