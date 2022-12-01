package Activity4_1_Analyzing_Code_Coverage.volume;

public class Sphere {
    public double volume(double radius)
    {
        double result;
        result = (4*3.14*Math.pow(radius,3))/3;

        return result;
    }

    public static void main(String[] args) {
//Todo Code Application Logic
        System.out.println("PRINT THE VOLUMES OF SHAPES");

        Cone cone = new Cone();
        System.out.printf("%n%s %, .2f", "CONE VOLUME: ",
                cone.volume(23, 34));

        Cube cube = new Cube();
        System.out.printf("%n%s %, .2f", "CUBE VOLUME: ",
                cube.volume(20.0));

        Sphere sphere = new Sphere();
        System.out.printf("%n%s %, .2f", "SPHERE VOLUME: ",
                sphere.volume(23));

    }

}
