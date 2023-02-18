
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        try {
            System.out.println("Search for:");
            String searchedFor = scanner.nextLine();

            Scanner names = new Scanner(Paths.get(file));

            boolean found = false;
            while (names.hasNextLine()) {
                if (names.nextLine().equals(searchedFor)) {
                    System.out.println("Found!");
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("Not found.");
            }
        } catch (IOException e) {
            System.out.println("Reading the file " + file + " failed.");
        }
    }
}
