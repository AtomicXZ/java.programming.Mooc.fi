import java.util.ArrayList;
public class Suitcase {
    private ArrayList<Item> items;
    private final int maxWeight;

    public Suitcase(int maxWeight) {
        this.items = new ArrayList<>();
        this.maxWeight = maxWeight;
    }

    public void addItem(Item item) {
        int currentWeight = this.totalWeight();
        System.out.println(currentWeight);

        if (!(item.getWeight() + currentWeight > maxWeight)) items.add(item);
    }

    public void printItems() {
        for (Item i: items) {
            System.out.println(i);
        }
    }

    public int totalWeight() {
        int currentWeight = 0;
        for (Item i: this.items) {
            currentWeight += i.getWeight();
        }
        return currentWeight;
    }

    public Item heaviestItem() {
        if (items.isEmpty()) return null;
        Item heavy = this.items.get(0);
        for (Item i: items) {
            if (heavy.getWeight() < i.getWeight()) {
                heavy = i;
            }
        }
        return heavy;
    }

    @Override
    public String toString() {
        if (this.items.isEmpty()) return "no items (0 kg)";

        int currentWeight = this.totalWeight();
        int count = items.size();

        return count + (count == 1 ? " item (" : " items (") + currentWeight + " kg)";
    }
}
