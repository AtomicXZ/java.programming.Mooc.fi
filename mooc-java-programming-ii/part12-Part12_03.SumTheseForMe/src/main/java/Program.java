
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // test your method here
        int[] numbers = {1};
        System.out.println(sum(numbers, -2, 3, 0, 999));
    }

    public static int sum(int[] array, int fromWhere, int toWhere, int smallest, int largest) {
        int sum = 0;
        for (int i = fromWhere; i < toWhere; i++) {
            if (i >= array.length || i < 0) break;

            int num = array[i];
            if (num <= largest && num >= smallest) {
                sum += num;
            }
        }
        return sum;
    }

}
