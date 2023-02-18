import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.print("Name: ");
            String name = scan.nextLine();
            if (name.equals("")) {break;}

            System.out.print("Duration: ");
            int duration = Integer.parseInt(scan.nextLine());

            programs.add(new TelevisionProgram(name, duration));
        }

        System.out.print("\nProgram's maximum duration? ");
        int duration = scan.nextInt();

        for (TelevisionProgram show: programs) {
            if (show.getDuration() <= duration) {
                System.out.println(show);
            }
        }
    }
}
