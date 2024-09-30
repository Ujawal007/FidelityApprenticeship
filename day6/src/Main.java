import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Insurance number");
        String insuranceNo = sc.nextLine();
        System.out.println("Enter Insurance Name");
        String insuranceName = sc.nextLine();
        System.out.println("Enter Amount covered");
        double covered = sc.nextDouble();
        System.out.println("Enter Insurance option 1. For Life Insurance,   2. For Motor Insurance");
        int option = sc.nextInt();
        Insurance ins = null;

        if (option == 1) {
            LifeInsurance li = new LifeInsurance();
            li.setInsuranceNo(insuranceNo);
            li.setInsuranceName(insuranceName);
            li.setAmountCovered(covered);

            System.out.println("Enter Policy term(in years)");
            li.setPolicyTerm(sc.nextInt());
            System.out.println("Enter Benefit percentage");
            li.setBenefitPercent(sc.nextFloat());

            ins = li;
        }
        else if (option == 2) {
            MotorInsurance mi = new MotorInsurance();
            mi.setInsuranceNo(insuranceNo);
            mi.setInsuranceName(insuranceName);
            mi.setAmountCovered(covered);

            System.out.println("Enter Depreciation percentage");
            mi.setDepPercent(sc.nextFloat());
            ins = mi;
        }
        else{
            System.out.println("Invalid option");
            return;
        }
        double premium = addPolicy(ins,option);
        System.out.println("Calculated premium: " + premium);
    }

    public static double addPolicy(Insurance ins, int opt){
        if(opt == 1){
            return ((LifeInsurance) ins).calculatePremium();
        }
        else if(opt == 2){
            return ((MotorInsurance) ins).calculatePremium();
        }
        return 0;
    }
}


