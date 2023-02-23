import java.util.ArrayList;

public class Box implements Packable {
    private final double capacity;
    private final ArrayList<Packable> content;

    public Box(double capacity) {
        this.capacity = capacity;
        content = new ArrayList<>();
    }

    public void add(Packable packable) {
        if (packable.weight() + this.weight() < capacity) content.add(packable);
    }

    public double weight() {
        double weight = 0;
        for (Packable p: content) weight += p.weight();
        return weight;
    }

    @Override
    public String toString() {
        return "Box: " + content.size() + " items, total weight " + this.weight() + " kg";
    }
}
