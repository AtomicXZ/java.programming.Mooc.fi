
import java.util.ArrayList;
import java.util.Collections;

public class MagicSquare {

    private int[][] square;

    // ready constructor
    public MagicSquare(int size) {
        if (size < 2) {
            size = 2;
        }

        this.square = new int[size][size];
    }

    public ArrayList<Integer> sumsOfRows() {
        ArrayList<Integer> sumOfRows = new ArrayList<>();
        for (int i = 0; i < this.square.length; i++) {
            int currentRowSum = 0;
            for (int j = 0; j < this.square[i].length; j++) {
                currentRowSum += this.square[i][j];
            }
            sumOfRows.add(currentRowSum);
        }
        return sumOfRows;
    }

    public ArrayList<Integer> sumsOfColumns() {
        ArrayList<Integer> sumOfColumns = new ArrayList<>();
        for (int i = 0; i < this.square.length; i++) {
            int currentColumnSum = 0;
            for (int j = 0; j < this.square[i].length; j++) {
                currentColumnSum += this.square[j][i];
            }
            sumOfColumns.add(currentColumnSum);
        }
        return sumOfColumns;
    }

    public ArrayList<Integer> sumsOfDiagonals() {
        ArrayList<Integer> sumOfDiagonals = new ArrayList<>();
        int leftDiagonalSum = 0;
        int rightDiagonalSum = 0;

        for (int j = 0; j < this.square.length; j++) {
            leftDiagonalSum += this.square[j][j];
            rightDiagonalSum += this.square[j][this.square.length - j - 1];
        }
        sumOfDiagonals.add(leftDiagonalSum); sumOfDiagonals.add(rightDiagonalSum);

        return sumOfDiagonals;
    }

    // ready-made helper methods -- don't touch these
    public boolean isMagicSquare() {
        return sumsAreSame() && allNumbersDifferent();
    }

    public ArrayList<Integer> giveAllNumbers() {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int row = 0; row < square.length; row++) {
            for (int col = 0; col < square[row].length; col++) {
                numbers.add(square[row][col]);
            }
        }

        return numbers;
    }

    public boolean allNumbersDifferent() {
        ArrayList<Integer> numbers = giveAllNumbers();

        Collections.sort(numbers);
        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i - 1) == numbers.get(i)) {
                return false;
            }
        }

        return true;
    }

    public boolean sumsAreSame() {
        ArrayList<Integer> sums = new ArrayList<>();
        sums.addAll(sumsOfRows());
        sums.addAll(sumsOfColumns());
        sums.addAll(sumsOfDiagonals());

        if (sums.size() < 3) {
            return false;
        }

        for (int i = 1; i < sums.size(); i++) {
            if (sums.get(i - 1) != sums.get(i)) {
                return false;
            }
        }

        return true;
    }

    public int readValue(int x, int y) {
        if (x < 0 || y < 0 || x >= getWidth() || y >= getHeight()) {
            return - 1;
        }

        return this.square[y][x];
    }

    public void placeValue(int x, int y, int value) {
        if (x < 0 || y < 0 || x >= getWidth() || y >= getHeight()) {
            return;
        }

        this.square[y][x] = value;
    }

    public int getWidth() {
        return this.square.length;
    }

    public int getHeight() {
        return this.square.length;
    }

    @Override
    public String toString() {
        StringBuilder toReturn = new StringBuilder();

        for (int i = 0; i < this.square.length; i++) {
            for (int j = 0; j < this.square[i].length; j++) {
                toReturn.append(this.square[i][j]).append("\t");
            }
            toReturn.append("\n");
        }

        return toReturn.toString();
    }
}
