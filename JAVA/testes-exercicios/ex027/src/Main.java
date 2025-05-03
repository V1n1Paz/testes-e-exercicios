import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();
        Instant d03 = Instant.now();
        System.out.println(d01);
        System.out.println(d02);
        System.out.println(d03);

        LocalDate d04 = LocalDate.parse("2000-02-02");      //.parse() converte de String para data
        LocalDateTime d05 = LocalDateTime.parse("2000-02-02T20:20:20.00300000");
        Instant d06 = Instant.parse("2000-02-02T20:20:20.000020000-03:00");     //Converte o horário do fuso indicado para o horário de Londres
                                                            //Adiciona +3h

        System.out.println(d04);
        System.out.println(d05);
        System.out.println(d06);
    }
}