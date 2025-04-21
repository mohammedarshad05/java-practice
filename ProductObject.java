public class ProductObject {
    public static void main(String[] args) {
        Product product1 = new Product("Laptop", 1000, 5, "Dell");
        Product product2 = new Product("Phone", 500, 10, "Samsung");

        product1.displayInfo();
        System.out.println();
        product2.displayInfo();
        System.out.println();
    }

}

class Product {
    String title;
    int price;
    int quantity;
    String brand;


    Product() {
        this.title = "Unknown";
        this.price = 1;
        this.quantity = 1;
        this.brand = "Unknown";
    }

    Product(String t, int p, int q, String b) {
        this.title = t;
        this.price = p;
        this.quantity = q;
        this.brand = b;
    }
    void displayInfo() {
        System.out.println("Title : " + this.title);
        System.out.println("Price : " + this.price);
        System.out.println("Quantity : " + this.quantity);
        System.out.println("Brand : " + this.brand);
    }
    
}
