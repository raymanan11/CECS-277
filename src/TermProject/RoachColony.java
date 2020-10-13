package TermProject;

/**
 * @author Raymond An
 * @author Ryan Gieg<br>
 * May 7th, 2020<br>
 * Purpose: Holds information of Roach Colony like name, room info, payment, growth rate
 */
public class RoachColony {
    private String name;
    private int population;
    private double growthRate;
    private int roomNumber;
    private double roomCost;
    private MotelRoom room;
    private boolean hasShower = false;
    private Payment payment;

    /**
     * default constructor that initializes variables
     */
    public RoachColony() {
        name = "Roach Colony";
        population = 420;
        growthRate = .5;
        roomNumber = 142;
        roomCost = 120.00;
        room = new BasicRoom();
        payment = new RoachPal("roacheshavefeelingstoo32@gmail.com", "sdhrfcre3245");
    }

    /**
     * Parameterized constructor that allows input for name, population, growth rate, and form of payment
     * @param name
     * @param population
     * @param growthRate
     * @param payment
     */
    public RoachColony(String name, int population, double growthRate, Payment payment) {
        this.name = name;
        this.population = population;
        this.growthRate = growthRate;
        this.payment = payment;
    }

    /**
     * Update the information of Roach Colony like it's room number, cost
     * @param roomNumber
     * @param roomCost
     * @param room
     */
    public void setRoomInfo(int roomNumber, double roomCost, MotelRoom room) {
        this.roomNumber = roomNumber;
        this.roomCost = roomCost;
        this.room = room;
    }

    /**
     * Allows Roach Colony to party. After party Roach Colony increases by growth rate but
     * a percentage of them die depending if they have Spray Resistant shower as amenity
     */
    public void party() {
        int totalRoaches = (int)(population + (population * growthRate));
        // room is null if it is not able to check in because no more rooms or user chose a room that is not offered
        if(room == null) {
            System.out.println("Not able to have a party :( You don't have a room!");
        }
        else if(hasShower) {
            System.out.println("Wow! What a great party! Wait why are they spraying us with insecticide! AHHHHHHHH!");
            System.out.println("Good thing we have the spray resistant shower!");
            int numRoachesDead = (int)(totalRoaches * .25);
            System.out.println("Total Roaches now after growth rate of " + growthRate + ": " + totalRoaches);
            System.out.println("Roaches dead: " + numRoachesDead);
            population = totalRoaches - numRoachesDead;
        }
        else {
            System.out.println("Wow! What a great party! Wait why are they spraying us with insecticide! AHHHHHHHH!");
            System.out.println("We should've gotten the spray resistant shower!");
            int numRoachesDead = (int)(totalRoaches * .50);
            System.out.println("Total Roaches now after growth rate of " + growthRate + ": " + totalRoaches);
            System.out.println("Roaches dead: " + numRoachesDead);
            population = totalRoaches - numRoachesDead;
        }
    }

    /**
     * Sets whether roach colony has shower as an amenity
     * @param hasShower whether they have shower as an amenity
     */
    public void shower(boolean hasShower) {
        this.hasShower = hasShower;
    }

    /**
     *
     * @return room number
     */
    public int getRoomNumber() {
        return roomNumber;
    }

    /**
     *
     * @return cost of the room
     */
    public double getRoomCost() {
        return roomCost;
    }

    /**
     *
     * @return get the room
     */
    public MotelRoom getRoom() {
        return room;
    }

    /**
     *
     * @return total cost of the room for one day
     */
    public Payment getPayment() {
        return payment;
    }

    /**
     *
     * @return name of roach colony and it's population
     */
    @Override
    public String toString() {
        return name + " " + population;
    }
}
