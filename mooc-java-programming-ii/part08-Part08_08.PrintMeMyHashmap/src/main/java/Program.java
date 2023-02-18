
import java.util.HashMap;

public class Program {

    public static void main(String[] args) {
        // Test your program here!
    }

    public static void printKeys(HashMap<String,String> hashmap) {
        printKeysWhere(hashmap, "");
    }

    public static void printKeysWhere(HashMap<String,String> hashmap, String text) {
        for (String s: hashmap.keySet()) {
            if (s.contains(text)) System.out.println(s);
        }
    }

    public static void printValuesOfKeysWhere(HashMap<String,String> hashmap, String text) {
        for (String s: hashmap.keySet()) {
            if (!s.contains(text)) continue;
            System.out.println(hashmap.get(s));
        }
    }
}
