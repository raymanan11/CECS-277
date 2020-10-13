package AdapterLab;

public class MtoKAdapter extends KilometersAdaptee {
    private double mileTokilo = 1.609344;
    private double kiloToMile = .62137;

    double mph;
    double hours;

    public MtoKAdapter(double mph, double hours) {
        this.mph = mph;
        this.hours = hours;
    }

    public double convert() {
        double kilometers = mph * mileTokilo;

        double adapteeKilo = distancek(kilometers, hours);

        double miles = adapteeKilo * kiloToMile;

        return miles;
    }
}
