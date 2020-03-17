package IPIProject;

public abstract class DessertItem implements Comparable{
    protected String name;

    /**
     * Null constructor for DessertItem class
     * calls the DesserItem(String name) constructor by giving it an empty string
     */
    public DessertItem() {
        this("");
    }
    /**
     * Initializes DessertItem data
     */
    public DessertItem(String name) {
        this.name = name;
    }
    /**
     * Returns name of DessertItem
     * @return name of DessertItem
     */
    public final String getName() {
        return name;
    }
    /**
     * Returns cost of DessertItem
     * @return cost of DessertItem
     */
    public abstract double getCost();

    public abstract int getCalories();

    public abstract int compareTo(Object d1);

    public static DessertItem max(DessertItem d1, DessertItem d2) {
        if(d1.compareTo(d2) > 0) {
            return d1;
        }
        else if(d1.compareTo(d2) < 0) {
            return d2;
        }
        return null;
    }

    public abstract String getType();
}
