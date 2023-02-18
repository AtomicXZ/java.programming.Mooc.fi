
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Statistics statAll = new Statistics();
        Statistics statEven = new Statistics();
        Statistics statOdd = new Statistics();

        System.out.println("Enter numbers:");
        while (true) {
            int num = scanner.nextInt();
            if (num == -1) {
                break;
            } else {
                statAll.addNumber(num);
            }

            if (num % 2 == 0) {
                statEven.addNumber(num);
            } else {
                statOdd.addNumber(num);
            }
        }

        System.out.println("Sum: " + statAll.sum());
        System.out.println("Sum of even numbers: " + statEven.sum());
        System.out.println("Sum of odd numbers: " +statOdd.sum());
    }
}
