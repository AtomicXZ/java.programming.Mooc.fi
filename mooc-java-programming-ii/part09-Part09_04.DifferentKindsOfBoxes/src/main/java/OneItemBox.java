import java.util.ArrayList;

public class OneItemBox extends Box {

    private ArrayList<Item> items;

    public OneItemBox() {
        items = new ArrayList<>();
    }

    @Override
    public void add(Item item) {
        if (items.size() < 1) items.add(item);
    }

    @Override
    public boolean isInBox(Item item) {
        return items.contains(item);
    }
}
