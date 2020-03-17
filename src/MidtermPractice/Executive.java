package MidtermPractice;

public class Executive extends Manager {

    public Executive(String name, int monthlySalary, String department) {
        super(name, monthlySalary,department);

    }

    @Override
    public int calculateBonus() {
        return getMonthlySalary() * 3;
    }

    @Override
    public String toString() {
        return "Executive";
    }
}
