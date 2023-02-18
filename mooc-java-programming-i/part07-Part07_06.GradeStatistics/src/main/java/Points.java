import java.util.ArrayList;

public class Points {
    private ArrayList<Integer> points;
    private int[] gradeDistribution;

    public Points() {
        points = new ArrayList<>();
        gradeDistribution = new int[6];
    }

    public void addPoints(int point) {
        if (point >= 0 && point <= 100) {
            points.add(point);
            this.addToDistributionTable(point);
        }
    }

    private int[] sumAndCountOfPoints(int lowerLimit) {
        int count = 0;
        int sum = 0;
        for (int i: points) {
            if (i >= lowerLimit) {
                count ++;
                sum += i;
            }
        }
        return new int[] {sum, count};
    }

    public Object averageOfPoints(int lowerLimit) {
        int[] data = this.sumAndCountOfPoints(lowerLimit);
        int count = data[1];
        if (count == 0) return null;

        int sum = data[0];
        return (double) sum/count;
    }

    public Object averageOfPoints() {
        return this.averageOfPoints(0);
    }

    public Object averageOfPassingPoints() {
        return this.averageOfPoints(50);
    }

    public double passPercentage() {
        return ((double) 100*this.sumAndCountOfPoints(50)[1]/this.sumAndCountOfPoints(0)[1]);
    }

    public void addToDistributionTable(int point) {
        if (point < 50) {
            this.gradeDistribution[0] += 1;
        } else if (point < 60) {
            this.gradeDistribution[1] += 1;
        }  else if (point < 70) {
            this.gradeDistribution[2] += 1;
        }  else if (point < 80) {
            this.gradeDistribution[3] += 1;
        }  else if (point < 90) {
            this.gradeDistribution[4] += 1;
        }  else if (point <= 100) {
            this.gradeDistribution[5] += 1;
        }
    }

    public void printGradeDistribution() {
        for (int i = gradeDistribution.length - 1; i >= 0; i--) {
            System.out.print(i + ": ");
            for (int j = 0; j < gradeDistribution[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
