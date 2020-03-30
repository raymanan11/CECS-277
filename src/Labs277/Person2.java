package Labs277;

public class Person2 implements Comparable<Person2>
{
    private String firstName;
    private String lastName;

    public Person2(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() { return firstName; }

    public String getLastName() { return lastName; }

    public String toString()
    {
        return "Name: " + firstName + " " + lastName;
    }
    public int compareTo(Person2 p)
    {
        String pname1 = firstName + lastName;
        String pname2 = p.firstName + p.lastName;
        return pname1.compareTo(pname2);
    }
}