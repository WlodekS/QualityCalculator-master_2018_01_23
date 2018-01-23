package pl.edu.agh.qualitycalculator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class CalculationsTest {
    Calculations calculationsUnderTest;
    CalculationsVerbalizer calcVerbTest = new CalculationsVerbalizer();

    @Before
    public void setUp() {
        calculationsUnderTest = new Calculations();
    }

    @Test
    public void testSum() throws Exception {
        assertEquals(5, calculationsUnderTest.calculate(Operation.SUM, 2, 3), 0.01);
    }

    @Test
    public void testMultiply() throws Exception {
        assertEquals(12, calculationsUnderTest.calculate(Operation.MULTIPLY, 3, 4), 0.01);
    }

    @Test
    public void testDivide() throws Exception {
        assertEquals(0.33, calculationsUnderTest.calculate(Operation.DIVIDE, 1, 3), 0.004);
    }

    @Test
    public void testDivide0() throws Exception {
        assertEquals(0, calculationsUnderTest.calculate(Operation.DIVIDE, 1, 0), 0.004);
    }

    @Test
    public void testSubTrack() throws Exception {
        assertEquals(4, calculationsUnderTest.calculate(Operation.SUBTRACT, 7, 3), 0.001);
    }

    @Test
    public void testUnknown() throws Exception {
        //assertEquals(10, calculationsUnderTest.calculate(Operation.AA, 7, 3), 0.001);
        try {
            assertEquals("Unknown operation", calculationsUnderTest.calculate(Operation.AA, 7, 3), 0.001);
        }
        catch (Exception e){
            //...

        }

    }

    @Test
    public void testVerbalizer() throws Exception {
        //assertEquals(10, calculationsUnderTest.calculate(Operation.AA, 7, 3), 0.001);
        assertEquals("1.0 plus 2.0 gives value 3.0", calcVerbTest.verbalize(Operation.SUM, 1, 2, 3));
    }

    @After
    public void tearDown() {
    }
}
