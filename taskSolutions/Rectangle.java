public class Rectangle {
    private double width, length;
    public Rectangle(double width, double length) {
        setWidth(width);
        setLength(length);
    }
    public double getWidth() {
        return width;
    }
    public double getLength() {
        return length;
    }
    public void setWidth(double width) {
        if (width < 0) return;
        this.width = width;
    }
    public void setLength(double length) {
        if (length < 0) return;
        this.length = length;
    }
    public double calcArea() {
        return length * width;
    }
    public double calcPerimeter() {
        return 2 * (width + length);
    }
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                ", area=" + calcArea() +
                ", perimeter=" + calcPerimeter() +
                '}';
    }
}
class Objests{
    public static void main(String[] args) {
        Rectangle rectangle1=new Rectangle(10,20);
        Rectangle rectangle2=new Rectangle(30,40);
        System.out.println(rectangle1);
        System.out.println(rectangle2);
        System.out.println(rectangle1.getLength());
        rectangle1.setLength(50);
        rectangle2.setWidth(90);
        System.out.println(rectangle1.getLength());
        System.out.println(rectangle2.getWidth());
    }


}
