package IPIProject;

public class Sundae extends IceCream {
    private String topping = "";
    private int calories;
    private double toppingCost;

    public Sundae() {
        this("", 0);
    }

    public Sundae(String name, double cost) {
        super(name, cost);
    }

    /** Lets user choose a topping
     *
     * @param topping
     * @return cost of topping
     */
    public void setTopping(String topping) {
        topping = topping.toUpperCase();
        this.topping = topping;

        if(topping.equals("STRAWBERRIES")) {
            toppingCost = 1.5;
        }
        else if(topping.equals("SPRINKLES")) {
            toppingCost = 1;
        }
        else if(topping.equals("HOT FUDGE")) {
            toppingCost = 2;
        }
    }

    /**
     *
     * @return cost of topping
     */
    public double getToppingCost() {
        return toppingCost;
    }

    /**
     * Overrides the getCost() from IceCream because cost needs to include topping
     * @return total cost of Sundae
     */
    @Override
    public double getCost() {
        return super.getCost() + toppingCost;
    }

    /**
     * Overrides IceCream toString() because it's a Sundae not ice cream
     * @return name of Sundae
     */
    @Override
    public String toString() {
        if (topping.equals("")){
            topping = "no toppings";
        }
        return name + "(Sundae)" + " with " + topping +
                "\n" + "Price: " + getCost();
    }

    public String getType() {
        return "(Sundae)";
    }
}
