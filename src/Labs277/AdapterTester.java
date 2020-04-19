package Labs277;

public class AdapterTester {
    public static void main(String[] args) {
        MilesClient milesClient = new MilesClient();

        double totalMiles = milesClient.distance(25, 5);
        System.out.println("Total miles is: " + totalMiles);
    }
}
