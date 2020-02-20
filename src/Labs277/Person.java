package Labs277;
import java.lang.Comparable;

public class Person implements Measurable, Comparable {
    private String first;
    private String last;
    private int age;


    public Person(String first, String last, int age) {
        this.first = first;
        this.last = last;
        this.age = age;
    }

    @Override
    public double getMeasure() {
        return age;
    }

    @Override
    public int compareTo(Object obj) {
        return first.compareTo(((Person) obj).first);
    }

    @Override
    public String toString() {
        return first;
    }
}
