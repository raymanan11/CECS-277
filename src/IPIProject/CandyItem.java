package IPIProject;

/**
 * @author Ryan Gieg
 * @author Raymond An<br>
 *
 */
public class CandyItem extends DessertItem {
    private double weight;
    private int centsPerPound;
    private int calories;
    private final double HUNDRED = 100;

    /**
     *
     * @param name Name of the Candy object
     * @param weight Amount of candy ordered in lbs.
     * @param centsPerPound Cost, in cents, of the Candy object per lb.
     */
    public CandyItem(String name, double weight, int centsPerPound) {
        super(name);
        this.weight = Math.round(weight * 100.0) / 100.0;
        this.centsPerPound = centsPerPound;
    }
//----------------------------------------------------------------------------------------------------------------------
    /**
     *
     */
    public void setCalories(int calories) {
        this.calories = calories;
    }
//----------------------------------------------------------------------------------------------------------------------
    /**
     *
     * @return
     */
    @Override
    public int getCalories() {
        return calories;
    }
//----------------------------------------------------------------------------------------------------------------------
    /**
     *
     * @return
     */
    public double getWeight() {
        return this.weight;
    }
//----------------------------------------------------------------------------------------------------------------------
    /**
     *
     * @return
     */
    public double getCentsPerPound() {
        return this.centsPerPound;
    }
//----------------------------------------------------------------------------------------------------------------------
    /**
     *
     * @return Cost of candy order based on the candy's price per pound and weight of the order
     */
    @Override
    public double getCost() {
        return (int) (Math.round(weight * centsPerPound)) / HUNDRED;
    }
//----------------------------------------------------------------------------------------------------------------------
    /**
     *
     * @return
     */
    public String toString() {
        return getName() + "(Candy)" + "\n" + weight + " @ " + (centsPerPound / 100.0) + " /dz." +
                "\nPrice: " + getCost() + "\nCalories: " + calories;
    }
//----------------------------------------------------------------------------------------------------------------------
    /**
     *
     * @param o
     * @return
     */
    @Override
    public int compareTo(Object o) {
        if(this.getCalories() > ((DessertItem) o).getCalories()) {
            return 1;
        } else if(this.getCalories() < ((DessertItem) o).getCalories()) {
            return -1;
        }
        return 0;
    }

    public String getType() {
        return "(Candy)";
    }
}
