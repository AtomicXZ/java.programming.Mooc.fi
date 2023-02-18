
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("File:");
        String fileName = scan.nextLine();

        try {
            Scanner file = new Scanner(Paths.get(fileName));
            System.out.println("Team:");
            String team = scan.nextLine();

            int count = 0;
            int wins = 0;
            int losses = 0;
            while (file.hasNextLine()) {
                String[] data = file.nextLine().split(",");
                if (data[0].equals(team) || data[1].equals(team)) {
                    count++;
                }

                if (data[0].equals(team)) {
                    if (Integer.parseInt(data[2]) > Integer.parseInt(data[3])) {
                        wins++;
                    } else {
                        losses++;
                    }
                } else if (data[1].equals(team)) {
                    if (Integer.parseInt(data[2]) < Integer.parseInt(data[3])) {
                        wins++;
                    } else {
                        losses++;
                    }
                }
            }
            System.out.println("Games: " + count);
            System.out.println("Wins: " + wins);
            System.out.println("Losses: " + losses);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}
