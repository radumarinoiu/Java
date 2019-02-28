import java.util.ArrayList;

public class Student {
    private String name;
    private int year;
    private ArrayList<Project> preferences;

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
        return "Student{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", preferences=" + preferences +
                '}';
    }
}
