package Midterm;

public class Graduate extends Student {

    public Graduate(String firstName, String major, int numUnitsTaken) {
        super(firstName, major, numUnitsTaken);
    }

    @Override
    public int calculateTuition(int units) {
        return getNumUnitsTaken() * 500;
    }

    @Override
    public String toString() {
        return "Graduate";
    }
}
