package HW.Class25;


import java.util.HashSet;
import java.util.Set;

/*
Create a Set that will hold Objects of Student Type. In this set we do not care about the insertion order.
 Each student object should have name and studentID. Display name of each student.
 */
public class Task3Student {
    String name;
    int studentID;

    public Task3Student(String name, int studentID) {
        this.name = name;
        this.studentID = studentID;
    }
}

class StudentTester {
    public static void main(String[] args) {
        Set<Task3Student> students = new HashSet<>();
        students.add(new Task3Student("Hichem", 001));
        students.add(new Task3Student("Oumayma", 002));
        students.add(new Task3Student("Omar", 003));
        for (Task3Student s : students) {
            System.out.println("That student's name is: " + s.name);
        }
    }
}