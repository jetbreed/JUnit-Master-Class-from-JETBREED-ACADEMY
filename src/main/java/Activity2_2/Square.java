package Activity2_2;

public class Square implements Shapes
{
    private double length;

    public Square(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Square");
    }
}
