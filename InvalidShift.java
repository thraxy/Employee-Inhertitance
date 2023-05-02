// Class that throws an exception if the shift is invalid (less than 0)
public class InvalidShift extends Exception {
    public InvalidShift() {
        super("Error: Invalid Shift.");
    }
}
