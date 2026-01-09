package tourmate;
public class Transport {
    private String mode;
    private double cost;

    public Transport(String mode, double cost) {
        this.mode = mode;
        this.cost = cost;
    }

    double getCost() {   // hidden from outside packages
        return cost;
    }
}
