import org.junit.Before;
import org.junit.Test;

import java.util.Date;
import static org.junit.Assert.*;

public class QSVU_UEbung3_0947919_Delalic_Salmir_TimeService_StubTest {

    ChristmasCounter CounterStub;

    @Before
    public void setUp() {
        CounterStub = new ChristmasCounter(new QSVU_UEbung3_0947919_Delalic_Salmir_TimeService_Stub());
    }

    @Test
    public void testCalculateDaysWithStub() {

        assertEquals( 10 ,CounterStub.calculateDaysToChristmas());
    }
}
