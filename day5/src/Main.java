import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


//        Question 10. Gamelnheritance
        Game g = new Game();
        System.out.println("Enter a game");
        g.setName(sc.nextLine());
        System.out.println("Enter the maximum number of players");
        g.setMaxNumPlayers(sc.nextInt());

        GameWithTimeLimit gtw = new GameWithTimeLimit();
        System.out.println("Enter a game that has time limit");
        gtw.setName(sc.next());
        System.out.println("Enter the maximum number of players");
        gtw.setMaxNumPlayers(sc.nextInt());
        System.out.println("Enter the time limit in minutes");
        gtw.setTimeLimit(sc.nextInt());

        System.out.println(g.toString());
        System.out.println(gtw.toString());
    }
}