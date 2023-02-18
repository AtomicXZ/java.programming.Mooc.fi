import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeBook {
    private Scanner scan;
    private ArrayList<Recipe> recipes;

    public RecipeBook(String file) throws IOException {
        scan = new Scanner(Paths.get(file));
        recipes = new ArrayList<>();
        this.parseRecipes();
    }

    private void parseRecipes() {
        ArrayList<String> ingredients = new ArrayList<>();

        while (scan.hasNextLine()) {
            String name = scan.nextLine();
            int cookingTime = Integer.parseInt(scan.nextLine());
            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                if (line.equals("")) break;
                ingredients.add(line);
            }
            recipes.add(new Recipe(name, cookingTime, ingredients));
            ingredients = new ArrayList<>();
        }
    }

    public void printRecipes() {
        printRecipes("");
    }

    public void printRecipes(String has) {
        System.out.println("Recipes:");
        for (Recipe r: recipes) {
            if (r.getName().contains(has)) System.out.println(r);
        }
    }

    public void printRecipesByTime(int time) {
        System.out.println("Recipes:");
        for (Recipe r: recipes) {
            if (r.getCookingTime() <= time) System.out.println(r);
        }
    }

    public void printRecipesByIngredients(String ingredient) {
        System.out.println("Recipes:");
        for (Recipe r: recipes) {
            if (r.getIngredients().contains(ingredient)) System.out.println(r);
        }
    }
}
