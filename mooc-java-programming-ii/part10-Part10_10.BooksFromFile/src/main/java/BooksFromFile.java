
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BooksFromFile {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test your method here

    }

    public static List<Book> readBooks(String file) {
        ArrayList<Book> books = new ArrayList<>();

        try {
            Files.lines(Paths.get(file))
                    .map(bookData -> bookData.split(","))
                    .forEach(x -> books.add(new Book(x[0], Integer.parseInt(x[1]), Integer.parseInt(x[2]), x[3])));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return books;
    }

}
