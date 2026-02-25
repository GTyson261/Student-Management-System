package students.glenntyson;

import java.util.ArrayList;
import java.util.List;

public class Instructor extends Person {

    private String department;
    private List<Student> assignedStudents;

    public Instructor(int id, String firstName, String lastName, String email, String department) {
        super(id, firstName, lastName, email);
        this.department = department;
        this.assignedStudents = new ArrayList<>();
    }

    public String getDepartment() {
        return department;
    }

    public void addStudent(Student student) {
        assignedStudents.add(student);
    }

    public void printRoster() {
        System.out.println(getFirstName() + " " + getLastName() + "'s Roster:");
        for (Student s : assignedStudents) {
            System.out.println("  - " + s.getFirstName() + " " + s.getLastName() + " | Grade Level: " + s.getGradeLevel() + " | GPA: " + s.getGpa());
        }
    }

    public void createAnnouncement(String message) {
        System.out.println("Announcement from " + getFirstName() + " " + getLastName() + ": " + message);
    }

    @Override
    public String getSummary() {
        return "Instructor| " + getFirstName() + " " + getLastName() + " | Department: " + department;
    }
}
