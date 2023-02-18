
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int longestNameLength = 0; int sumYOB = 0; int numYOB = 0;
        String longestName = null;

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            String[] data = input.split(",");
            int YOB = Integer.parseInt(data[1]);
            int currentNameLength = data[0].length();
            if (currentNameLength > longestNameLength) {
                longestNameLength = currentNameLength;
                longestName = data[0];
            }

            sumYOB += YOB;
            numYOB ++;
        }

        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + ((double) sumYOB/numYOB));
    }
}
