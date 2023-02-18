import java.util.ArrayList;
public class Hold {
    private ArrayList<Suitcase> suitcases;
    private int maxWeight;

    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        this.suitcases = new ArrayList<>();
    }

    public void addSuitcase(Suitcase suitcase) {
        int currentWeight = 0;
        for (Suitcase sc: suitcases) {
            currentWeight += sc.totalWeight();
        }

        if (!(suitcase.totalWeight() + currentWeight > this.maxWeight)) suitcases.add(suitcase);
    }

    public void printItems() {
        for (Suitcase sc: suitcases) {
            sc.printItems();
        }
    }

    @Override
    public String toString() {
        int currentWeight = 0;
        for (Suitcase sc: suitcases) {
            currentWeight += sc.totalWeight();
        }

        return suitcases.size() + " suitcases (" + currentWeight + " kg)";
    }
}
