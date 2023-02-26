
import java.util.ArrayList;
import java.util.Scanner;

public class PrintingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> strings = new ArrayList<>();
        while (scanner.hasNextLine()) strings.add(scanner.nextLine());
        strings.stream().forEach(i -> System.out.println(i));
    }
}
