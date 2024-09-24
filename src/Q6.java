import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int ans = evenSum(arr);
        System.out.println(ans);
    }

    public static int evenSum(int[] arr){
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] % 2 == 0){
                sum += arr[i];
            }
        }
        return sum;
    }
}
