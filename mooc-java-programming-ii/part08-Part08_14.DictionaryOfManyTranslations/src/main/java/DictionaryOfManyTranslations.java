import java.util.ArrayList;
import java.util.HashMap;

public class DictionaryOfManyTranslations {
    private HashMap<String, ArrayList<String>> dict;

    public DictionaryOfManyTranslations() {
        dict = new HashMap<>();

    }

    public void add(String word, String translation) {
        while (true) {
            if (dict.containsKey(word)) {
                dict.get(word).add(translation);
                break;
            }
            dict.put(word, new ArrayList<>());
        }
    }

    public ArrayList<String> translate(String word) {
        return dict.getOrDefault(word, new ArrayList<>());
    }

    public void remove(String word) {
        dict.remove(word);
    }
}
