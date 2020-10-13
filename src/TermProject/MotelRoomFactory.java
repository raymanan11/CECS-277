package TermProject;

import java.util.ArrayList;

/**
 * @author Raymond An
 * @author Ryan Gieg<br>
 * May 7th, 2020<br>
 * Purpose: Implement the factory pattern which is used to update room type and amenities
 * that come with the room
 */
public class MotelRoomFactory {
    private MotelRoom room;

    /**
     * Default constructor that initializes room
     */
    public MotelRoomFactory() {
        room = null;
    }

    /**
     * Parameterized constructor to allow input for room type and amenities
     * @param type
     * @param amenities
     * @return updated Motel Room with room type as well as amenities
     */
    public MotelRoom getMotelRoom(String type, ArrayList<String> amenities) {
        room = null;

        String lowercaseType = type.toLowerCase();
        if("suite".equals(lowercaseType)) {
            room = new SuiteRoom();
        }
        else if("deluxe".equals(lowercaseType)) {
            room = new DeluxeRoom();
        }

        else if("basic".equals(lowercaseType)) {
            room = new BasicRoom();
        }
        else {
            System.out.println("Room has to be either Basic, Deluxe, or Suite, not " + type);
            return null;
        }

        return addAmenities(room, amenities);
    }

    /**
     * Takes room and adds any amenities that Roach Colony wants
     * @param room
     * @param amenities
     * @return updated Motel Room with amenities
     */
    public MotelRoom addAmenities(MotelRoom room, ArrayList<String> amenities) {
        for(String amenity : amenities) {
            String lowercaseAmenity = amenity.toLowerCase();
            if(lowercaseAmenity.equals("foodbar")) {
                room = new FoodBar(room);
            }
            else if(lowercaseAmenity.equals("spa")) {
                room = new Spa(room);
            }
            else if(lowercaseAmenity.equals("refillbar")) {
                room = new AutoRefillFoodBar(room);
            }
            else if(lowercaseAmenity.equals("shower")) {
                room = new SprayResistantShower(room);
            }
            else {
                System.out.println("Amenities need to be either foodbar, spa, refillbar, or shower not " + amenity);
            }
        }
        return room;
    }

    /**
     *
     * @return the factory for Factory Design Pattern
     */
    @Override
    public String toString() {
        return "Motel Room Factory";
    }
}
