public class Match {
    public Student getStudent() {
        return student;
    }

    public Project getProject() {
        return project;
    }

    private Student student;
    private Project project;

    public Match(Student student, Project project) {
        this.student = student;
        this.project = project;
    }

    @Override
    public String toString() {
        return "("+this.student+":"+this.project+")";
    }
}
