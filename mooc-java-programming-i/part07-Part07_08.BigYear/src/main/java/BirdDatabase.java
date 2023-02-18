import java.util.ArrayList;

public class BirdDatabase {
    private final ArrayList<Bird> birds;

    public BirdDatabase() {
        birds = new ArrayList<>();
    }

    public void add(String name, String nameLatin) {
        birds.add(new Bird(name, nameLatin));
    }

    public void observation(String name) {
        for (Bird bird: birds) {
            if (bird.getName().equals(name)) {
                bird.setObservation(bird.getObservation() + 1); break;
            }
        }
    }

    public void printBirds(String name) {
        for (Bird bird: birds) {
            if (bird.getName().equals(name)) {
                System.out.println(bird); break;
            }
        }
    }

    public void printBirds() {
        for (Bird bird : birds) {
            System.out.println(bird);
        }
    }

    public ArrayList<Bird> getBirds() {
        return birds;
    }
}
