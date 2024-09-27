import java.time.LocalDate;
import java.util.Scanner;

public class Person {

    private String fname;
    private String lname;
    private LocalDate dob;

    public String getFname() {
        return fname;
    }
    public void setFname(String fname) {
        this.fname = fname;
    }
    public String getLname() {
        return lname;
    }
    public void setLname(String lname) {
        this.lname = lname;
    }
    public LocalDate getDob() {
        return dob;
    }
    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getAdult(){
        int age = LocalDate.now().getYear() - dob.getYear();
        return (age>=18)?"Adult":"Child";
    }

    public void DisplayDetails(){
        System.out.println("Fisrt Name: " + fname);
        System.out.println("Last Name: " + lname);
        int age = LocalDate.now().getYear() - dob.getYear();
        System.out.println("Age: " + age);
        System.out.println(getAdult());

    }
}

class ProgramPerson{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Person p = new Person();
        System.out.println("Enter First Name:");
        p.setFname(sc.next());
        System.out.println("Enter Last Name:");
        p.setLname(sc.next());
        System.out.println("Enter Date of Birth in (yyyy-mm-dd) format");
        String dobInput = sc.next();
        LocalDate dob = LocalDate.parse(dobInput);
        p.setDob(dob);
        p.DisplayDetails();
    }
}
