import java.util.ArrayList;
import java.util.Objects;

public class Student {
    private String name;
    private int year;

    public ArrayList<Project> getPreferences() {
        return preferences;
    }

    private ArrayList<Project> preferences = new ArrayList<>();

    public Student(String s, int i) {
        this.setYear(i);
        this.setName(s);

    }

    public void setPreferences(Project... projects){
        this.preferences = new ArrayList<Project>();
        for(Project proj: projects){
            this.preferences.add(proj);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return year == student.year &&
                name.equals(student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, year);
    }
}
