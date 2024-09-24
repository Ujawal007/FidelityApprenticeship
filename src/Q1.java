import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers: ");

        int num = sc.nextInt();
        int[] arr = new int[num];
        for(int i=0;i<num;i++){
            arr[i] = sc.nextInt();
        }
        double ans = avg(arr);
        System.out.println(ans);


    }

    public  static double avg(int[] arr){

        double sum = 0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum/arr.length;
    }
}
