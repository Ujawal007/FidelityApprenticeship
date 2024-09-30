import java.util.Scanner;

public class ABC {

    public static double GetGrossPay(int hoursWorked){
        double standardRate = 80;
        int standardHour = 56;

        if(hoursWorked <= standardHour){
            return hoursWorked*standardRate;
        }
        else{
            int overtime = hoursWorked - standardHour;
            return (standardHour*standardRate) + (overtime*1.5*standardRate);
        }
    }

    public static double CalculateTax(double grossPay){
        return grossPay*0.02;
    }

    public static double CalculateNetPay(int hoursWorked){
        double grossPay = GetGrossPay(hoursWorked);
        double taxAmt = CalculateTax(grossPay);
        return grossPay-taxAmt;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of hours worked: ");
        int hoursWorked = sc.nextInt();
        double netPay = CalculateNetPay(hoursWorked);
        System.out.println("The calculated net pay is: " + netPay);

    }
}
