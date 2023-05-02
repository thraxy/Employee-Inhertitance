import java.util.Date;

// ShiftSupervisor class inherits from Employee class
public class ShiftSupervisor extends Employee {

    // private fields
    private double annualSalary;
    private double annualProductionBonus;

    // constructor for ShiftSupervisor class
    public ShiftSupervisor(String name, String employeeNum, Date hireDate, double annualSalary,
            double annualProductionBonus) {
        super(name, employeeNum, hireDate);
        this.annualSalary = annualSalary;
        this.annualProductionBonus = annualProductionBonus;
    }

    // getters and setters for ShiftSupervisor class
    public double getAnnualSalary() {
        return annualSalary;
    }

    public double getAnnualProductionBonus() {
        return annualProductionBonus;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    public void setAnnualProductionBonus(double annualProductionBonus) {
        this.annualProductionBonus = annualProductionBonus;
    }

    // toString method for ShiftSupervisor class
    public String toString() {
        return super.toString() + "\nAnnual Salary: $" + annualSalary + "\nAnnual Production Bonus: $"
                + annualProductionBonus;
    }
}
