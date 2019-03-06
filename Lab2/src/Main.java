import java.time.LocalDate;
import java.time.Month;

public class Main {
        public static void main(String[] args) {

                Student s1 = new Student("S1", 2);
                Student s2 = new Student("S2",2);
                Student s3 = new Student("S3",1);
                Student s4 = new Student("S4",1);


                Application a1 = new Application("A1", LocalDate.of(2019, Month.JUNE, 1), Application.Language.JAVA);
                Application a2 = new Application("A2", LocalDate.of(2018, Month.JULY, 1), Application.Language.CPP);
                Application a3 = new Application("A3", LocalDate.of(2018, Month.JUNE, 1), Application.Language.C);
                Essay e1 = new Essay("E1", LocalDate.parse("2019-06-01"), Essay.Topic.ALGORITHMS);
                Essay e2 = new Essay("E2", LocalDate.parse("2019-06-02"), Essay.Topic.WEB);


                s1.setPreferences(a1, a2, a3);
                s2.setPreferences(a1, e1);
                s3.setPreferences(a2, a3, e1);
                s4.setPreferences(a3, e2);


                Problem problem = new Problem();
                problem.setStudents(s1, s2, s3, s4);
                System.out.println(problem);
                System.out.println(problem.getProjects()[0]);
        }
}
