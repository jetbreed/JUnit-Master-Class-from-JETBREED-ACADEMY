package Activity2_2;

public class Triangle implements Shapes{
    private int base;

    @Override
    public void draw() {

    }

    private int height;

    public Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    public int getBase() {
        return base;
    }

    public int getHeight() {
        return height;
    }
}
