public class Vehicle {

    int regNo;
    String brand;

}

class car extends Vehicle {
    int numDoors;
    int carFeeParking;

    car(int carFeeParking){
        this.carFeeParking = carFeeParking;
    }

    void displayCPF(){
        System.out.println("Car Parking Fees: " +carFeeParking);

    }

}

class motorCycle extends Vehicle {
    String engineType;
    int motorCycleFees;

    motorCycle(int motorCycleFees){
        this.motorCycleFees = motorCycleFees;
    }

    void displaMCPF(){
        System.out.println("MotorCycle Fess: "+ motorCycleFees);

    }

}

class parkingfees{

    public static void main(String[] args) {

        car c = new car(500);
        c.displayCPF();

        motorCycle mc = new motorCycle(200);
        mc.displaMCPF();
    }
}
