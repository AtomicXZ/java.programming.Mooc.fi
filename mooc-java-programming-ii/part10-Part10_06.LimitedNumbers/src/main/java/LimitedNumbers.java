import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        while (scanner.hasNextLine()) numbers.add(Integer.parseInt(scanner.nextLine()));
        numbers.stream().filter(x -> x <= 5 && x >= 1).forEach(System.out::println);
    }
}
