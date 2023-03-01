package dictionary;

public class Main {
    public static void main(String[] args) {
        SaveableDictionary dictionary = new SaveableDictionary("words.txt");
        if (dictionary.load()) {
            System.out.println("Successfully loaded the dictionary from file");
        }

        dictionary.add("banaani", "banana");
        dictionary.add("ohjelmointi", "programming");

        System.out.println(dictionary.translate("apina"));
        System.out.println(dictionary.translate("ohjelmointi"));
        System.out.println(dictionary.translate("alla oleva"));

        if (dictionary.save()) {
            System.out.println("Successfully saved the dictionary into file");
        }
    }
}
