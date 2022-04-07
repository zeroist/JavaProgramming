//Car Day 33
package car;
public class Car {
    public String make, model, color;
    public int year;
    public double price;
    public static int numberOfWheels = 4;
    public static boolean hasBattery = true;
    public static boolean hasSeats = true;
    public Car(String make, String model, String color, int year, double price) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year;
        this.price = price;
    }
    public void drive(String nameOfDriver) {
        System.out.println(nameOfDriver + " is driving a car with specifications: " + toString());
    }
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' + "\n" +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", number Of Wheels=" + numberOfWheels +
                ", has Battery=" + hasBattery +
                ", has Seats=" + hasSeats +
                '}';
    }
}
class ObjectOfCar {
    public static void main(String[] args) {
        Car car1 = new Car("Audi", "A3", "Black", 2019, 15000);
        car1.drive("Yusuf");
        System.out.println(car1);
    }
}
