package FirstTask;

import java.util.HashMap;

public class Horse extends MuscleStrengthTransport implements Movement {
    private String transportType;
    private HorseType type;
    private HashMap<String, HorseShoe> hoofsAndHorseShoes;
    Horse(double vel, int cap, double force, HorseType type, HorseShoe[] horseShoes) {
        super(vel, cap, force);
        this.type = type;
        String fullClass = this.getClass().getName();
        transportType = fullClass.substring(fullClass.indexOf(".") + 1);
        hoofsAndHorseShoes = new HashMap<>();
        Hoof[] hoofs = Hoof.values();
        int i = 0;
        for (HorseShoe horseShoe : horseShoes) {
            hoofsAndHorseShoes.put(hoofs[i].toString(), horseShoe);
            i++;
        }
    }

    public void move() {
        System.out.println("Neigh, neigh, neigh");
    }

    public String getTransportType() {
        return transportType;
    }

    private class HorseShoe {
        private String material, color;

        private HorseShoe(String material, String color) {
            this.material = material;
            this.color = color;
        }
    }

    public boolean isTransportForStrong() {
        if (this.getForce() > 100)
            return true;
        return false;
    }

    public HorseType getHorseType() {
        return type;
    }

    public HashMap<String, HorseShoe> getHoofsAndHorseShoes() {
        return hoofsAndHorseShoes;
    }
}
