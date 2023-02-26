import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employees {
    private final ArrayList<Person> employees;

    public Employees() {
        employees = new ArrayList<>();
    }

    public void add(Person personToAdd) {
        employees.add(personToAdd);
    }

    public void add(List<Person> peopleToAdd) {
        peopleToAdd.forEach(x -> this.employees.add(x));
    }

    public void print() {
        Iterator<Person> employees = this.employees.iterator();

        while (employees.hasNext()) System.out.println(employees.next());
    }

    public void print(Education education) {
        Iterator<Person> employees = this.employees.iterator();

        while (employees.hasNext()) {
            Person employee = employees.next();
            if (employee.getEducation() == education) System.out.println(employee);
        }
    }

    public void fire(Education education) {
        Iterator<Person> employees = this.employees.iterator();

        while (employees.hasNext()) if (employees.next().getEducation() == education) employees.remove();
    }
}
