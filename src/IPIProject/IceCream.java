package IPIProject;

public class IceCream extends DessertItem {
    private double cost;
    public int calories;

    public IceCream() {
        this("", 0);
    }

    public IceCream(String name, double cost) {
        super(name);
        this.cost = cost;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public int getCalories() {
        return calories;
    }

    @Override
    public double getCost() {
        return cost;
    }

    public int compareTo(Object o) {
        if(this.getCalories() > ((DessertItem) o).getCalories()) {
            return 1;
        }
        else if(this.getCalories() < ((DessertItem) o).getCalories()) {
            return -1;
        }
        return 0;
    }

    // change toString to print out cost and name and calories
    public String toString() {
        return name + "(IceCream)" + "\n" + "Price: " + cost;
    }

    public String getType() {
        return "(Ice Cream)";
    }
}
