package Midterm;

public class UnderGrad extends Student {

    public UnderGrad(String firstName, String major, int numUnitsTaken) {
        super(firstName, major, numUnitsTaken);
    }

    @Override
    public int calculateTuition(int units) {
        return getNumUnitsTaken() * 250;
    }

    @Override
    public String toString() {
        return "Undergrad";
    }
}
