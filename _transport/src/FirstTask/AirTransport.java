package FirstTask;

public abstract class AirTransport extends Transport {
    AirTransport(double velocity, int capacity) {
        super(velocity, capacity);
    }

    abstract boolean isDangerousTransport();
}
