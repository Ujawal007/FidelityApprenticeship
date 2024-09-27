import java.util.Scanner;

public class Q3_BooleanResult {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x: ");
        int x = sc.nextInt();
        System.out.println("Enter the value of y: ");
        int y = sc.nextInt();

        boolean result = x<y?true:false;
        System.out.println("The result whether x is less than y is "+result);
    }
}
