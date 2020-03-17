package MidtermPractice;

public class Regular extends Employee {

    public Regular(String name, int monthlySalary) {
        super(name, monthlySalary);
    }

    public int calculateBonus() {
        return 0;
    }

    @Override
    public String toString() {
        return "Regular Worker";
    }
}
