package FirstTask;

public abstract class MuscleStrengthTransport extends Transport {
    private double force;

    MuscleStrengthTransport(double velocity, int capacity, double force) {
        super(velocity, capacity);
        this.force = force;
    }

    abstract boolean isTransportForStrong();

    public double getForce() {
        return force;
    }

    public void setForce(double force) {
        this.force = force;
    }
}
