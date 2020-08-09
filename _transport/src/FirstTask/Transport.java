package FirstTask;

public abstract class Transport {
    private double velocity;
    private int capacity;
    abstract String getTransportType();

    Transport(double velocity, int capacity) {
        this.velocity = velocity;
        this.capacity = capacity;
    }

    public double getVelocity() {
        return velocity;
    }

    public void setVelocity(double velocity) {
        this.velocity = velocity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
