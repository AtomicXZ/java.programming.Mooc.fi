
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());

        int count = 0;
        Scanner data = new Scanner(Paths.get(file));
        while (data.hasNextLine()) {
            int num = Integer.valueOf(data.nextLine());
            if (num >= lowerBound & num <= upperBound) {
                count++;
            }
        }

        System.out.println("Numbers: " + count);
    }

}
