import java.util.Calendar;
import java.util.Date;

// main demo class
public class Main {

    // main method to run the program and test the classes
    public static void main(String[] args) throws InvalidEmployeeNumber, InvalidShift, InvalidPayRate {
        // create a new date object to use for hire dates
        Date hireDate = new Date();
        Date hiringEventDate = new Date(2020, Calendar.APRIL, 1);
        Date bossHireDate = new Date(2020, Calendar.JANUARY, 1);

        // create a new employee object and print out the details
        // Production worker is a subclass of Employee
        ProductionWorker worker = new ProductionWorker("Nabil Akbar", "121-A", hireDate, 1, 15.50);
        ProductionWorker worker2 = new ProductionWorker("Elon Musk", "111-A", hiringEventDate, 1, 9.50);
        ProductionWorker worker3 = new ProductionWorker("Jeff Bezos", "112-A", hiringEventDate, 2, 9.50);
        ProductionWorker worker4 = new ProductionWorker("Bill Gates", "113-A", hiringEventDate, 2, 9.50);
        ProductionWorker worker5 = new ProductionWorker("Mark Zuckerberg", "114-A", hiringEventDate, 3, 9.50);
        ProductionWorker worker6 = new ProductionWorker("Steve Jobs", "115-A", hiringEventDate, 3, 9.50);

        // create a new shift supervisor object and print out the details
        // Shift Supervisor is a subclass of Employee
        ShiftSupervisor supervisor = new ShiftSupervisor("Nabilo Akbaro", "132-B", hireDate, 50000, 10000);
        ShiftSupervisor boss = new ShiftSupervisor("Michael Chu", "1-B", bossHireDate, 1000000000, 1000000000);

        // create a new team leader object and print out the details
        // Team Leader is a subclass of Production Worker
        TeamLeader teamleader = new TeamLeader("Nabilu Akbaru", "133-C", hireDate, 3, 15.50, 1000, 100, 50);

        // testing the toString methods
        System.out.println(worker.toString() + '\n');
        System.out.println(supervisor.toString() + '\n');
        System.out.println(teamleader.toString() + '\n');
        System.out.println(boss.toString() + '\n');
        System.out.println(worker2.toString() + '\n');
        System.out.println(worker3.toString() + '\n');
        System.out.println(worker4.toString() + '\n');
        System.out.println(worker5.toString() + '\n');
        System.out.println(worker6.toString() + '\n');

        // testing expections
        // try to set invalid values for each of the attributes
        // and catch the exceptions
        // print out the error message
        try {
            worker.setEmployeeNum("12345");
        } catch (InvalidEmployeeNumber e) {
            System.out.println(e.getMessage());
        }

        try {
            worker.setEmployeeNum("ALT-1");
        } catch (InvalidEmployeeNumber e) {
            System.out.println(e.getMessage());
        }
        try {
            worker.setEmployeeNum("ALT-A");
        } catch (InvalidEmployeeNumber e) {
            System.out.println(e.getMessage());
        }

        try {
            worker.setEmployeeNum("123-a");
        } catch (InvalidEmployeeNumber e) {
            System.out.println(e.getMessage());
        }

        try {
            worker.setEmployeeNum("123-Z");
        } catch (InvalidEmployeeNumber e) {
            System.out.println(e.getMessage());
        }

        try {
            worker.setEmployeeNum("123-AB-C");
        } catch (InvalidEmployeeNumber e) {
            System.out.println(e.getMessage());
        }

        try {
            worker.setEmployeeNum("123-AB");
        } catch (InvalidEmployeeNumber e) {
            System.out.println(e.getMessage());
        }

        try {
            worker.setShift(-1);
        } catch (InvalidShift e) {
            System.out.println(e.getMessage());
        }

        try {
            worker.setHourlyPayRate(-1);
        } catch (InvalidPayRate e) {
            System.out.println(e.getMessage());
        }
    }

}
