import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your age: ");
        int age = sc.nextInt();

        if(Eligible(age)){
            System.out.println("Eligible to vote");
        }
        else{
            System.out.println("Not Eligible to vote");
        }

    }

    public static boolean Eligible(int n){

        if(n>=18){
            return true;
        }
        return false;
    }
}
