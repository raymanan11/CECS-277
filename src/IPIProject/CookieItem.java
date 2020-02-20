package IPIProject;

/**
 * @author Ryan Gieg
 * @author Raymond An<br>
 */
public class CookieItem extends DessertItem {
    private int numCookies;
    private int centsPerDozen;
    private int calories;

    /**
     *
     * @param name The game of this type of cookie
     */
    public CookieItem(String name, int numCookies, int centsPerDozen) {
        super(name);
        this.numCookies = numCookies;
        this.centsPerDozen = centsPerDozen;
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
    public int getNumCookies() {
        return this.numCookies;
    }
//----------------------------------------------------------------------------------------------------------------------
    /**
     *
     * @return
     */
    public double getCentsPerDozen() {
        return this.centsPerDozen;
    }
//----------------------------------------------------------------------------------------------------------------------
    /**
     *
     * @return Cost of cookie order based on the price per dozen cookies and the number of cookies ordered
     */
    @Override
    public double getCost() {
        return (int) Math.round(numCookies / 12.0 * centsPerDozen);
    }
//----------------------------------------------------------------------------------------------------------------------
    /**
     *
     * @return
     */
    public String toString() {
        return "------------------------------------------------------------------------------------------------" +
                "\n" + name + "(cookie)" + "\n" + numCookies + " @ " + (centsPerDozen / 100.0) + " /dz." +
                "\nPrice: " + (getCost() / 100.0) + "\nCalories: " + calories;
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
        } else {
            return 0;
        }
    }
}
