public class Bird {
    private final String name;
    private final String nameLatin;
    private int observation;

    public Bird(String name, String nameLatin) {
        this.name = name;
        this.nameLatin = nameLatin;
        this.observation = 0;
    }

    public String getName() {
        return name;
    }

    public int getObservation() {
        return observation;
    }

    public void setObservation(int observation) {
        this.observation = observation;
    }

    @Override
    public String toString() {
        return this.name + " (" +this.nameLatin + "): " + this.observation + " observations";
    }
}
