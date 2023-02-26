import java.util.ArrayList;
import java.util.Collections;

public class Hand implements Comparable<Hand>{
    private ArrayList<Card> cards;

    public Hand() {
        cards = new ArrayList<>();
    }

    public void add(Card card) {cards.add(card);}

    public void print() {cards.forEach(System.out::println);}

    public void sort() {
        Collections.sort(cards);
    }

    @Override
    public int compareTo(Hand other) {
        return this.cards.stream().map(Card::getValue).reduce(0, Integer::sum) -
                other.cards.stream().map(Card::getValue).reduce(0, Integer::sum);
    }

    public void sortBySuit() {
        Collections.sort(this.cards, new BySuitInValueOrder());
    }
}
