
import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give a number:");
        int num = Integer.parseInt(scan.nextLine());
        boolean ahoyMatey = num % 2 == 0;
        if (ahoyMatey) {
            System.out.printf("Number %d is even.", num);
        } else {
            System.out.printf("Number %d is odd.", num);
        }
    }
}
