import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int pizza = 200;
        int puff = 40;
        int pepsi = 120;

        int noPizza = sc.nextInt();
        int noPuff = sc.nextInt();
        int noPepsi = sc.nextInt();

        int costPizza = pizza*noPizza;
        int costPuff = puff*noPuff;
        int costPepsi = pepsi*noPepsi;

        System.out.println("Cost of Pizza: "+costPizza);
        System.out.println("Cost of Puff: "+costPuff);
        System.out.println("Cost of Pepsi: "+costPepsi);

        int totalCost = costPizza + costPuff + costPepsi;
        System.out.println("Total Cost: "+totalCost);


    }
}
