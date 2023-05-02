// Class that throws an exception if the pay rate is invalid (less than 0)
public class InvalidPayRate extends Exception {
    public InvalidPayRate() {
        super("Error: Invalid pay rate.");
    }
}
