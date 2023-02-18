
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of the file:");
        String fileName = scanner.nextLine();

        Scanner file = new Scanner(Paths.get(fileName));

        while (file.hasNextLine()) {
            String[] data = file.nextLine().split(",");
            String suffix = Integer.parseInt(data[1]) == 1 ? "year" : "years";

            System.out.println(data[0] + ", age: " + data[1] + " " + suffix);
        }
    }
}
