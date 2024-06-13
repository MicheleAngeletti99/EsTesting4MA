import java.time.DayOfWeek;
import java.time.Month;
import java.time.OffsetDateTime;

public class Main {
    public static void main(String[] args) {
        String dataString = "2023-03-01T13:00:00Z";
        OffsetDateTime data = OffsetDateTime.parse(dataString);

        int anno = getYear(data);
        Month mese = getMonth(data);
        int giornoDelMese = getDayOfMonth(data);
        DayOfWeek giornoDellaSettimana = getDayOfWeek(data);

        System.out.println("Anno: " + anno);
        System.out.println("Mese: " + mese);
        System.out.println("Giorno del mese: " + giornoDelMese);
        System.out.println("Giorno della settimana: " + giornoDellaSettimana);
    }

    public static DayOfWeek getDayOfWeek(OffsetDateTime data) {
        return data.getDayOfWeek();
    }

    public static int getDayOfMonth(OffsetDateTime data) {
        return data.getDayOfMonth();
    }

    public static Month getMonth(OffsetDateTime data) {
        return data.getMonth();
    }

    public static int getYear(OffsetDateTime data) {
        return data.getYear();
    }
}