

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> identifiers = new ArrayList<>();
        ArrayList<String> names = new ArrayList<>();

        while (true) {
            System.out.println("Identifier? (empty will stop)");
            String identifier = scanner.nextLine();
            if (identifier.equals("")) break;
            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();
            if (name.equals("")) break;

            if (!(identifiers.contains(identifier))){
                identifiers.add(identifier);
                names.add(name);
            }
        }

        System.out.println("==Items==");
        for (int i = 0; i < identifiers.size(); i++) {
            System.out.println(identifiers.get(i) + ": " + names.get(i));
        }

    }
}
