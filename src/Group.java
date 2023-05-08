import java.util.ArrayList;
import java.util.List;

public class Group {

    private Student student;
    private String task;
    private int ID;
    private static int studentId =  0;

    private List<Student> students = new ArrayList<>();


    public void addStudent(Student student){
        students.add(student);
    }

    public void setStarosta(Student student) {
        System.out.println("This student is starosta: " + student.getName());
    }

    public void setTask(String task) {
        this.task = task;
        for (Student student: students){
            System.out.println("Task was set: " + student.getName() + " " + task);
            }
    }

    public int getNewID() {
        ID = ++studentId;
        return ID;
    }

    public void setStudentId() {
        int ID = getNewID();
    }

    public void printGroup(Student student){
        System.out.println(student.getName()+ " " + student.getLastname() + " " + getNewID());
    }

    public void removeStudent(Student student){
        students.remove(student);
        System.out.println(student.getName() + " Was removed");
    }
}


