import java.util.ArrayList;

public class HashMap<K, V> {
    private final ArrayList<ArrayList<Pair<K, V>>> values;
    public HashMap() {
        this.values = new ArrayList<>();
        this.values.add(new ArrayList<>());
    }

    public V get(K key) {
        int hashCode = getHashCode(key);
        if (this.values.get(hashCode) == null) return null;

        ArrayList<Pair<K, V>> valuesAtHash = this.values.get(hashCode);

        for (Pair<K, V> p: valuesAtHash) {
            if (p.getKey().equals(key)) return p.getValue();
        }
        return null;
    }

    public void add(K key, V value) {
        ArrayList<Pair<K, V>> valuesAtHash = getListBasedOnKey(key);
        int index = getIndexOfKey(valuesAtHash, key);

        if (index < 0) {
            valuesAtHash.add(new Pair<>(key, value));
        } else {
            valuesAtHash.get(index).setValue(value);
        }
    }

    public V remove(K key) {
        ArrayList<Pair<K, V>> valuesAtHash = getListBasedOnKey(key);
        if (valuesAtHash.size() == 0) {
            return null;
        }

        int index = getIndexOfKey(valuesAtHash, key);
        if (index < 0) {
            return null;
        }

        Pair<K, V> pair = valuesAtHash.get(index);
        valuesAtHash.remove(pair);
        return pair.getValue();
    }

    private ArrayList<Pair<K, V>> getListBasedOnKey(K key) {
        int hashCode = getHashCode(key);
        if (this.values.isEmpty()) this.values.add(new ArrayList<>());
        if (this.values.get(hashCode) == null) this.values.add(hashCode, new ArrayList<>());

        return this.values.get(hashCode);
    }

    private int getIndexOfKey(ArrayList<Pair<K, V>> myList, K key) {
        for (int i = 0; i < myList.size(); i++) {
            if (myList.get(i).getKey().equals(key)) {
                return i;
            }
        }
        return -1;
    }

    private int getHashCode(K key) {
        return Math.abs(key.hashCode() % this.values.size());
    }

    @Override
    public String toString() {
        StringBuilder toReturn = new StringBuilder();
        for (ArrayList<Pair<K, V>> list: this.values) {
            for (Pair<K, V> item: list) {
                if (item.getKey() != null) {
                    toReturn.append(item).append("\n");
                }
            }
        }
        return toReturn.toString().trim();
    }
}