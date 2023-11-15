import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    private final Main testing = new Main();

    @Test
    void dateFull_withDate() {
        String result = testing.dateFull(OffsetDateTime.parse("2002-03-01T13:00:00Z"));
        assertEquals("venerdì 1 marzo 2002", result,"Data full ");
    }

    @Test
    void dateFull_withNull() {
        String result = testing.dateFull(null);
        assertNull(result, "result null");
    }

    @Test
    void dateMedium_withDate() {
        String result = testing.dateMedium(OffsetDateTime.parse("2002-03-01T13:00:00Z"));
        assertEquals("1 mar 2002", result,"Data Medium ");
    }
    @Test
    void dateMedium_withNull() {
        String result = testing.dateMedium(null);
        assertNull(result, "result null");
    }

    @Test
    void dateShort_withDate() {
        String result = testing.dateShort(OffsetDateTime.parse("2002-03-01T13:00:00Z"));
        assertEquals("01/03/02", result,"Data short ");
    }
    @Test
    void dateShort_withNull() {
        String result = testing.dateShort(null);
        assertNull(result, "result null");
    }
}