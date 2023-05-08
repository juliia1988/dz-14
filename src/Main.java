import java.awt.*;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("Yuliia", "Sokolova");
        Student student2 = new Student("Olena", "Voloshyna");

        Group groupOfStudents = new Group();
        groupOfStudents.addStudent(student1);
        groupOfStudents.addStudent(student2);

        groupOfStudents.printGroup(student1);
        groupOfStudents.printGroup(student2);

        groupOfStudents.setTask("Task 1");


        Group starosta = new Group();
        starosta.setStarosta(student1);
        student1.setName("Ekaterina");

        Group taskIsDone = new Group();
        taskIsDone.addStudent(student1);
        taskIsDone.setTask("Task is Done");

        groupOfStudents.removeStudent(student1);

    }
}