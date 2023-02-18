
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        System.out.print("File to read: ");
        String file = scanner.nextLine();

        try {
            UserInterface ui = new UserInterface(file, scanner);
            ui.start();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}
