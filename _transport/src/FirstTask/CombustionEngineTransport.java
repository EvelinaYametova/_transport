package FirstTask;

public abstract class CombustionEngineTransport extends Transport {
    private double engineVolume;
    private double enginePower;

    CombustionEngineTransport(double vel, int cap, double eV, double eP) {
        super(vel, cap);
        engineVolume = eV;
        enginePower = eP;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume > 0)
            this.engineVolume = engineVolume;
        throw new IllegalArgumentException();
    }

    public double getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(double enginePower) {
        if (enginePower > 0)
            this.enginePower = enginePower;
        throw new IllegalArgumentException();
    }
}
