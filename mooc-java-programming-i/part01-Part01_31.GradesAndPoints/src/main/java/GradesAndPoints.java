
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give points [0-100]:");
        int marks = Integer.parseInt(scan.nextLine());
        if (marks < 0) {
            System.out.println("impossible!");
        } else if (marks >= 0 && marks <= 49) {
            System.out.println("Grade: failed");
        } else if (marks >= 50 && marks <= 59) {
            System.out.println("Grade: 1");
        } else if (marks >= 60 && marks <= 69) {
            System.out.println("Grade: 2");
        } else if (marks >= 70 && marks <= 79) {
            System.out.println("Grade: 3");
        } else if (marks >= 80 && marks <= 89) {
            System.out.println("Grade: 4");
        } else if (marks >= 90 && marks <= 100) {
            System.out.println("Grade: 5");
        } else {
            System.out.println("Grade: incredible!");
        }
    }
}
