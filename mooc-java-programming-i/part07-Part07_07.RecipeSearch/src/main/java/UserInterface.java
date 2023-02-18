import java.io.IOException;
import java.util.Scanner;

public class UserInterface {
    private RecipeBook rb;
    private Scanner scan;

    public UserInterface(String nameOfRecipeBook, Scanner scan) throws IOException {
        this.rb = new RecipeBook(nameOfRecipeBook);
        this.scan = scan;
    }

    public void start() {
        System.out.println("Commands:\n" +
                "list - lists the recipes\n" +
                "stop - stops the program\n" +
                "find name - searches recipes by name\n" +
                "find cooking time - searches recipes by cooking time\n" +
                "find ingredient - searches recipes by ingredient");
        while (true) {
            System.out.print("Enter command: ");
            String input = scan.nextLine();
            if (input.equals("stop")) {
                break;
            } else if (input.equals("list")) {
                rb.printRecipes();
            } else if (input.equals("find name")) {
                System.out.print("Searched word: ");
                String recipeName = scan.nextLine();
                rb.printRecipes(recipeName);
            } else if (input.equals("find cooking time")) {
                System.out.print("Max cooking time: ");
                int time = Integer.parseInt(scan.nextLine());
                rb.printRecipesByTime(time);
            } else if (input.equals(("find ingredient"))) {
                System.out.print("Ingredient: ");
                String ingredient = scan.nextLine();
                rb.printRecipesByIngredients(ingredient);
            }
        }
    }
}
