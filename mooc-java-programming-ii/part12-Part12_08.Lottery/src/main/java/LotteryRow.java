
import java.util.ArrayList;
import java.util.Random;

public class LotteryRow {

    private ArrayList<Integer> numbers;
    private final Random random;

    public LotteryRow() {
        random = new Random();
        this.randomizeNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void randomizeNumbers() {
        this.numbers = new ArrayList<>();
        while (this.numbers.size() < 7) {
            int numToAdd = random.nextInt(40) + 1;
            if (!this.containsNumber(numToAdd)) this.numbers.add(numToAdd);
        }
    }

    public boolean containsNumber(int number) {
        return this.numbers.contains(number);
    }
}

