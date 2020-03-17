package Midterm;

public class PostGraduate extends Graduate {

    public PostGraduate(String firstName, String major, int numUnitsTaken) {
        super(firstName, major, numUnitsTaken);
    }


    @Override
    public int calculateTuition(int units) {
        return getNumUnitsTaken() * 750;
    }

    @Override
    public String toString() {
        return "Post Graduate";
    }
}
