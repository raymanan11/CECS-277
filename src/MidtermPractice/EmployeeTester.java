package MidtermPractice;

import java.util.ArrayList;

public class EmployeeTester {
    public static void main(String[] args) {
        ArrayList<Employee> workers = new ArrayList<>();

        Manager m1 = new Manager("Raymond An", 70000, "Management Department");
        Executive e1 = new Executive("Roger Federer", 100000, "Executive Department");
        Regular r1 = new Regular("Novak Djokovic", 50000);

        workers.add(m1);
        workers.add(e1);
        workers.add(r1);

        for (Employee employee : workers) {
            if(employee instanceof Manager) {
                Manager m2 = (Manager) employee;
                System.out.println(m2.getName() + " is a " + m2 + " and makes " + m2.getMonthlySalary()
                        + "\n" + "with a bonus of " + m2.calculateBonus() + " and is in the " + m2.getDepartment());
            }

            else if(employee instanceof Executive) {
                Executive e2 = (Executive) employee;
                System.out.println(e2.getName() + " is a " + e2 + " and makes " + e2.getMonthlySalary()
                        + "\n" + "with a bonus of " + e2.calculateBonus() + " and is in the " + e2.getDepartment());
            }
            else {
                System.out.println(employee.getName() + " is a " + employee + " and makes " + employee.getMonthlySalary()
                        + "\n" + "with a bonus of " + employee.calculateBonus());
            }
        }
    }


}
