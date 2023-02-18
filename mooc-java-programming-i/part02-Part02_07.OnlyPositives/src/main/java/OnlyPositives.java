
import java.util.Scanner;

public class OnlyPositives {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 1;
        while (num != 0) {
            System.out.println("Give a number:");
            num = scanner.nextInt();
            if (num > 0) {
                System.out.println(num*num);
            } else if (num < 0) {
                System.out.println("Unsuitable number");
            } else {
                break;
            }
        }
    }
}
