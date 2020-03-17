package MidtermPractice;

public class Manager extends Employee {
    private String department;

    public Manager(String name, int monthlySalary, String department) {
        super(name, monthlySalary);
        this.department = department;
    }

    public int calculateBonus() {
        return getMonthlySalary() * 2;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "Manager";
    }
}
