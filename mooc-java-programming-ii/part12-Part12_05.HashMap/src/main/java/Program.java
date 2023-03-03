
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // You can test the class here
        HashMap<String, Integer> marks = new HashMap<>();
        marks.add("AtomicX", 10);
        marks.add("okbr", 9);
        marks.add("hi", 8);
        System.out.println(marks.get("okbr"));
        System.out.println("\n"+marks);
        marks.remove("hi");
        System.out.println("\n"+marks);
    }

}
