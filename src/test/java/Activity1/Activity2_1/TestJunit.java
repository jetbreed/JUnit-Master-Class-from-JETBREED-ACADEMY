package Activity1.Activity2_1;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestJunit
{
    public static int multiply(int n1, int n2)
    {
        return n1 * n2;
    }

    @Test
    public void testPrintMessage()
    {
//        TestJunit testJunit = new TestJunit();
        assertEquals(6,TestJunit.multiply(2,3));
    }
}
