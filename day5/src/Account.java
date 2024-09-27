import java.util.Scanner;

public class Account {

    private int id;
    private String accType;
    private double balance;

    public Account(){

    }
    public Account(int id, String accType, double balance) {
        this.id = id;
        this.accType = accType;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getAccType() {
        return accType;
    }
    public void setAccType(String accType) {
        this.accType = accType;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public boolean Withdraw(double amount) {
        if(balance >= amount){
            double newBalance = balance - amount;
            return true;
        }
        return false;
    }

    public void GetDetails(){
        System.out.println("Account ID: " + id + "\nAccount Type: " + accType + "\nBalance: " + balance);
    }
}

class ProgramAccount{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter account ID: ");
        int id = sc.nextInt();
        System.out.println("Enter account type: ");
        String accType = sc.next();
        System.out.println("Enter account balance: ");
        double balance = sc.nextDouble();
        System.out.println("Enter amount to withdraw");
        double amtWithdraw = sc.nextDouble();

        Account acc = new Account(id, accType, balance);
        acc.GetDetails();
        double newBalance = 0;
        if(balance>=amtWithdraw) {
            System.out.println("New Balance: " + (balance-amtWithdraw));
        }
        else{
            System.out.println("Insufficient Balance");
        }
    }
}
