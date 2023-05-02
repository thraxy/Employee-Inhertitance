import java.util.Date;

// Employee class is the superclass for ProductionWorker, ShiftSupervisor, and
class Employee {
    // private fields for Employee class
    private String name;
    private String employeeNum;
    private Date hireDate;

    // constructor for Employee class
    public Employee(String name, String employeeNum, Date hireDate) {
        this.name = name;
        this.employeeNum = employeeNum;
        this.hireDate = hireDate;
    }

    // getters and setters for Employee class
    public String getName() {
        return name;
    }

    public String getEmployeeNum() {
        return employeeNum;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setName(String name) {
        this.name = name;
    }

    // setEmployeeNum method throws InvalidEmployeeNumber exception
    public void setEmployeeNum(String employeeNum) throws InvalidEmployeeNumber {
        // if the first 3 characters of employeeNum are not digits, throw
        // InvalidEmployeeNumber
        if (!Character.isDigit(employeeNum.charAt(0)) || !Character.isDigit(employeeNum.charAt(1))
                || !Character.isDigit(employeeNum.charAt(2))) {
            throw new InvalidEmployeeNumber();
        }
        // if employeeNum is not 5 characters, throw InvalidEmployeeNumber
        if (employeeNum.length() != 5) {
            throw new InvalidEmployeeNumber();
        }
        // if employeNum letter is out of range(A-M), throw InvalidEmployeeNumber
        if (employeeNum.charAt(3) != '-' || employeeNum.charAt(4) < 'A' || employeeNum.charAt(4) > 'M') {
            throw new InvalidEmployeeNumber();
        }
        // if employeeNum is not 4 digits, throw InvalidEmployeeNumber exception
        int num = Integer.parseInt(employeeNum.substring(0, 3));
        // if employeeNum is less than 0 or greater than 999, throw
        // InvalidEmployeeNumber
        if (num < 0 || num > 999) {
            throw new InvalidEmployeeNumber();
        }
        this.employeeNum = employeeNum;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    // toString method for Employee class
    public String toString() {
        return "Name: " + name + "\nEmployee Number: " + employeeNum + "\nHire Date: " + hireDate;
    }
}