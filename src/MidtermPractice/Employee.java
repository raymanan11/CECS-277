package MidtermPractice;

public abstract class Employee {
    private String name;
    private int monthlySalary;

    public Employee(String name, int monthlySalary) {
        this.name = name;
        this.monthlySalary = monthlySalary;
    }

    public String getName() {
        return name;
    }

    public int getMonthlySalary() {
        return monthlySalary;
    }

    public abstract int calculateBonus();
}
