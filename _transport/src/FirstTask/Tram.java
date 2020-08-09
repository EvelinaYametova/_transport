package FirstTask;

public class Tram extends ElectricEngineTransport implements Movement {
    private String transportType;
    private int wagonCount;
    private Wagon[] wagons;

    Tram(double vel, int cap, double elc, int wc) {
        super(vel, cap, elc);
        String fullClass = this.getClass().getName();
        transportType = fullClass.substring(fullClass.indexOf(".") + 1);
        wagonCount = wc;
        wagons = new Wagon[wagonCount];
        for (int i = 0; i < wagonCount; i++) {
            wagons[i] = new Wagon("Trailer", "Red");
        }
    }
    public void move() {
        System.out.println("Choo, choo, choo");
    }

    public String getTransportType() {
        return transportType;
    }

    public int getWagonCount() {
        return wagonCount;
    }

    public void setWagonCount(int wagonCount) {
        if (wagonCount > 0)
            this.wagonCount = wagonCount;
        throw new IllegalArgumentException();
    }

    public Wagon[] getWagons() {
        return wagons;
    }

    public void setWagons(Wagon[] wagons) {
        if (wagonCount == wagons.length)
            this.wagons = wagons;
        throw new IllegalArgumentException();
    }

    private class Wagon {
        private String construction, color;
        private Wagon(String construction, String color) {
            this.construction = construction;
            this.color = color;
        }
    }
}
