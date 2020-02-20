package Labs277;

import java.util.Arrays;
import java.util.Collections;

import static Labs277.Data.youngest;

public class PersonTester {
    public static void main(String[] args) {
        Person[] people = new Person[3];

        Person p1 = new Person("Raymond", "An", 19);
        Person p2 = new Person("Jackie", "Chan", 55);
        Person p3 = new Person("Lebron", "James", 35);

        people[0] = p1;
        people[1] = p2;
        people[2] = p3;

        Person someone = youngest(people);
        System.out.println("Youngest is: " + someone);
        Arrays.sort(people);

        for(Person person : people) {
            System.out.println(person);
        }
    }
}
