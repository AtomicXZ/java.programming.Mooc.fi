
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> numbers = new ArrayList<>();
        System.out.println("Input numbers, type \"end\" to stop.");
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("end")) break;
            numbers.add(input);
        }

        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        char choice = scanner.nextLine().charAt(0);
        System.out.print("Average of the negative numbers: ");
        if (choice == 'n') {
            System.out.println(numbers.stream().mapToInt(x -> Integer.parseInt(x)).filter(x -> x < 0).average());
        } else if (choice == 'p') {
            System.out.println(numbers.stream().mapToInt(x -> Integer.parseInt(x)).filter(x -> x > 0).average());
        }
    }
}
