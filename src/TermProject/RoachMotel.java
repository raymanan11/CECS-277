package TermProject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;


/**
 * @author Raymond An
 * @author Ryan Gieg<br>
 * May 7th, 2020<br>
 * Purpose: Handles Checking In and Checking Out for Roach Colonies
 */
public class RoachMotel {

    private static RoachMotel roachMotel;
    private ArrayList<Integer> availableMotelRooms;
    private HashMap<MotelRoom, RoachColony> occupiedRooms;
    private MotelRoomFactory factory;

    /**
     *  Default Constructor to initialize available motel rooms arraylist and
     *  occupied rooms hashmap
     */
    private RoachMotel() {
        availableMotelRooms = new ArrayList<>();
        occupiedRooms = new HashMap<>();
    }

    /**
     * Singleton to make sure only one instance of RoachMotel is used
     * @return instance of RoachMotel
     */
    public static synchronized RoachMotel getInstance() {
        if(roachMotel == null) {
            roachMotel = new RoachMotel();
        }

        return roachMotel;
    }

    /**
     * Generates 5 randomly numbered rooms that Roach Colonies will have
     */
    public void createRooms() {
        Random rand = new Random();
        int min = 100;
        int max = 200;

        for(int i = 0; i < 5; i++) {
            MotelRoom room = new BasicRoom();
            availableMotelRooms.add(rand.nextInt((max - min) + 1) + min);
        }
    }

    /**
     * Sets factory to be used for creating rooms and adding amenities
     * @param factory
     */
    public void setMotelFactory(MotelRoomFactory factory) {
        this.factory = factory;
    }

    /***
     * checks in a Roach Colony. They either can check in if there are available rooms
     * or not because rooms are all taken up
     * @param roachColony roach colony that has name, population, and payment method
     * @param roomType what type of room they want (Basic, Deluxe, or Suite)
     * @param amenities what amenities they want to include in their rooms (FoodBar, Shower, AutoRefill, Spa)
     * @return Motel Room with Description Room type, Amenities included, and price
     */
    public MotelRoom checkIn(RoachColony roachColony, String roomType, ArrayList<String> amenities) {
        System.out.println("Available rooms: " + availableMotelRooms);

        // 2 times that room can be null.
        // 1.) if user chooses a roomType that is invalid
        // 2.) if no more rooms available
        MotelRoom room = null;
        if(availableMotelRooms.size() > 0) {
            room = factory.getMotelRoom(roomType, amenities);
            // room is null if the room type that user typed is not one that is offered
            if(room == null) {
                System.out.println("Invalid Room Type!");
                return null;
            }
            occupiedRooms.put(room, roachColony);
            roachColony.setRoomInfo(availableMotelRooms.get(0), room.cost(), room);
            if(amenities.contains("shower")) {
                roachColony.shower(true);
            }
            System.out.println("Amenities: " + amenities);
            System.out.println(room);
            availableMotelRooms.remove(0);
        }
        else {
            System.out.println("Motel is at full capacity!");
        }

        return room;
    }

    /**
     *
     * @param roachColony roach colony that has a room and room number
     * @param numDays number of days Roach Colony stayed
     * @return total price of motel stay
     */
    public double checkOut(RoachColony roachColony, int numDays) {
        double totalPayment = 0;
        if(roachColony.getRoom() != null) {
            totalPayment = roachColony.getRoomCost() * numDays;
            roachColony.getPayment().pay(totalPayment);
            availableMotelRooms.add(roachColony.getRoomNumber());
            occupiedRooms.remove(roachColony.getRoom());
            System.out.println("Room number is " + roachColony.getRoomNumber());
        }
        else {
            System.out.println("Sorry not able to check out because you don't have a room!");
        }
        return totalPayment;
    }


    @Override
    /**
     * Shows occupied rooms stating room type and amenities and also shows available motel rooms
     */
    public String toString() {
        return "Occupied Rooms: " + occupiedRooms + " Available: " + availableMotelRooms;
    }
}
