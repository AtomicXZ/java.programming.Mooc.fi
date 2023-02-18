public class Film {
    private String name;
    private int AgeRating;

    public Film(String filmName, int filmAgeRating) {
        this.name = filmName;
        this.AgeRating = filmAgeRating;
    }

    public String name() {return this.name;}
    public int ageRating() {return this.AgeRating;}
}
