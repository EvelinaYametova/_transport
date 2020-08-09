package FirstTask;

public class Airplane extends AirTransport implements Movement {
    private String transportType;
    private Wing leftWing = new Wing("White", "Left");
    private Wing rightWing = new Wing ("White", "Right");

    Airplane(double vel, int cap) {
        super(vel, cap);
        String fullClass = this.getClass().getName();
        transportType = fullClass.substring(fullClass.indexOf(".") + 1);
    }

    public void move() {
        System.out.println("Tu, tu, tu");
    }

    public String getTransportType() {
        return transportType;
    }

    public boolean isDangerousTransport() {
        return false;
    }

    private class Wing {
        private String color, model;

        private Wing(String col, String mod) {
            color = col;
            model = mod;
        }
    }
    
    public Wing getLeftWing() {
        return leftWing;
    }

    public Wing getRightWing() {
        return rightWing;
    }
}
