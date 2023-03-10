public class Person {
    private final Education education;
    private final String name;

    public Person(String name, Education education) {
        this.name = name;
        this.education = education;
    }

    public Education getEducation() {
        return education;
    }

    @Override
    public String toString() {
        return this.name + ", " + this.education;
    }
}
