import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {
    public static void main(String[] args) {

        //Crea un oggetto OffsetDateTime da questa stringa 2002-03-01T13:00:00Z
        OffsetDateTime date = OffsetDateTime.parse("2002-03-01T13:00:00Z");
        System.out.println("Initial format date: " + date);

        //Formatta la data ottenuta in FULL, MEDIUM e SHORT
        System.out.println("SHORT: " + dateShort(null));
        System.out.println("MEDIUM: " + dateMedium(date));
        System.out.println("FULL: " + dateFull(date));
    }

    public static String dateFull(OffsetDateTime date) {
        if (date == null) {
            return null;
        } else {
            return date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
        }
    }

    public static String dateMedium(OffsetDateTime date) {
        if (date == null) {
            return null;
        } else {
            return date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
        }
    }

    public static String dateShort(OffsetDateTime date) {
        if (date == null) {
            return null;
        } else {
            return date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));
        }
    }
}