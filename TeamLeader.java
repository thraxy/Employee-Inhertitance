import java.util.Date;

// TeamLeader class inherits from ProductionWorker class
public class TeamLeader extends ProductionWorker {

    // private fields for TeamLeader class
    private double monthlyBonus;
    private int requiredTrainingHours;
    private int attendedTrainingHours;

    // constructor for TeamLeader class that throws exceptions
    public TeamLeader(String name, String employeeNum, Date hireDate, int shift, double hourlyPayRate,
            double monthlyBonus, int requiredTrainingHours, int attendedTrainingHours)
            throws InvalidEmployeeNumber, InvalidShift, InvalidPayRate {
        super(name, employeeNum, hireDate, shift, hourlyPayRate);
        this.monthlyBonus = monthlyBonus;
        this.requiredTrainingHours = requiredTrainingHours;
        this.attendedTrainingHours = attendedTrainingHours;
    }

    // getters and setters for TeamLeader class
    public double getMonthlyBonus() {
        return monthlyBonus;
    }

    public int getRequiredTrainingHours() {
        return requiredTrainingHours;
    }

    public int getAttendedTrainingHours() {
        return attendedTrainingHours;
    }

    public void setMonthlyBonus(double monthlyBonus) {
        this.monthlyBonus = monthlyBonus;
    }

    public void setRequiredTrainingHours(int requiredTrainingHours) {
        this.requiredTrainingHours = requiredTrainingHours;
    }

    public void setAttendedTrainingHours(int attendedTrainingHours) {
        this.attendedTrainingHours = attendedTrainingHours;
    }

    // toString method for TeamLeader class
    public String toString() {
        return super.toString() + "\nMonthly Bonus: $" + monthlyBonus + "\nRequired Training Hours: "
                + requiredTrainingHours + "\nAttended Training Hours: " + attendedTrainingHours;
    }
}