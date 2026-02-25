package students.glenntyson;


import java.util.ArrayList;
import java.util.List;

public class School {

    private List<Student> students;
    private List<Instructor> instructors;

    public School() {
        this.students = new ArrayList<>();
        this.instructors = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void addInstructor(Instructor instructor) {
        instructors.add(instructor);
    }

    public void printDirectory() {
        System.out.println("=== School Directory ===");

        System.out.println("Students:");
        for (Student s : students) {
            System.out.println(s.getSummary());
        }

        System.out.println("Instructors:");
        for (Instructor i : instructors) {
            System.out.println(i.getSummary());
        }
    }
}
