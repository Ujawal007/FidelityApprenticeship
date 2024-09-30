public class Insurance {
    private String insuranceNo;
    private String insuranceName;
    private double amountCovered;

    public String getInsuranceNo() {
        return insuranceNo;
    }
    public void setInsuranceNo(String insuranceNo) {
        this.insuranceNo = insuranceNo;
    }
    public String getInsuranceName() {
        return insuranceName;
    }
    public void setInsuranceName(String insuranceName) {
        this.insuranceName = insuranceName;
    }
    public double getAmountCovered() {
        return amountCovered;
    }
    public void setAmountCovered(double amountCovered) {
        this.amountCovered = amountCovered;
    }

}

class MotorInsurance extends Insurance {
    private double idv;
    private float depPercent;

    public float getDepPercent() {
        return depPercent;
    }
    public void setDepPercent(float depPercent) {
        this.depPercent = depPercent;
    }
    public double getIdv() {
        return idv;
    }
    public void setIdv(double idv) {
        this.idv = idv;
    }

    public double calculatePremium(){
        idv = getAmountCovered() - ((getAmountCovered()*depPercent)/100);
        return 0.03*idv;
    }
}

class LifeInsurance extends Insurance {
    private int policyTerm;
    private float benefitPercent;

    public int getPolicyTerm() {
        return policyTerm;
    }
    public void setPolicyTerm(int policyTerm) {
        this.policyTerm = policyTerm;
    }
    public float getBenefitPercent() {
        return benefitPercent;
    }
    public void setBenefitPercent(float benefitPercent) {
        this.benefitPercent = benefitPercent;
    }

    public double calculatePremium(){
        return (getAmountCovered() - ((getAmountCovered()*benefitPercent)/100))/policyTerm;
    }
}

