package Activity2_2;

public class Area {
    public double calculateArea(Shapes shape)
    {
        double area = 0;
        if(shape instanceof Rectangle)
        {
            Rectangle rectangle = (Rectangle) shape;
            area = rectangle.getHeight() * rectangle.getWidth();
        }
        else if (shape instanceof Circle)
        {
            Circle circle = (Circle) shape;
            area = 3.14 * circle.getRadius() * circle.getRadius();
//            area = 3.14 * Math.pow(circle.getRadius(),2);
        }
        else if (shape instanceof Square)
        {
            Square square = (Square) shape;
            area = square.getLength() * square.getLength();
//            area = Math.pow(square.getLength(),2);
        }
        return area;
    }


    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(20, 40);
        Circle circle = new Circle(15);
        Square square = new Square(35);

        Area areaObject = new Area();
        System.out.println("Area of a Square is: "
                + areaObject.calculateArea(square));
        System.out.println("Area of a Rectangle is: "
                + areaObject.calculateArea(rectangle));
        System.out.println("Area of a Circle is: "
                + areaObject.calculateArea(circle));
    }
}
