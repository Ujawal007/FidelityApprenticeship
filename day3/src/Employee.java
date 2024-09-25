public class Employee {

    int ID;
    String Name;
    Float BasicSalary;
    Float Bonus;
    Float NetSalary;

}

class PermanentEmployee extends Employee {

    int PF;

    PermanentEmployee(int PF){
        this.PF = PF;
    }

    float NS(){
        NetSalary = BasicSalary-PF;
        return NetSalary;
    }

    float calBonus(){
        if(PF<1000){
            Bonus = (0.1f)*this.BasicSalary;
        }
        if(PF >= 1000 && PF < 1500){
            Bonus = (0.115f)*this.BasicSalary;
        }
        if(PF >= 1500 && PF < 1800){
            Bonus = (0.12f)*this.BasicSalary;
        }
        if(PF >= 1800){
            Bonus = (0.15f)*this.BasicSalary;
        }
        return Bonus;
    }


    void display(){
        System.out.println("Employee ID: " + ID);
        System.out.println("Employee Name: " + Name);
        System.out.println("Basic Salary: " + BasicSalary);
        System.out.println("PF: " + PF);
        System.out.println("Bonus: " + Bonus);
        System.out.println("Net Salary: " + NetSalary);
    }

}

class TemporaryEmployee extends Employee {
    int DailyWages;
    int NoOfDays;

    TemporaryEmployee(int DailyWages, int NoOfDays){
        this.DailyWages = DailyWages;
        this.NoOfDays = NoOfDays;
    }

    float NS(){
        NetSalary = (DailyWages*NoOfDays)*1.0f;
        return NetSalary;
    }

    float calBonus(){
        if(DailyWages<1000){
            Bonus = (0.15f)*(DailyWages*NoOfDays);
        }
        if(DailyWages >= 1000 && DailyWages < 1500){
            Bonus = (0.12f)*(DailyWages*NoOfDays);
        }
        if(DailyWages >= 1500 && DailyWages < 1750){
            Bonus = (0.11f)*(DailyWages*NoOfDays);
        }
        if(DailyWages >= 1750){
            Bonus = (0.08f)*(DailyWages*NoOfDays);
        }
        return Bonus;
    }

    void display(){
        System.out.println("Employee ID: " + ID);
        System.out.println("Employee Name: " + Name);
        System.out.println("Daily Wages: " + DailyWages);
        System.out.println("No of Days worked: " + NoOfDays);
        System.out.println("Bonus: " + Bonus);
        System.out.println("Net Salary: " + NetSalary);
    }

}

