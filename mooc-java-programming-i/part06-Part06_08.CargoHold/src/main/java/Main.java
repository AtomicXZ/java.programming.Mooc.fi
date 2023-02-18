
public class Main {

    public static void main(String[] args) {
        Suitcase sc = new Suitcase(10);

        sc.addItem(new Item("OK1", 1));
        sc.addItem(new Item("OK2", 1));
        sc.addItem(new Item("OK3", 1));
        sc.addItem(new Item("OK4", 1));
        sc.addItem(new Item("OK", 6));
        System.out.println(sc.totalWeight());
        sc.addItem(new Item("OK", 1));
        System.out.println(sc.totalWeight());


    }

}
