import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarDemo {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();

        System.out.println("Using Calendar:");
        System.out.println("Date and Time: " + cal.getTime());
        System.out.println("Year: " + cal.get(Calendar.YEAR));
        System.out.println("Month: " + (cal.get(Calendar.MONTH) + 1));
        System.out.println("Day: " + cal.get(Calendar.DAY_OF_MONTH));
        GregorianCalendar gcal = new GregorianCalendar();
        System.out.println("\nUsing GregorianCalendar:");
        System.out.println("Date and Time: " + gcal.getTime());
        System.out.println("Year: " + gcal.get(GregorianCalendar.YEAR));
        System.out.println("Month: " + (gcal.get(GregorianCalendar.MONTH) + 1));
        System.out.println("Day: " + gcal.get(GregorianCalendar.DAY_OF_MONTH));
    }
}