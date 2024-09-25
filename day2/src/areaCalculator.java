import java.util.Scanner;

public class areaCalculator {


    float calculateArea(float side){
        return side*side;
    }

    double calculateArea(double length, double breadth){
        return length*breadth;
    }
    double calculateArea(double radius){
        return Math.PI*radius*radius;
    }

    public static void main(String[] args) {

        areaCalculator calc = new areaCalculator();
        Scanner sc = new Scanner(System.in);

        float squareArea = calc.calculateArea(5.0f);
        double rectangleArea = calc.calculateArea(6.0,4.0);
        double circleArea = calc.calculateArea(3.5);

        System.out.println(squareArea);
        System.out.println(rectangleArea);
        System.out.println(circleArea);
    }
}
