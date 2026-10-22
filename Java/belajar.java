import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class belajar {
    public static void main(String[] args) {
        LocalDate hari = LocalDate.now();
        DateTimeFormatter ftm = DateTimeFormatter.ofPattern(
            "EEEE, dd MMMM yyyy",
            Locale.forLanguageTag("id-ID"));
        System.out.println("Hari ini " + hari.format(ftm)
            + ", saya belajar library di Java");
    }
}