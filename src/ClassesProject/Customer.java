package ClassesProject;

public class Customer extends User{
    public Customer() {
        super();
    }

    public Customer(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return getName() + " bought ";
    }
}
