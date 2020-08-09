package FirstTask;

public class Bus extends CombustionEngineTransport implements Movement {
    private String transportType;
    private Window[] windows = new Window[2];

    Bus(double vel, int cap, double eV, double eP) {
        super(vel, cap, eV, eP);
        String fullClass = this.getClass().getName();
        transportType = fullClass.substring(fullClass.indexOf(".") + 1);
        windows[0] = new Window(10, 10);
        windows[1] = new Window(10, 10);
    }

    public void move() {
        System.out.println("Vroom, vroom, vroom");
    }

    public String getTransportType() {
        return transportType;
    }

    private class Window {
        private double width, height;

        private Window(double width, double height) {
            this.width = width;
            this.height = height;
        }
    }

    public Window[] getWindows() {
        return windows;
    }
}
