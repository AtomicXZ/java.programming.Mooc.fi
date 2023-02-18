
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest = 0;
        String nameOldest = null;

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            String[] data = input.split(",");
            int age = Integer.parseInt(data[1]);
            if (age > oldest) {
                oldest = age;
                nameOldest = data[0];
            }
        }

        System.out.println("Name of the oldest: " + nameOldest);
    }
}
