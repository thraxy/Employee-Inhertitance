// Class that throws an exception if the employee number is invalid (less than 0 or greater than 9999)
class InvalidEmployeeNumber extends Exception {
    public InvalidEmployeeNumber() {
        super("Error: Invalid employee number.");
    }
}
