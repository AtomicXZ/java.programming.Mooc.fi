
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingAFile {

    public static void main(String[] args) {
        Scanner data = null;
        try {
            data = new Scanner(Paths.get("data.txt"));
            while (data.hasNextLine()) {
                System.out.println(data.nextLine());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
