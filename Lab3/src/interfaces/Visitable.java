package interfaces;

import javafx.util.Duration;
import java.time.LocalDate;
import java.time.LocalTime;

public interface Visitable {
    public void setOpeningHours(String openingHours);

    public default String getOpeningHours() {
        return "09:30";
    }

    public void setClosingHours(String closingHours);

    public default String getClosingHours() {
        return "20:00";
    }

    public static Duration getVisitingDuration(String openingHours, String closingHours){
        LocalTime openingTime = LocalTime.parse(openingHours);
        LocalTime closingTime = LocalTime.parse(closingHours);
        Duration duration = new Duration((closingTime.toSecondOfDay() - openingTime.toSecondOfDay())*1000);
        return duration;
    }
}
