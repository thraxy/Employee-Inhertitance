import java.util.Date;

// ProductionWorker class inherits from Employee class
public class ProductionWorker extends Employee {

    // private fields for ProductionWorker class
    private int shift;
    private double hourlyPayRate;

    // constructor for ProductionWorker class that throws exceptions
    public ProductionWorker(String name, String employeeNum, Date hireDate, int shift, double hourlyPayRate)
            throws InvalidEmployeeNumber, InvalidShift, InvalidPayRate {
        super(name, employeeNum, hireDate);
        this.shift = shift;
        this.hourlyPayRate = hourlyPayRate;
    }

    // getters and setters for ProductionWorker class
    public int getShift() {
        return shift;
    }

    public double getHourlyPayRate() {
        return hourlyPayRate;
    }

    // setshift and sethourlypayrate methods throw exceptions
    public void setShift(int shift) throws InvalidShift {
        // if shift is less than 0, throw InvalidShift exception
        if (shift < 0 || shift > 3) {
            throw new InvalidShift();
        }
        this.shift = shift;
    }

    public void setHourlyPayRate(double hourlyPayRate) throws InvalidPayRate {
        // if hourlyPayRate is less than 0, throw InvalidPayRate exception
        if (hourlyPayRate < 0) {
            throw new InvalidPayRate();
        }
        this.hourlyPayRate = hourlyPayRate;
    }

    // toString method for ProductionWorker class
    // if shift is 1, shift is day
    // if shift is 2, shift is night
    // if shift is 3, shift is midshift
    // if shift is not 1, 2, or 3, shift is invalid
    public String toString() {
        if (shift == 1) {
            return super.toString() + "\nShift: Day" + "\nHourly Pay Rate: $" + hourlyPayRate;
        } else if (shift == 2) {
            return super.toString() + "\nShift: Night" + "\nHourly Pay Rate: $" + hourlyPayRate;
        } else if (shift == 3) {
            return super.toString() + "\nShift: Midshift" + "\nHourly Pay Rate: $" + hourlyPayRate;
        }
        return super.toString() + "\nShift: Invalid" + "\nHourly Pay Rate: $" + hourlyPayRate;
    }

}
