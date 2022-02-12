import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class SampleDate {
    public static void main(String[] args) {
        System.out.println(new Date());
        SimpleDateFormat format = new SimpleDateFormat("MM-dd-yyyy");
        System.out.println(format.format(new Date()));

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);
        System.out.println(LocalDateTime.now());

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss a");
        System.out.println(formatter.format(LocalDateTime.now()));

        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.MONTH, -1 * new Random().nextInt(0,11));
        System.out.println(cal.getTime());
    }
}
