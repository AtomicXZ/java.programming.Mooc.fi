import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
        Room room = new Room();
        room.add(new Person("Achyut", 169));
        room.add(new Person("Shi", 165));

        ArrayList<Person> people = room.getPersons();
        for (Person p: people) {
            System.out.println(p);
        }
        
    }
}
