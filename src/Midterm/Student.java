package Midterm;

public abstract class Student {
    private String firstName;
    private String major;
    private int numUnitsTaken;

    public Student(String firstName, String major, int numUnitsTaken) {
        this.firstName = firstName;
        this.major = major;
        this.numUnitsTaken = numUnitsTaken;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getMajor() {
        return major;
    }

    public void setNumUnitsTaken(int numUnitsTaken) {
        this.numUnitsTaken = numUnitsTaken;
    }

    public int getNumUnitsTaken() {
        return numUnitsTaken;
    }

    abstract public int calculateTuition(int units);
}
