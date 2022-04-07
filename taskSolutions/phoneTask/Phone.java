package phoneTask;
public class Phone {
    public String brand, model, color;
    public char size;
    double price;
    public void setInfo(String brand, String model, String color, char size, double price) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.size = size;
        this.price = price;
    }
    public void call(long phoneNumber) {
        System.out.println(brand + " is calling " + phoneNumber);
    }
    public void text(long phoneNumber) {
        System.out.println(brand + " is sendig a text message to " + phoneNumber);
    }
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", size=" + size +
                ", price=" + price +
                '}';
    }
}
