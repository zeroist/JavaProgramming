package day38_Inheritance.shape;
public class ShapeObjects {
    public static void main(String[] args) {
        Square square = new Square(10);
        square.setSide(20);
        System.out.println(square);
        Rectangle rectangle = new Rectangle(5, 6);
        System.out.println(rectangle);
        rectangle.setLength(10);
        System.out.println(rectangle.getLength());
        System.out.println(rectangle);
        Circle circle=new Circle(7.5);
        System.out.println(circle);
        circle.setRadius(15.5);
        System.out.println(circle.getRadius());
        System.out.println(circle);
        System.out.println(circle.getName());


    }
}
