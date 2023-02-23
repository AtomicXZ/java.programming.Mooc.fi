import java.util.ArrayList;
import java.util.Collections;

public class ChangeHistory {
    private final ArrayList<Double> history;

    public ChangeHistory() {
        history = new ArrayList<>();
    }

    public void add(double status) {
        history.add(status);
    }

    public void clear() {
        history.clear();
    }

    public double maxValue() {
        if (history.isEmpty()) return 0;
        return Collections.max(history);
    }

    public double minValue() {
        if (history.isEmpty()) return 0;
        return Collections.min(history);
    }

    public double average() {
        if (history.isEmpty()) return 0;

        double sum = 0;
        for (double d: history) sum += d;
        return sum/history.size();
    }

    public String toString() {
        return history.toString();
    }
}
