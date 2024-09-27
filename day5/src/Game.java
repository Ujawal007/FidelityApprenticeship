import java.util.Scanner;

public class Game {

    private String name;
    private int maxNumPlayers;

    public String getName(){
        return name;
    }
    public int getMaxNumPlayers(){
        return maxNumPlayers;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setMaxNumPlayers(int maxNumPlayers){
        this.maxNumPlayers = maxNumPlayers;
    }

    public String toString(){
        return "Maximum number of players for " + name + " is " + maxNumPlayers;
    }
}

class GameWithTimeLimit extends Game {

    private int timeLimit;

    public int getTimeLimit(){
        return timeLimit;
    }
    public void setTimeLimit(int timeLimit){
        this.timeLimit = timeLimit;
    }

    public String toString(){
        return super.toString() + "\nTime Limit for " + getName() + " is " + timeLimit + " minutes";
    }
}

class ProgramGame{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

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