package ClassesProject;

public class User {
    private String name;

    public User() {
        name = "";
    }

    public User(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User";
    }

    public String getName() {
        return name;
    }
}
