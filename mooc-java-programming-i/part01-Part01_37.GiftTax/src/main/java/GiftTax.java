
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Value of the gift?");
        int price = Integer.parseInt(scan.nextLine());
        if (price < 5000) {
            System.out.println("No tax!");
        } else if (price < 25_000) {
            System.out.println("Tax: " + (100 + (double) (price-5000) * 0.08));
        } else if (price < 55_000) {
            System.out.println("Tax: " + (1_700 + (double) (price-25_000) * 0.1));
        } else if (price < 200_000) {
            System.out.println("Tax: " + (4_700 + (double) (price-55_000) * 0.12));
        } else if (price < 1_000_000) {
            System.out.println("Tax: " + (22_100 + (double) (price-200_000) * 0.15));
        } else {
            System.out.println("Tax: " + (142_100 + (double) (price-1_000_000) * 0.17));
        }
    }
}
