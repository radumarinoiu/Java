public abstract class Project {
    public String name;
    public  String deadline;

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDeadline() {
        return deadline;
    }

    public String getName() {
        return name;
    }
}
