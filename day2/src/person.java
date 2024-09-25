//Q3

public class person {

    private String name;
    int age;
    String gender;

    person(int age, String gender) {
        this.age = age;
        this.gender = gender;
    }

    String setter(String name) {
        this.name = name;
        return name;
    }

    void display(){
        System.out.println("Name of person is: "+name);
        System.out.println("Age is: "+age);
        System.out.println("Gender is: "+gender);
    }

    public static void main(String[] args) {

        person p = new person(20,"Male");
        p.setter("ABC");
        p.display();
    }
}
