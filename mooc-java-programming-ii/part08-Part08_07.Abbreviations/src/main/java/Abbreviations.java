import java.util.HashMap;

public class Abbreviations {
    private HashMap<String, String> abbs;

    public Abbreviations() {
        abbs = new HashMap<>();
    }

    public void addAbbreviation(String abbreviation, String explanation) {
        if (!this.hasAbbreviation(abbreviation)) abbs.put(abbreviation, explanation);
    }

    public boolean hasAbbreviation(String abbreviation) {
        return abbs.containsKey(abbreviation);
    }

    public String findExplanationFor(String abbreviation) {
        return abbs.getOrDefault(abbreviation, null);
    }
}
