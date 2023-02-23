import java.util.ArrayList;

public class BoxWithMaxWeight extends Box{
    private final int capacity;
    private final ArrayList<Item> items;

    public BoxWithMaxWeight(int capacity) {
        this.capacity = capacity;
        this.items = new ArrayList<>();
    }

    public void add(Item item) {
        if (item.getWeight() + getTotalWeight() <= capacity) items.add(item);
    }

    @Override
    public boolean isInBox(Item item) {
        return items.contains(item);
    }

    private int getTotalWeight() {
        int weight = 0;
        for (Item item: items) {
            weight += item.getWeight();
        }
        return weight;
    }
}
