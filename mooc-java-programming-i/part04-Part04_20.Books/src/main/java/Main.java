import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        while (true) {
            System.out.print("Title: ");
            String title = scan.nextLine();
            if (title.equals("")) {
                break;
            }

            System.out.print("Pages: ");
            int pages = Integer.parseInt(scan.nextLine());
            System.out.print("Publication Year: ");
            int publicationYear = Integer.parseInt(scan.nextLine());

            books.add(new Book(title, pages, publicationYear));
        }

        System.out.print("What information will be printed? ");
        String outputInfo = scan.nextLine();
        for (Book book: books) {
            if (outputInfo.equals("everything")) {
                System.out.println(book);
            } else if (outputInfo.equals("name")) {
                System.out.println(book.getTitle());
            }
        }

    }
}
