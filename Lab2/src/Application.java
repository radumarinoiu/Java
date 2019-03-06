import java.time.LocalDate;

public class Application extends Project{

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public enum Language{
        CPP, C, JAVA, PYTHON
    }

    private Language language;

    public Application(String a1, LocalDate of, Language java) {
        this.setName(a1);
        this.setDeadline(of);
        this.setLanguage(java);
    }
}
