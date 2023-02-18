import java.util.ArrayList;
import java.util.Scanner;
public class UserInterface {
    private final Scanner scan;
    private final BirdDatabase bd;

    public UserInterface(Scanner scan) {
        this.scan = scan;
        bd = new BirdDatabase();
    }

    public void start() {
        while (true) {
            System.out.print("? ");
            String input = scan.nextLine();

            if (input.equals("Quit")) { break;
            } else if (input.equals("Add")) {
                System.out.print("Name: ");
                String name = scan.nextLine();
                System.out.print("Name in Latin: ");
                String nameLatin = scan.nextLine();
                bd.add(name, nameLatin);
            } else if (input.equals("Observation")) {
                ArrayList<Bird> birds = bd.getBirds();

                System.out.print("Bird? ");
                String name = scan.nextLine();
                boolean check = false;

                for (Bird b: birds) {
                    if (b.getName().equals(name)) {
                        bd.observation(name);
                        check = true;
                        break;
                    }
                }
                if (!check) {
                    System.out.println("Not a bird!");
                }
            } else if (input.equals("All")) {
                bd.printBirds();
            } else if (input.equals("One")) {
                System.out.print("Bird? ");
                String name = scan.nextLine();

                bd.printBirds(name);
            }
        }
    }
}
