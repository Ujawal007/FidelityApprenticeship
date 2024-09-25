public class Main {
    public static void main(String[] args) {


        ProductManagementSystem p1 = new ProductManagementSystem(101,"Iphone",50000);
        p1.display();
        ProductManagementSystem.show();
        ProductManagementSystem p2 = new ProductManagementSystem(102,"Samsung",40000);
        p2.display();
        ProductManagementSystem.show();


    }
}