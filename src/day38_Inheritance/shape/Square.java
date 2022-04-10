package day38_Inheritance.shape;
public class Square extends Shape  {
    private double side;
    public double getSide() {
        return side;
    }
    public void setSide(double side) {
        if(side<=0){
            System.err.println("invalid side: "+side);
            System.exit(1);
        }
        this.side = side;
    }
    public Square(double side) {
        super("Square");
        setSide(side);
    }
    @Override
    public double area() {
        return side*side;
    }
    @Override
    public double perimeter() {
        return 4*side;
    }
    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                ", area=" + area() +
                ", perimeter=" + perimeter() +
                '}';
    }
}
