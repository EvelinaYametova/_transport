package FirstTask;

public class Bicycle extends MuscleStrengthTransport implements Movement {
    private String transportType;
    private BicycleType bicycleType;

    Bicycle(double vel, int cap, double force, BicycleType type) {
        super(vel, cap, force);
        String fullClass = this.getClass().getName();
        transportType = fullClass.substring(fullClass.indexOf(".") + 1);
        bicycleType = type;
    }

    public void move() {
        System.out.println("Vzhuh, vzhuh, vzhuh");
    }

    public String getTransportType() {
        return transportType;
    }

    public boolean isTransportForStrong() {
        if (this.getForce() > 100)
            return true;
        return false;
    }

    public BicycleType getBicycleType() {
        return bicycleType;
    }
}
