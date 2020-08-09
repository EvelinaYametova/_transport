package FirstTask;

public class Car extends  CombustionEngineTransport implements Movement {
    private ControlType control;
    private String transportType;
    private String brand;

    Car(double vel, int cap, double eV, double eP) {
        super(vel, cap, eV, eP);
        String fullClass = this.getClass().getName();
        transportType = fullClass.substring(fullClass.indexOf(".") + 1);
        brand = "Audi";
        control = ControlType.FORWARD;
    }

    public void move() {
        System.out.println("Bi, bi, bi");
    }

    public String getTransportType() {
        return transportType;
    }

    public boolean isEliteCar() {
        if (this.brand.equalsIgnoreCase("Lada"))
            return false;
        return true;
    }

    public ControlType getControl() {
        return control;
    }

    public void setControl(ControlType control) {
        this.control = control;
    }

    public String getBrand() {
        return brand;
    }
}
