import org.junit.*;
import static org.junit.Assert.*;


public class QSVU_UEbung3_0947919_Delalic_Salmir_TriangleTest {

    QSVU_UEbung3_0947919_Delalic_Salmir_Triangle triangle;

    @Before
    public void setUp() {
        triangle = new QSVU_UEbung3_0947919_Delalic_Salmir_Triangle();
    }

    @Test
    public void testCalcHyp() {
        double a = 2.0;
        double b = 3.0;
        double hypo;
        hypo = (a*a) + (b*b);
        hypo = Math.sqrt(hypo);

        triangle.calcHyp(a,b);
        assertEquals(hypo, triangle.getHyp(), 0.01);
    }

    @Test
    public void testCalcAngle() {
        double knownAngle = 30;

        double unknownAngle = 90 - knownAngle;

        assertEquals(unknownAngle, triangle.calcAngle(knownAngle), 0.1);
    }

    @Test
    public void testCalcArea() {
        double a = 4.0;
        double b = 5.0;

        double area = (a*b) / 2;
        assertEquals(area, triangle.calcArea(a,b), 0.0);
    }
}