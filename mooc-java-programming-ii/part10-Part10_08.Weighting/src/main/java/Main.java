

public class Main {

    public static void main(String[] args) {
        // Use this main program for testing your classes!
        Hold hold = new Hold(1000);
        Suitcase sc = new Suitcase(1000);
        sc.addItem(new Item("Pig", 7));
        sc.addItem(new Item("Wolf", 2));
        hold.addSuitcase(sc);
        hold.printItems();
    }

}
