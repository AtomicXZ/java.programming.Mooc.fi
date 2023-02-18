
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class StoringRecords {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Filename:");
        String file = scan.nextLine();

        ArrayList<Person> records = readRecordsFromFile(file);
        System.out.println("Persons: " + records.size());
        System.out.println("Persons:");
        for (Person person : records) {
            System.out.println(person);

        }
    }

    public static ArrayList<Person> readRecordsFromFile(String file) {
        ArrayList<Person> persons = new ArrayList<>();

        try {
            Scanner data = new Scanner(Paths.get(file));

            while (data.hasNextLine()) {
                String[] dataSplit = data.nextLine().split(",");
                persons.add(new Person(dataSplit[0], Integer.parseInt(dataSplit[1])));
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return persons;
    }
}
