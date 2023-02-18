import java.util.Scanner;

public class UserInterface {
    private JokeManager jokeManager;
    private Scanner scan;

    public UserInterface(JokeManager jokeManager, Scanner scan) {
        this.jokeManager = jokeManager;
        this.scan = scan;
    }

    public void start() {
        label:
        while (true) {
            System.out.println("Commands:\n" +
                    "1 - add a joke\n" +
                    "2 - draw a joke\n" +
                    "3 - list jokes\n" +
                    "X - stop");

            String input = scan.nextLine();

            switch (input) {
                case "X":
                    break label;
                case "1":
                    System.out.println("Write the joke to be added:");
                    String joke = scan.nextLine();
                    this.jokeManager.addJoke(joke);
                    break;
                case "2":
                    System.out.println(this.jokeManager.drawJoke());
                    break;
                case "3":
                    this.jokeManager.printJokes();
                    break;
            }
        }
    }
}

