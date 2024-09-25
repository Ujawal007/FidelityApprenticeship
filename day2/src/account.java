//Q2

public class account {
    private long accno;
    private String name;
    private int balance;

    account(long accno, String name, int balance) {
        this.accno = accno;
        this.name = name;
        this.balance = balance;
    }

    void deposit(int amount) {
        balance = balance + amount;
        System.out.println("Account no: "+accno);
        System.out.println("Customer name: "+name);
        System.out.println("Balance: "+balance);
    }
    void withdraw(int amount) {
        if(amount > balance) {
            System.out.println("Insufficient balance");
            return;
        }
        balance = balance - amount;
        System.out.println("Account no: "+accno);
        System.out.println("Customer name: "+name);
        System.out.println("Balance: "+balance);
    }
    void checkAccBal(){
        System.out.println(balance);
    }

    public static void main(String[] args) {

        account a = new account(1234,"ABC",0);
        a.deposit(1000);

    }
}
