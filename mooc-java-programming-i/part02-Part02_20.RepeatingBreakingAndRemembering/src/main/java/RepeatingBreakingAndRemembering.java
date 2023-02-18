
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0; int numOfNumbers = 0; int numEven = 0; int numOdd = 0;
        System.out.println("Give numbers:");
        while (true) {
            int num = scanner.nextInt();
            if (num == -1) {
                System.out.println("Thx! Bye!");
                break;
            } else {
                sum += num;
                numOfNumbers++;
                if (num % 2 == 0) {
                    numEven++;
                } else {
                    numOdd++;
                }
            }
        }
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + numOfNumbers);
        System.out.println("Average: " + ((double) sum/numOfNumbers));
        System.out.println("Even: " + numEven);
        System.out.println("Odd: " + numOdd);
    }
}
