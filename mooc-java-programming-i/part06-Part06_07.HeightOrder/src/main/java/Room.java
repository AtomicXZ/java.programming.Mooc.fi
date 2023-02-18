import java.util.ArrayList;
public class Room {
    private ArrayList<Person> people;

    public Room() {
        people = new ArrayList<>();
    }

    public void add(Person person) {
        if (this.isEmpty()) {
            people.add(person);
            return;
        }

        people.add(person);
        int size = people.size();
        for (int i = 0; i < size - 1; i++) {
            for(int j = 0; j < size - i - 1; j++) {
                if(people.get(j).getHeight() > people.get(j + 1).getHeight()) {
                    Person tempVar = people.get(j + 1);
                    people.set(j + 1, people.get(j));
                    people.set(j, tempVar);
                }
            }
        }
    }

    public boolean isEmpty() {
        return people.isEmpty();
    }

    public ArrayList<Person> getPersons() {
        return people;
    }

    public Person shortest() {
        if (this.isEmpty()) return null;

        return people.get(0);
    }

    public Person take() {
        if (this.isEmpty()) return null;

        Person shortest = this.shortest();
        this.people.remove(shortest);
        return shortest;
    }
}
