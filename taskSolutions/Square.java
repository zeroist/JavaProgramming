public class Square {
    private double side;

    public Square(double side) {
        setSide(side);
    }

    public double getSide() {
        return side;
    }
    public void setSide(double side) {
        if(side<0) return;
        this.side = side;
    }
    public double calcArea() {
        return side * side;
    }
    public double calcPerimeter() {
        return 4 * side;
    }
    public String toString() {
        return "Square{" +
                "side=" + side +
                " area=" + calcArea() +
                " perimeter=" + calcPerimeter() +
                '}';
    }
}
class ObjectsOfSquare{
    public static void main(String[] args) {
        Square square1=new Square(4);
        Square square2=new Square(6);
        System.out.println(square1);
        System.out.println(square2);
    }

}
