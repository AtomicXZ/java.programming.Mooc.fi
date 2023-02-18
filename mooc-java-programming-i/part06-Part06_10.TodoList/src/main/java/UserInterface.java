import java.util.Scanner;

public class UserInterface {
    private TodoList todo;
    private Scanner scan;

    public UserInterface(TodoList todo, Scanner scan) {
        this.todo = todo;
        this.scan = scan;
    }

    public void start() {
        while (true) {
            System.out.print("Command: ");
            String input = scan.nextLine();

            if (input.equals("stop")) {
                break;
            } else if (input.equals("add")) {
                System.out.print("To add: ");
                String command = scan.nextLine();
                todo.add(command);
            } else if (input.equals("list")) {
                todo.print();
            } else if (input.equals("remove")) {
                System.out.print("Which one is removed? ");
                int ID = Integer.parseInt(scan.nextLine());
                todo.remove(ID);
            }
        }
    }
}
