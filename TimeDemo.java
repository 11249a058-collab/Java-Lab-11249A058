import java.time.LocalDate;
public class TimeDemo {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println("Current Date: " + today);
        LocalDate nextWeek = today.plusDays(7);
        System.out.println("Date after 7 days: " + nextWeek);
    }
}
