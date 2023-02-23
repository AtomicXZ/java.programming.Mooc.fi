public class CD implements Packable{
    private String singer;
    private String name;
    private int year;
    private final double weight;

    public CD(String author, String name, int year) {
        this.singer = author;
        this.name = name;
        this.year = year;
        this.weight = 0.1;
    }

    public double weight() {
        return this.weight;
    }

    public String toString() {
        return singer + ": " + name + " (" + year + ")";
    }
}
