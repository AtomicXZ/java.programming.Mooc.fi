public class ProductWarehouseWithHistory extends ProductWarehouse{
    private ChangeHistory history;

    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        super.addToWarehouse(initialBalance);
        this.history = new ChangeHistory(); history.add(initialBalance);
    }

    public void addToWarehouse(double amount) {
        if (!(amount > 0)) return;
        history.add(super.getBalance() + amount);
        super.addToWarehouse(amount);
    }

    public double takeFromWarehouse(double amount) {
        history.add(super.getBalance() - amount);
        return super.takeFromWarehouse(amount);
    }

    public void printAnalysis() {
        System.out.println("Product: " + super.getName());
        System.out.println("History: " + this.history());
        System.out.println("Largest amount of product: " + history.maxValue());
        System.out.println("Smallest amount of product: " + history.minValue());
        System.out.println("Average: " + history.average());
    }

    public String history() {
        return this.history.toString();
    }
}
