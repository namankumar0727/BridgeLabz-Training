package tourmate;
public class DomesticTrip extends Trip {

    public DomesticTrip(String destination, int duration,
                        Transport transport, Hotel hotel,
                        List<Activity> activities) {
        super(destination, duration, transport, hotel, activities);
    }

    @Override
    public void book() {
        System.out.println("Domestic trip to " + destination + " booked.");
        System.out.println("Local transport & ID verification completed.");
    }

    @Override
    public void cancel() {
        System.out.println("Domestic trip to " + destination + " cancelled.");
    }
}
