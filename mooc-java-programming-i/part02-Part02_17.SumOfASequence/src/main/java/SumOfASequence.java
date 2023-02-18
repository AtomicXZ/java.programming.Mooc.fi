
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Last number? ");
        int end = scan.nextInt();
        int sum = 0;
        for (int i = 1; i <= end; i++) {
            sum += i;
        }
        System.out.printf("The sum is %d%n", sum);
    }
}
