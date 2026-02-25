package students.glenntyson;


import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Student jordan = new Student(1, "Jordan", "Smith", "jordan@email.com", 2, 3.8);

        Student marcus = new Student(2, "Marcus", "Brown", "marcus@email.com", 1, 2.9);

        Instructor drRivera = new Instructor(100, "Dr.", "Rivera", "rivera@email.com", "Computer Science");

        drRivera.addStudent(jordan);
        drRivera.addStudent(marcus);

        drRivera.printRoster();

        System.out.println();

        List<Person> people = new ArrayList<>();
        people.add(jordan);
        people.add(marcus);
        people.add(drRivera);

        for (Person person : people) {
            System.out.println(person.getSummary());
        }

        School school = new School();
        school.addStudent(jordan);
        school.addStudent(marcus);
        school.addInstructor(drRivera);

        System.out.println();
        school.printDirectory();
    }
}
