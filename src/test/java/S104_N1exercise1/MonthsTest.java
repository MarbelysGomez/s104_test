package S104_N1exercise1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

public class MonthsTest {
    private Months months;

    @BeforeEach
    public void setUp() {
        months = new Months();
        months.insertMonths();
    }

    @Test
    public void testListSize() {
        List<String> monthsList = months.getMonths();
       assertEquals(12,monthsList.size());
    }

    @Test
    public void testListNotNull() {
        List<String> monthList = months.getMonths();
        assertNotNull(monthList);
    }

    @Test
    public void testAugustPosition() {
        List<String> monthList = months.getMonths();
        assertEquals("August", monthList.get(7));
    }
}