import java.util.Scanner;

public class UserInterface {
    private Points points;
    private Scanner scan;

    public UserInterface(Scanner scanner) {
        this.points = new Points();
        this.scan = scanner;
    }

    public void Start() {
        System.out.println("Enter point totals, -1 stops:");
        while (true) {
            int point = Integer.parseInt(scan.nextLine());
            if (point == -1) break;
            points.addPoints(point);
        }
        System.out.println("Point average (all): " + (points.averageOfPoints() == null ? "-" : points.averageOfPoints()));
        System.out.println("Point average (passing): " + (points.averageOfPassingPoints() == null ? "-" : points.averageOfPassingPoints()));
        System.out.println("Pass percentage: " + points.passPercentage());
        System.out.println("Grade distribution:");
        points.printGradeDistribution();

    }
}
