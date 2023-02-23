import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Warehouse {
    private final Map<String, Integer> prices;
    private final Map<String, Integer> stocks;

    public Warehouse() {
        this.prices = new HashMap<>();
        this.stocks = new HashMap<>();
    }

    public void addProduct(String product, int price, int stock) {
        prices.put(product, price);
        stocks.put(product, stock);
    }

    public int price(String product) {
        return prices.getOrDefault(product, -99);
    }

    public int stock(String product) {
        return stocks.getOrDefault(product, 0);
    }

    public boolean take(String product) {
        int value = stocks.getOrDefault(product, 0);
        if (value > 0) {
            stocks.put(product, value - 1); return true;
        }
        return false;
    }

    public Set<String> products() {
        return this.prices.keySet();
    }
}
