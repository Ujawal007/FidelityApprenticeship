import java.util.Scanner;

public class Q6_StringConcatenate {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first name:");
        String fName = sc.nextLine();
        System.out.println("Enter last name:");
        String lName = sc.nextLine();
        System.out.println("Full name: " + fName + " " + lName);
    }
}
