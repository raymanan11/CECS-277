package AdapterLab;

public class MilesClient {

    public double distance(double mph,double hours) {

        MtoKAdapter adapter = new MtoKAdapter(mph, hours);
        double miles = Math.ceil(adapter.convert());
        return miles;

    }
}
