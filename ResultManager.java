import java.util.ArrayList;

public class ResultManager {
    ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student s) {
        students.add(s);
    }

    public void displayResults() {
        for (Student s : students) {
            System.out.println(
                s.rollNo + " | " + s.name + " | " +
                s.percentage() + "% | Grade: " + s.grade()
            );
        }
    }
}
