import java.util.Scanner;

public class Q7_ReverseSentence {

    public static String reverseWords(String sentence) {
        String[] words = sentence.split(" ");
        String reversed = "";
        for (int i = words.length - 1; i >= 0; i--) {
            reversed = reversed + words[i] + " ";
        }
        return reversed;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string ");
        String s = sc.nextLine();

        System.out.println(reverseWords(s));
    }
}
