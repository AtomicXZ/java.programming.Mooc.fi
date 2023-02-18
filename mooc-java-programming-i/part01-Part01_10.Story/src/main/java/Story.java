
import java.util.Scanner;

public class Story {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("I will tell you a story, but I need some information first.");
        System.out.println("What is the main character called?");
        String name = scanner.nextLine();
        System.out.println("What is their job?");
        String job = scanner.nextLine();
        System.out.println("Here is the story:");
        System.out.printf("Once upon a time there was %s, who was %s.%n", name, job);
        System.out.printf("On the way to work, %s reflected on life.%n", name);
        System.out.printf("Perhaps %s will not be %s forever.", name, job);

        // Write your program here

    }
}
