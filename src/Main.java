import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Employee("Max", "Maxatovich", "Куратор", 100000));
        people.add(new Student("Jandarbek, "Jandarbekovich", 2.3));
        people.add(new Student("Edil", "Myrzabek", 3.7));
        people.add(new Employee("Arujan", "Arujanovich", "Куратор", 250000.00));
        Collections.sort(people);
        Collections.reverse(people);
        printData(people);
    }

    public static void printData(Iterable<Person> people) {
        for (Person person : people) {
            System.out.println(person);
        }
    }
}