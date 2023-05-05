import java.awt.*;

public class Group {

    private Object name;
    private Object lastname;
    private Object starosta;
    Student student1 = new Student(name, lastname, starosta);
    Student student2 = new Student(name, lastname, starosta);
    Student student3 = new Student(name, lastname, starosta);
    private int ID;
    private static int studentId =  0;

    public Group(int id, boolean starosta) {
        ID = id;
    }

    private String task = "Task 1";

    public Student getStudent() {
        String name = "Yura";
        String lastname = "Yuriev";
        boolean starosta = false;
        student1.getStudentId();
        student1.getTask();
        ID = ++studentId;
        System.out.println("Student name: " + name + " Student last name: " + lastname + " ID: " + ID+ " Is starosta:  " + starosta + " Had task: " + task);
        return student1;
    }

    public Student getStudent2() {
        String name = "Yuliia";
        String lastname = "Sokolova";
        boolean starosta = false;
        student2.getStudentId();
        ID = ++studentId;
        System.out.println("Student name: " + name + " Student last name: " + lastname + " ID: " + ID+ " Is starosta: " + starosta + " Had task: " + task);
        return student2;
    }

    public Student getStudent3() {
        String name = "Olena";
        String lastname = "Voloshyna";
        boolean starosta = true;
        student3.getStudentId();
        ID = ++studentId;
        System.out.println("Student name: " + name + " Student last name: " + lastname + " ID: " + ID+ " Is starosta: " + starosta + " Had task: " + task);
        return student3;
    }

    public Student changeStudent() {
        name = "Vasiliy";
        lastname = "Loshkin";
        starosta = false;
        task = "Task 2";
        System.out.println("Student was updated with new name: " + name + "  last name: " + lastname + " ID: " + ID + " Is starosta: " + starosta + " and new task: " + task);
        return student1;
    }

    public Student deleteStudent(){
        System.out.println("Student with ID: " + ID + " was successfully deleted");
        return null;
    }

    public Student addStudent(){
        Student studentNew = null;
        name = "Valeriy";
        lastname = "Zalujniy";
        starosta = false;
        task = "Ubit' rusnyu";
        ID = ++studentId;
        System.out.println("NEW Student with name: " + name + "  last name: " + lastname + " ID: " + ID + " Is starosta: " + starosta + " and new task: " + task);
        return studentNew;
    }

    public boolean isDone(){
        task = "Completed";
        System.out.println("Student with ID: " + ID + " task is: " + task);
        return true;
    }
}


