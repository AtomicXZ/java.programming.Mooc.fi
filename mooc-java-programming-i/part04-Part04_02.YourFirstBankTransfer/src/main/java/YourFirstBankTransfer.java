
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        Account matthew = new Account("Matthews account", 1000);
        Account mine = new Account("My account", 0);
        matthew.withdrawal(100);
        mine.deposit(100);
        System.out.println(matthew);
        System.out.println(mine);
    }
}
