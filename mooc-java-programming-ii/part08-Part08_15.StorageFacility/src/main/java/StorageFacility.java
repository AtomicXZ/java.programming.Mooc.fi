import java.util.HashMap;
import java.util.ArrayList;

public class StorageFacility {
    private final HashMap<String, ArrayList<String>> storageUnits;

    public StorageFacility() {
        this.storageUnits = new HashMap<>();
    }

    public void add(String word, String translation) {
        while (true) {
            if (storageUnits.containsKey(word)) {
                storageUnits.get(word).add(translation);
                break;
            }
            storageUnits.put(word, new ArrayList<>());
        }
    }

    public ArrayList<String> contents(String storageUnit) {
        return this.storageUnits.getOrDefault(storageUnit, new ArrayList<>());
    }

    public void remove(String storageUnit, String item) {
        this.storageUnits.get(storageUnit).remove(item);
        if (this.storageUnits.get(storageUnit).isEmpty()) this.storageUnits.remove(storageUnit);
    }

    public ArrayList<String> storageUnits() {
        return new ArrayList<>(storageUnits.keySet());
    }
}
