package ClassesProject;

public class Operator extends User {
    public Operator() {
        super();
    }

    public Operator(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Operator " + getName();
    }
}
