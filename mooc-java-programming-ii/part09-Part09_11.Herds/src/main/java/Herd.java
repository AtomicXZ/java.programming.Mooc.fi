import java.util.ArrayList;

public class Herd implements Movable{
    private ArrayList<Organism> organisms;

    public Herd() {
        organisms = new ArrayList<>();
    }

    public void addToHerd(Movable organism) {
        organisms.add((Organism) organism);
    }

    @Override
    public void move(int dx, int dy) {
        for (Organism organism: organisms) {
            organism.move(dx, dy);
        }
    }

    @Override
    public String toString() {
        StringBuilder toReturn = new StringBuilder();

        for (Organism organism: organisms) toReturn.append(organism).append("\n");

        return toReturn.toString();
    }
}
