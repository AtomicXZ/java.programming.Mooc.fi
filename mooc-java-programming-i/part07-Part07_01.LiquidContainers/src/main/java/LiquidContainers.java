
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int first = 0;
        int second = 0;

        while (true) {
            System.out.printf("First: %d/100%n", first);
            System.out.printf("Second: %d/100%n", second);
            System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            } else if (input.contains("add")) {
                int quantity = Integer.parseInt(input.split(" ")[1]);
                if (quantity < 0) continue;
                first = Math.min(first + quantity, 100);
            } else if (input.contains("remove")) {
                int quantity = Integer.parseInt(input.split(" ")[1]);
                if (quantity < 0) continue;
                second = Math.max(second - quantity, 0);
            } else if (input.contains("move")) {
                int quantity = Integer.parseInt(input.split(" ")[1]);
                if (quantity < 0) continue;

                if (quantity <= first) {
                    second = Math.min(quantity + second, 100);
                    first = Math.max(first - quantity, 0);
                } else {
                    second = Math.min(first + second, 100);
                    first = 0;
                }
            }

        }
    }

}
