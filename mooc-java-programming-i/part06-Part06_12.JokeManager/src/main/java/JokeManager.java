import java.util.ArrayList;
import java.util.Random;

public class JokeManager {
    private ArrayList<String> jokes;

    public JokeManager() {
        jokes = new ArrayList<>();
    }

    public void addJoke(String joke) {
        this.jokes.add(joke);
    }

    public String drawJoke() {
        if (this.jokes.isEmpty()) return "Jokes are in short supply.";

        Random draw = new Random();
        int ind = draw.nextInt(jokes.size());
        return jokes.get(ind);
    }

    public void printJokes() {
        for (String joke: jokes) System.out.println(joke);
    }
}
