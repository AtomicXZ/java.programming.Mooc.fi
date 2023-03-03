
public class MagicSquareFactory {

    public MagicSquare createMagicSquare(int size) {

        MagicSquare square = new MagicSquare(size);

        // implement the creation of a magic square with the Siamese method algorithm here
        int x =size / 2;
        int y = 0;
        for (int i = 0; i < size * size; i++) {
            square.placeValue(x, y, i + 1);
            int nextx = x + 1 >= size ? 0 : x + 1;
            int nexty = y - 1 < 0 ? size - 1: y - 1;

            if (square.readValue(nextx, nexty) > 0) {
                nextx = x;
                nexty = y + 1;
            }
            x = nextx;
            y = nexty;
        }

        return square;
    }

}
