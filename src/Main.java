public class Main {
    public static void main(String[] args) {

        byte id = 0;
        boolean starosta = false;

        Group student1 = new Group(id, starosta);
        student1.getStudent();

        Group student2 = new Group(id, starosta);
        student2.getStudent2();

        Group student3 = new Group(id, starosta);
        student3.getStudent3();

        Group studentNew = new Group(id, starosta);
        studentNew.addStudent();
        studentNew.isDone();

        student1.changeStudent();
        student1.deleteStudent();

    }
}
