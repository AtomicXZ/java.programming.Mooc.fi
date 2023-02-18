
public class Main {

    public static void main(String[] args) {
        Stack p = new Stack();
        p.add("38e277");
        p.add("ab7d3a");
        p.add("6c6c97");
        System.out.println(p.take());
        System.out.println(p.take());
        System.out.println(p.take());
        System.out.println(p.isEmpty());
    }
}
