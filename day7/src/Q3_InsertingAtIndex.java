import java.util.Scanner;

public class Q3_InsertingAtIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList ll = new LinkedList();
        ll.addLast(10);
        ll.addLast(20);
        ll.addLast(30);
        System.out.println("Enter the element to insert: ");
        int n = sc.nextInt();
        System.out.println("Enter the index of the element to insert: ");
        int idx = sc.nextInt();

        ll.addAt(n,idx);
        ll.display();
    }
}
