package Activity3_2;

import Activity3_2_Creating_Test_Suites.Square;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SquareTest {
    @Test
    public void testSquareArea(){
        System.out.println("AREA OF SQUARE");
        double length = 4;
//        double breadth = 2;
        Square instance = new Square();
        double expectedResult = 16;
        double result = instance.squareArea(length);
        assertEquals(expectedResult, result, 0.0);
    }
}