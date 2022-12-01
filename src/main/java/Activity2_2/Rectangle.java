package Activity2_2;

public class Rectangle implements Shapes{

    double width;
    double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle() {
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle with width "+width+" cm " +
                "and height "+height+" cm");
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double newWidth) {
        this.width = newWidth;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double newHeight) {
        this.height = newHeight;
    }
}
