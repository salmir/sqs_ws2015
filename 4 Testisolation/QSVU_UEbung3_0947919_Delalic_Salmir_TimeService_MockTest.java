import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class QSVU_UEbung3_0947919_Delalic_Salmir_TimeService_MockTest {


    ChristmasCounter CounterMock;

    @Before
    public void setUp() {
        CounterMock = new ChristmasCounter(new QSVU_UEbung3_0947919_Delalic_Salmir_TimeService_Mock());
    }

    @Test
    public void testCalculateDaysWithMock() {

        ChristmasCounter christmasCounter = new ChristmasCounter(new TimeServiceImpl());
        assertEquals(10L, CounterMock.calculateDaysToChristmas());
    }
}