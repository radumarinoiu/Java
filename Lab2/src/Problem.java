import java.util.ArrayList;

public class Problem<student> {

    private ArrayList<Student> students = new ArrayList<Student>();

    public void setStudents(Student... students){
        this.students = new ArrayList<Student>();
        for(Student st: students){
            this.students.add(st);
        }
    }

    @Override
    public String toString() {
        return "Problem{" +
                "students=" + students +
                '}';
    }
}
