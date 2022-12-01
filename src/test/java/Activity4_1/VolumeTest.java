package Activity4_1;

import Activity4_1_Analyzing_Code_Coverage.volume.Cone;
import Activity4_1_Analyzing_Code_Coverage.volume.Cube;
import Activity4_1_Analyzing_Code_Coverage.volume.Sphere;
import org.junit.Assert.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VolumeTest {
    @Test
    public void testCone(){
        System.out.println("VOLUME OF CONE");
        double expectedResult;
        double result;

        expectedResult = 314.0;
        Cone cone = new Cone();
        result = cone.volume(10.0, 3.0);
        assertEquals(expectedResult,result,0.0);
    }

    @Test
    public void testCube(){
        System.out.println("VOLUME OF CUBE");
        double expectedResult;
        double result;

        double edge = 5;

        expectedResult = 125;
        Cube cube = new Cube();
        result = cube.volume(edge);
        assertEquals(expectedResult,result,0.0);
    }

//    Write Test for Sphere
    @Test
    public void testSphere(){
        System.out.println("VOLUME OF SPHERE");
        double expectedResult;
        double result;

        double radius = 30.0;
        expectedResult = 113040;
        Sphere sphere = new Sphere();
        result = sphere.volume(radius);
        assertEquals(expectedResult,result,0.0);
    }

    @Test
    public void testMain(){
        System.out.println("main");
        String[] args = null;
        Sphere.main(args);
    }
}