
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Container first = new Container();
        Container second = new Container();

        while (true) {
            System.out.println("First: " + first);
            System.out.println("Second: " + second);
            System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            } else if (input.contains("add")) {
                int quantity = Integer.parseInt(input.split(" ")[1]);
                first.add(quantity);
            } else if (input.contains("remove")) {
                int quantity = Integer.parseInt(input.split(" ")[1]);
                second.remove(quantity);
            } else if (input.contains("move")) {
                int quantity = Integer.parseInt(input.split(" ")[1]);
                if (quantity <= first.contains()) {
                    second.add(quantity);
                    first.remove(quantity);
                } else {
                    second.add(first.contains());
                    first.remove(100);
                }
            }

        }
    }

}
