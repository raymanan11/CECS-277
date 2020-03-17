package Midterm;

import java.util.ArrayList;

public class StudentTester {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        UnderGrad underGrad = new UnderGrad("Raymond An", "Computer Science", 60);
        Graduate graduate = new Graduate("Jackie Chan", "Martial Arts", 70);
        PostGraduate postGraduate = new PostGraduate("Michael Jackson", "Dance", 80);

        students.add(underGrad);
        students.add(graduate);
        students.add(postGraduate);

        for (Student student : students) {
            int numUnits = student.getNumUnitsTaken();
            System.out.println(student.getFirstName() + " is a " + student.getMajor() + " major and has taken "
            + student.getNumUnitsTaken() + " units.");
            System.out.println(student.getFirstName() + "'s total tuition is " + student.calculateTuition(numUnits) + " dollars and is a " + student + "\n");
        }

    }
}
