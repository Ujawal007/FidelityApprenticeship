import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Employee {
    private int id;
    private String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
}

class EmpNotFound extends Exception {
    public EmpNotFound(String msg) {
        super(msg);
    }
}

class EmployeeList{
    private List<Employee> employees;

    public EmployeeList() {
        employees = new ArrayList<>();
    }
    public void addEmployee(Employee emp) {
        employees.add(emp);
    }
    public Employee findEmployee(int id) throws EmpNotFound {
        for (Employee emp : employees) {
            if (emp.getId() == id) {
                return emp;
            }
        }
        throw new EmpNotFound("Employee with ID " + id + " not found.");
    }
}

class Test{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Employee e1 = new Employee(1, "John");
        Employee e2 = new Employee(2, "Jane");
        Employee e3 = new Employee(3, "Mary");

        EmployeeList el = new EmployeeList();
        el.addEmployee(e1);
        el.addEmployee(e2);
        el.addEmployee(e3);

        try {
            System.out.println("Enter employee ID:");
            int id = sc.nextInt();
            Employee e = el.findEmployee(id);
            System.out.println("Employee found: " + e.getName());
        }
        catch (EmpNotFound e) {
            System.out.println(e.getMessage());
        }
    }
}