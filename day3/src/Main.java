public class Main {
    public static void main(String[] args) {

       PermanentEmployee pe = new PermanentEmployee(1500);
       pe.ID = 101;
       pe.Name = "Esther";
       pe.BasicSalary = 25000f;
       pe.calBonus();
       pe.NS();
       pe.display();

       System.out.println();

       TemporaryEmployee te = new TemporaryEmployee(1500,20);
       te.ID = 102;
       te.Name = "Ganesh";
       te.calBonus();
       te.NS();
       te.display();
    }
}