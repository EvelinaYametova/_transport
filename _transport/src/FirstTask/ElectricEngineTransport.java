package FirstTask;

public abstract class ElectricEngineTransport extends Transport {
    private double electricityCount;

    ElectricEngineTransport(double vel, int cap, double elc) {
        super(vel, cap);
        electricityCount = elc;
    }

    public double getElectricityCount() {
        return electricityCount;
    }

    public void setElectricityCount(double electricityCount) {
        this.electricityCount = electricityCount;
    }
}
