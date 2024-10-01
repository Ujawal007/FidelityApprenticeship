import java.util.Scanner;

public class Q1_InsertingAtTail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Linked List: ");
        int n = sc.nextInt();
        System.out.println("Enter the element to insert: ");
        LinkedList list = new LinkedList();
        for (int i = 0; i < n; i++) {
            list.addLast(sc.nextInt());
        }
        list.display();
    }
}
