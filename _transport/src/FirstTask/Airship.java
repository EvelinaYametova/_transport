package FirstTask;

public class Airship extends AirTransport implements Movement {
    private String transportType;
    private  Stabilizer firstStabilizer = new Stabilizer("Blue", "Horizontal");
    private  Stabilizer secondStabilizer = new Stabilizer("Blue", "Horizontal");
    private  Stabilizer thirdStabilizer = new Stabilizer("Blue", "Vertical");
    private  Stabilizer fourthStabilizer = new Stabilizer("Blue", "Vertical");

    Airship(double vel, int cap) {
        super(vel, cap);
        String fullClass = this.getClass().getName();
        transportType = fullClass.substring(fullClass.indexOf(".") + 1);
    }

    public void move() {
        System.out.println("Reedblahblah, reedblahblah, reedblahblah");
    }

    public String getTransportType() {
        return transportType;
    }

    public boolean isDangerousTransport() {
        return true;
    }

    private class Stabilizer {
        private String color, model;

        private Stabilizer(String col, String mod) {
            color = col;
            model = mod;
        }
    }

    public Stabilizer getFirstStabilizer() {
        return firstStabilizer;
    }

    public Stabilizer getSecondStabilizer() {
        return secondStabilizer;
    }

    public Stabilizer getThirdStabilizer() {
        return thirdStabilizer;
    }

    public Stabilizer getFourthStabilizer() {
        return fourthStabilizer;
    }
}
