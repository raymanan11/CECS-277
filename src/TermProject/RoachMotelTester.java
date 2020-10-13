package TermProject;
import java.util.ArrayList;

/**
 * @author Raymond An
 * @author Ryan Gieg<br>
 * May 7th, 2020<br>
 * Purpose: Used to test functionality of checking in, checking out, of Roach Colonies
 * as well as whether Roach Colonies can check in depending on availability of rooms
 * Outputs: Information on Occupied Rooms, Available Rooms, as well as status of Checking
 * in and Checking Out
 */
public class RoachMotelTester {
    /**
     * Main method used to test functionality of Roach Motel
     * @param args
     */
    public static void main(String[] args) {
        RoachMotel rm = RoachMotel.getInstance();
        rm.setMotelFactory(new MotelRoomFactory());
        rm.createRooms();
        System.out.println(rm);

        RoachPal roachPal1 = new RoachPal("roachesrox100@roachmail.com", "roaches4evah");
        RoachColony rc1 = new RoachColony("first colony",100,.4, roachPal1);
        ArrayList<String> amenities = new ArrayList<>();
        amenities.add("FoodBar");
        amenities.add("spa");
        amenities.add("refillbar");
        amenities.add("shower");
        MotelRoom r1 = rm.checkIn(rc1,"Suite", amenities);
        System.out.println(rc1);
        rc1.party();
        System.out.println(rc1);
        System.out.println(rm);
        System.out.println();

        MasterRoach masterRoach2 = new MasterRoach("Rick Roach", "5824963592754923", "372", "10/21");
        RoachColony rc2 = new RoachColony("Second colony",200,0.5, masterRoach2);
        ArrayList<String> amenities2 = new ArrayList<>();
        amenities2.add("spa");
        amenities2.add("shower");
        MotelRoom r2 = rm.checkIn(rc2,"Deluxe",amenities2);
        System.out.println(rc2);
        System.out.println(rm);
        double cost = rm.checkOut(rc2,3);
        System.out.println("cost: " + cost);
        System.out.println(rm);
        System.out.println();

        RoachPal roachPal3 = new RoachPal("ihatehumans452@gmail.com", "passwordroach235");
        RoachColony rc3 = new RoachColony("third colony",300,0.3, roachPal3);
        ArrayList<String> amenities3 = new ArrayList<>();
        amenities3.add("foodbar");
        amenities3.add("refillbar");
        MotelRoom r3 = rm.checkIn(rc3,"Basic",amenities3);
        System.out.println(rm);
        System.out.println();

        MasterRoach masterRoach4 = new MasterRoach("Roach James", "3694247825783575", "974", "5/23");
        RoachColony rc4 = new RoachColony("fourth colony",400,0.5, masterRoach4);
        ArrayList<String> amenities4 = new ArrayList<>();
        amenities4.add("spa");
        amenities4.add("shower");
        MotelRoom r4 = rm.checkIn(rc4,"Basic",amenities4);
        System.out.println(rc4);
        rc4.party();
        System.out.println(rc4);
        System.out.println(rm);
        System.out.println();

        RoachPal roachPal5 = new RoachPal("theroachfactor242@roachmail.com", "roachmobile5");
        RoachColony rc5 = new RoachColony("fifth colony",500,0.4, roachPal5);
        ArrayList<String> amenities5 = new ArrayList<>();
        amenities5.add("spa");
        amenities5.add("refillbar");
        MotelRoom r5 = rm.checkIn(rc5,"Deluxe",amenities5);
        System.out.println();

        MasterRoach masterRoach6 = new MasterRoach("Roach Bryant", "8537457634553686", "351", "2/24");
        RoachColony rc6 = new RoachColony("sixth colony",600,0.2, masterRoach6);
        cost = rm.checkOut(rc3,3);
        System.out.println("cost: " + cost);
        ArrayList<String> amenities6 = new ArrayList<>();
        amenities6.add("refillbar");
        amenities6.add("shower");
        MotelRoom r6 = rm.checkIn(rc6,"Basic",amenities6);
        System.out.println(rm);
        System.out.println();

        RoachPal roachPal7 = new RoachPal("americanroach43@yahoo.com", "roachesarelife6858");
        RoachColony rc7 = new RoachColony("seventh colony", 700, .5, roachPal7);
        ArrayList<String> amenities7 = new ArrayList<>();
        amenities7.add("foodbar");
        amenities7.add("shower");
        MotelRoom r7 = rm.checkIn(rc7, "Suite", amenities7);
        System.out.println(rm);
        System.out.println();

        MasterRoach masterRoach8 = new MasterRoach("Lebron Roach", "53678435785475346", "843", "6/21");
        RoachColony rc8 = new RoachColony("eighth colony", 800, .4, masterRoach8);
        ArrayList<String> amenities8 = new ArrayList<>();
        amenities8.add("foodbar");
        amenities8.add("spa");
        MotelRoom r8 = rm.checkIn(rc8, "Deluxe", amenities8);
        System.out.println(rm);
        System.out.println(rc8);
        rc8.party();
        System.out.println(rc8);
        System.out.println(rm);
        System.out.println();

        RoachPal roachPal9 = new RoachPal("getyourroachon34@gmail.com", "wholettheroachesout65");
        RoachColony rc9 = new RoachColony("ninth colony", 900, .3, roachPal9);
        ArrayList<String> amenities9 = new ArrayList<>();
        amenities9.add("refillbar");
        amenities9.add("shower");
        MotelRoom r9 = rm.checkIn(rc9, "Suite", amenities9);
        System.out.println();

        cost = rm.checkOut(rc4, 4);
        System.out.println("cost: " + cost);
        System.out.println(rm);
        cost = rm.checkOut(rc5, 5);
        System.out.println("cost: " + cost);
        System.out.println(rm);
        cost = rm.checkOut(rc6, 3);
        System.out.println("cost: " + cost);
        System.out.println(rm);
        System.out.println();

        MasterRoach masterRoach10 = new MasterRoach("Roach Stevenson", "2546879976556676", "943", "8/22");
        RoachColony rc10 = new RoachColony("tenth colony", 1000, .5, masterRoach10);
        ArrayList<String> amenities10 = new ArrayList<>();
        amenities10.add("foodbar");
        amenities10.add("spa");
        amenities10.add("refillbar");
        MotelRoom r10 = rm.checkIn(rc10, "Basic", amenities10);
        System.out.println(rm);
        System.out.println();

        RoachPal roachPal11 = new RoachPal("roachtastic57@roachmail.com", "imimmortal54");
        RoachColony rc11 = new RoachColony("eleventh colony", 1100, .3, roachPal11);
        ArrayList<String> amenities11 = new ArrayList<>();
        amenities11.add("spa");
        amenities11.add("shower");
        MotelRoom r11 = rm.checkIn(rc11, "Suite", amenities11);
        System.out.println(rm);
        System.out.println();

        MasterRoach masterRoach12 = new MasterRoach("Coach Roach", "7585234677898842", "732", "3/23");
        RoachColony rc12 = new RoachColony("twelfth colony", 1200, .4, masterRoach12);
        ArrayList<String> amenities12 = new ArrayList<>();
        amenities12.add("foodbar");
        MotelRoom r12 = rm.checkIn(rc12, "Deluxe", amenities12);
        System.out.println(rc12);
        System.out.println(rm);
        rc12.party();
        System.out.println(rc12);
        System.out.println(rm);
        System.out.println();

        RoachPal roachPal13 = new RoachPal("foroaches86@gmail.com", "roachesarelovable35467");
        RoachColony rc13 = new RoachColony("thirteenth colony", 1300, .5, roachPal13);
        ArrayList<String> amenities13 = new ArrayList<>();
        amenities13.add("spa");
        MotelRoom r13 = rm.checkIn(rc13, "Basic", amenities13);
        System.out.println(rc13);
        System.out.println(rm);
        rc13.party();
        System.out.println(rc13);
        System.out.println(rm);
        cost = rm.checkOut(rc13,4);
        System.out.println("cost: " + cost);
        System.out.println();

        MasterRoach masterRoach14 = new MasterRoach("Roach Jordan", "4797856745318426", "537", "6/24");
        RoachColony rc14 = new RoachColony("fourteenth colony", 1400, .3, masterRoach14);
        ArrayList<String> amenities14 = new ArrayList<>();
        amenities14.add("refillbar");
        amenities14.add("shower");
        MotelRoom r14 = rm.checkIn(rc14, "Suite", amenities14);
        System.out.println(rm);
        cost = rm.checkOut(rc14,3);
        System.out.println("cost: " + cost);
        System.out.println();

        cost = rm.checkOut(rc10,3);
        System.out.println("cost: " + cost);
        r13 = rm.checkIn(rc13, "Basic", amenities13);
        System.out.println(rm);
        cost = rm.checkOut(rc11,4);
        System.out.println("cost: " + cost);
        System.out.println(rm);
        System.out.println();

        r14 = rm.checkIn(rc14, "Suite", amenities14);
        System.out.println(rm);
        System.out.println(rc14);
        rc14.party();
        System.out.println(rc14);
        System.out.println(rm);
        System.out.println();

        cost = rm.checkOut(rc7,3);
        System.out.println("cost: " + cost);
        System.out.println(rm);

    }
}
