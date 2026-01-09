package tourmate;
public class InternationalTrip extends Trip {

    public InternationalTrip(String destination, int duration,
                             Transport transport, Hotel hotel,
                             List<Activity> activities) {
        super(destination, duration, transport, hotel, activities);
    }

    @Override
    public void book() {
        System.out.println("International trip to " + destination + " booked.");
        System.out.println("Passport & visa verification completed.");
    }

    @Override
    public void cancel() {
        System.out.println("International trip to " + destination + " cancelled.");
    }
}
