package Activity2_2;

public class Circle implements Shapes {

    private double radius;

    public Circle(double radius)
    {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Circle with " +
                "radius "+radius+" cm");
    }

    public void setRadius(double newRadius) {
        this.radius = newRadius;
    }

//    Accessor Member
    public double getRadius() {
        return radius;
    }
}
