package Activity2_3;

public class Circle implements Shapes {

    private double radius;

    public Circle(double initradius)
    {
        radius = initradius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Circle with radius "+radius+" cm");
    }

    public void setRadius(double newRadius) {
        this.radius = newRadius;
    }

//    Accessor Member
    public double getRadius() {
        return radius;
    }
}
