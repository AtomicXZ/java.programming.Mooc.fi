
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        if (num < 0) {
            System.out.println(-num);
        } else {
            System.out.println(num);
        }
    }
}
