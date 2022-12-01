package Activity3_2;

import Activity3_2_Creating_Test_Suites.Circle;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CircleTest {

    @Test
    public void testCircleArea(){
        System.out.println("AREA OF CIRCLE");
        double radius = 5;
        Circle instance = new Circle();
        double expectedResult = 78.5;
        double result = instance.areaCircle(radius);
        assertEquals(expectedResult, result, 0.0);
    }
}
