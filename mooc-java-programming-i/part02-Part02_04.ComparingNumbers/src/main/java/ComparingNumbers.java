
import java.util.Scanner;

public class ComparingNumbers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = Integer.parseInt(scan.nextLine());
        int num2 = Integer.parseInt(scan.nextLine());
        if (num1 > num2) {
            System.out.printf("%d is greater than %d.%n", num1, num2);
        } else if (num2 > num1) {
            System.out.printf("%d is smaller than %d.%n", num1, num2);
        } else {
            System.out.printf("%d is equal to %d.%n", num1, num2);
        }
    }
}
