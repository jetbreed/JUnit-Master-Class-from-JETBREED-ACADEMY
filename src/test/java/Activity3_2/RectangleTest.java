package Activity3_2;

import Activity3_2_Creating_Test_Suites.Rectangle;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RectangleTest {

    @Test
    public void testRectangleArea(){
        System.out.println("AREA OF RECTANGLE");
        double length = 4;
        double breadth = 2;
        Rectangle instance = new Rectangle();
        double expectedResult = 8;
        double result = instance.rectangleArea(length, breadth);
        assertEquals(expectedResult, result, 0.0);
    }
}