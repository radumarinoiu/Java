import java.time.LocalDate;

public class Essay extends Project{

    public Topic getTopic() {
        return topic;
    }

    public void setTopic(Topic topic) {
        this.topic = topic;
    }

    public enum Topic{
        ALGORITHMS, DATA_STRUCTURES, WEB, DATABASES;
    }

    private Topic topic;

    public Essay(String e1, LocalDate parse, Topic algorithms) {
        this.setName(e1);
        this.setDeadline(parse);
        this.setTopic(algorithms);
    }
}
