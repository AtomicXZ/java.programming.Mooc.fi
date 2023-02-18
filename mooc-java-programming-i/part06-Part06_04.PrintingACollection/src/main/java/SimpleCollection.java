
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    @Override
    public String toString() {
        if (elements.isEmpty()) return "The collection " + this.name + " is empty.";
        StringBuilder returnString = new StringBuilder("The collection " + this.name + " has " + this.elements.size() + (this.elements.size() == 1 ? " element:" : " elements:"));

        for (String s: this.elements) {
            returnString.append("\n").append(s);
        }
        return returnString.toString();
    }
    
}
