package tasks.salaryCalculator;
public class SalaryCalculator {
    public double hourlyRate;
    public int stateTaxRate,federalTaxRate,weeklyHours;
    public SalaryCalculator(double hourlyRate, int stateTaxRate, int federalTaxRate, int weekHours) {
        this.hourlyRate = hourlyRate;
        this.stateTaxRate = stateTaxRate;
        this.federalTaxRate = federalTaxRate;
        this.weeklyHours = weekHours;
    }
    public double salary(){
        return hourlyRate * weeklyHours * 52;
    }
    public double stateTax(){
        return salary()*stateTaxRate/100;
    }
    public double federalTax(){
        return salary()*federalTaxRate/100;
    }
    public double salaryAfterTax(){return salary()-stateTax()-federalTax();};

    public String toString() {
        return "SalaryCalculator{" +
                "salary=" + salary() +
                ", stateTax=" + stateTax() +
                ", federalTax=" + federalTax() +
                ", salaryAfterTax=" + salaryAfterTax() +
                '}';
    }
}
