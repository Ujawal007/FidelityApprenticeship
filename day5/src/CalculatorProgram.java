//Q8

import java.util.Scanner;

public class CalculatorProgram {
    public int Addition(int a, int b){
        System.out.print("Result of " + a +" + " + b + " is ");
        return a+b;
    }
    public int Subtraction(int a, int b){
        System.out.print("Result of " + a +" - " +b +" is ");
        return a-b;
    }
    public int Multiplication(int a, int b){
        System.out.print("Result of " + a +" * " +b +" is ");
        return a*b;
    }
    public double Division(int a, int b){
        System.out.print("Result of " + a +" / " +b +" is ");
        if(b==0){
            System.out.println("Not defined");
            return a/b;
        }
        System.out.println(a/b);
        System.out.println("Remainder = "+a%b);

        return a/b;
    }
}

class Program{
    public static void main(String[] args){

        CalculatorProgram program = new CalculatorProgram();

        while(true){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the operator");
            char operator = sc.next().charAt(0);

            System.out.println("Enter the operands");
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();

            switch(operator){
                case '+':
                    System.out.println(program.Addition(num1, num2));
                    break;
                case '-':
                    System.out.println(program.Subtraction(num1, num2));
                    break;
                case '*':
                    System.out.println(program.Multiplication(num1, num2));
                    break;
                case '/':
                    try{
                        double d = program.Division(num1, num2);
                    }
                    catch (ArithmeticException e){
                        System.out.println(e.getMessage());
                    }
                    break;
                default:
                    System.out.println("Invalid operator");
                    System.exit(0);
                    break;
            }
            System.out.println();
        }

    }
}