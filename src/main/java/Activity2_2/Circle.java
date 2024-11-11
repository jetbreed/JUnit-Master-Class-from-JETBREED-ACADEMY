package Activity2_2;

public class Circle implements Shapes {

    private double radius;

    private double pi;


    public Circle()
    {

    }

    public Circle(double radius)
    {
        this.radius = radius;
    }

    public Circle(double radius, double pi)
    {
        this.radius = radius;
        this.pi = pi;
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

    public double getPi() {
        return pi;
    }

    public void setPi(double pi) {
        this.pi = pi;
    }
}
