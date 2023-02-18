
public class YourFirstAccount {

    public static void main(String[] args) {
        Account name = new Account("name", 100);
        name.deposit(20);
        System.out.println(name);
    }
}
