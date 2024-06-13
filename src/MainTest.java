import org.junit.jupiter.api.Test;

import java.time.DayOfWeek;
import java.time.Month;
import java.time.OffsetDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    @Test
    public void getDayOfWeek() {
        String dataString = "2023-03-01T13:00:00Z";
        OffsetDateTime data = OffsetDateTime.parse(dataString);

        DayOfWeek result = Main.getDayOfWeek(data);
        DayOfWeek expected = data.getDayOfWeek();

        assertEquals(expected, result);
    }

    @Test
    public void getDayOfMonth() {
        String dataString = "2023-03-01T13:00:00Z";
        OffsetDateTime data = OffsetDateTime.parse(dataString);

        int result = Main.getDayOfMonth(data);
        int expected = data.getDayOfMonth();

        assertEquals(expected, result);
    }

    @Test
    public void getMonth() {
        String dataString = "2023-03-01T13:00:00Z";
        OffsetDateTime data = OffsetDateTime.parse(dataString);

        Month result = Main.getMonth(data);
        Month expected = data.getMonth();

        assertEquals(expected, result);
    }

    @Test
    public void getYear() {
        String dataString = "2023-03-01T13:00:00Z";
        OffsetDateTime data = OffsetDateTime.parse(dataString);

        int result = Main.getYear(data);
        int expected = data.getYear();

        assertEquals(expected, result);
    }
}