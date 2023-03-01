package dictionary;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.stream.Stream;

public class SaveableDictionary {
    private final HashMap<String, String> to;
    private final HashMap<String, String> from;
    private String fn;

    public SaveableDictionary() {
        this.to = new HashMap<>();
        this.from = new HashMap<>();
    }

    public SaveableDictionary(String file) {
        this.to = new HashMap<>();
        this.from = new HashMap<>();
        this.fn = file;
    }

    public boolean load() {
        try (Stream<String> lines = Files.lines(Paths.get(fn))) {
            lines.map(line -> line.split(":")).forEach(data -> this.add(data[0], data[1]));
            return true;
        } catch (IOException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public void add(String word, String translation) {
        this.to.putIfAbsent(word, translation);
        this.from.putIfAbsent(translation, word);
    }

    public String translate(String word) {
        if (!to.containsKey(word)) return this.from.get(word);
        return this.to.get(word);
    }

    public void delete(String word) {
        if (to.containsKey(word)) {
            this.from.remove(to.get(word));
            this.to.remove(word);
            return;
        }

        this.to.remove(from.get(word));
        this.from.remove(word);
    }

    public boolean save() {
        try (PrintWriter pw = new PrintWriter(fn)) {
            for (String key: to.keySet()) pw.println(key + ":" + to.get(key));
            return true;
        } catch (IOException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
}
