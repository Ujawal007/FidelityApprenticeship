//Q1

public class ProductManagementSystem {
    private int productID;
    private String productName;
    private int price;
    static String storeName = "Fidelity";

    public ProductManagementSystem(int productID, String productName, int price) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
    }

    public void display(){
        System.out.println("Product ID: " + productID);
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
    }

    static void show(){
        System.out.println("Store Name: "+storeName);
    }


    public static void main(String[] args) {

        ProductManagementSystem p1 = new ProductManagementSystem(1, "Mobile", 10000);
        ProductManagementSystem p2 = new ProductManagementSystem(2, "Tablet", 100000);
        ProductManagementSystem p3 = new ProductManagementSystem(3, "Laptop", 200000);
        ProductManagementSystem p4 = new ProductManagementSystem(4, "Charger", 1000);
        ProductManagementSystem p5 = new ProductManagementSystem(5, "Headphones", 500);

        p1.display();

    }

}
