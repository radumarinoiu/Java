import java.util.HashSet;
import java.util.Set;

public class Problem {

    public Project[] getProjects() {
        return taken_projects.toArray(new Project[taken_projects.size()]);
    }

    private Set<Project> taken_projects;
    private Set<Student> students;
    private Set<Match> matches;

    public void setStudents(Student... students){
        this.taken_projects = new HashSet<>();
        this.students = new HashSet<>();
        this.matches = new HashSet<>();
        for(Student st: students){
            if(!this.students.contains(st))
            {
                for(Project pr: st.getPreferences()){
                    if(!taken_projects.contains(pr)){
                        this.taken_projects.add(pr);
                        this.students.add(st);
                        this.matches.add(new Match(st, pr));
                        break;
                    }
                }
            }
        }
        this.students.clear();

    }

    @Override
    public String toString() {
        String str = "[";
        for(Match mt: this.matches){
            str += mt.toString() + ", ";
        }
        str = str.substring(0, str.length()-2);
        str += "]";
        return str;
    }
}
