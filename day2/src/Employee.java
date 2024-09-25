//HIERARCHICAL INHERITANCE

class Employee {
    String name;
    int employeeId;

    void work() {
        System.out.println(name + " is working.");
    }
}

class Manager extends Employee {
    void manage() {
        System.out.println(name + " is managing the team.");
    }
}

class Developer extends Employee {
    void develop() {
        System.out.println(name + " is writing code.");
    }

    public static void main(String[] args) {


        Developer dev = new Developer();
        dev.name = "ABC";
        dev.employeeId = 1;
        dev.work();
        dev.develop();


    }
}

