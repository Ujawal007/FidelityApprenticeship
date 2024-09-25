//MULTI LEVEL INHERITANCE

class Car{
    int price;
    public Car(int price)
    {
        this.price = price;
        System.out.println("Class Car");
    }
    public void vehicleType()
    {
        System.out.println("Vehicle Type: Car");
    }
}


class Audi extends Car{
    public Audi(int price)
    {
        super(price);
        System.out.println("Class Audi");
    }
    public void brand()
    {
        System.out.println("Brand: Audi");
    }
    public void speed()
    {
        System.out.println("Max: 150Kmph");
    }
}


class Audi123 extends Audi{

    public Audi123(int price)
    {
        super(price);
        System.out.println("Audi Model: 123");
    }
    public void speed()
    {
        System.out.println("Max: 180Kmph");
    }


    public static void main(String args[])
    {
        Audi123 obj=new Audi123(6000000);
        obj.vehicleType();
        obj.brand();
        obj.speed();

    }
}