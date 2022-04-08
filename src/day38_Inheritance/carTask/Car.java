package day38_Inheritance.carTask;
public class Car {
    public String brand,model,color;
    public int year,miles;
    public double price;
    public Car(String brand, String model, String color, int year, int miles, double price) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.year = year;
        this.miles = miles;
        this.price = price;
    }
    public void start(){
        System.out.println(model+" "+brand+" is starting");
    }
    public void drive(){
        System.out.println(model+" "+brand+" is starting");
    }

    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", miles=" + miles +
                ", price=" + price +
                '}';
    }
}
