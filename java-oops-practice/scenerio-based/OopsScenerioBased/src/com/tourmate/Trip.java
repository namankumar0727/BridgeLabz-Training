package tourmate;
import java.util.List;

public abstract class Trip implements IBookable {

    protected String destination;
    protected double budget;
    protected int duration;

    protected Transport transport;
    protected Hotel hotel;
    protected List<Activity> activities;

    public Trip(String destination, int duration,
                Transport transport, Hotel hotel, List<Activity> activities) {

        this.destination = destination;
        this.duration = duration;
        this.transport = transport;
        this.hotel = hotel;
        this.activities = activities;

        this.budget = calculateTotalBudget();
    }

    protected double calculateTotalBudget() {
        double activityCost = 0;
        for (Activity a : activities) {
            activityCost += a.getCost();
        }

        // Operator-based calculation
        return transport.getCost() + hotel.getCost() + activityCost;
    }

    public double getBudget() {
        return budget;
    }
}
