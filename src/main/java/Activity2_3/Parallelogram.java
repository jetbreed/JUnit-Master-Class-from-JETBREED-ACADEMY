package Activity2_3;

public class Parallelogram implements Shapes{

    private double base;
    private double height;

    public Parallelogram(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public Parallelogram() {
    }

    @Override
    public void draw() {
        System.out.println("Drawing Parallelogram");
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
