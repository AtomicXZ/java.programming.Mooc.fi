
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;

public class LiteracyComparison {
    
    public static void main(String[] args) {
        try {
            Files.lines(Paths.get("literacy.csv"))
                    .map(data -> data.split(","))
                    .sorted(Comparator.comparingDouble(data -> Double.parseDouble(data[5])))
                    .forEach(data -> System.out.printf("%s (%s), %s, %s%n", data[3], data[4], (data[2].contains("female") ? "female" : "male"), data[5]));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
