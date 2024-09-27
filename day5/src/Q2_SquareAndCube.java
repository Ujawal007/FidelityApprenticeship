import java.util.Scanner;

public class Q2_SquareAndCube {

    static double FindSquare(double x) {
        return x*x;
    }
    static double FindCube(double x) {
        return x*x*x;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        double x = sc.nextDouble();
        System.out.println("Square of " + x + " is " + FindSquare(x));
        System.out.println("Cube of " + x + " is " + FindCube(x));
    }
}
