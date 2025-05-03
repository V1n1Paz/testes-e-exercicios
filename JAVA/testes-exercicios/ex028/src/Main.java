import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        DateTimeFormatter df01 = DateTimeFormatter.ofPattern("dd/MM/yyyy-HH:mm");
        System.out.println(LocalDateTime.now().format(df01));

        Instant d02 = Instant.now();

        DateTimeFormatter df02 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());

        System.out.println( df02.format(d02));

    }
}