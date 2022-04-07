package iphone;
public class IPhone {
    public String model, color, size;
    public double price;
    public static String brand = "Iphone";
    public static String os = "IOS";
    public static String madeIn = "China";
    public IPhone(String model, String color, String size, double price) {
        this.model = model;
        this.color = color;
        this.size = size;
        this.price = price;
    }
    public void faceTime(long phoneNumber) {
        System.out.println(brand + " is facetimimg with " + phoneNumber);
    }
    public void faceTime(String email) {
        System.out.println(brand + " is facetimimg with " + email);
    }
    public void call(long phoneNumber) {
        System.out.println(brand + " is calling " + phoneNumber);
    }
    public void text(long phoneNumber) {
        System.out.println(brand + " is messaging with " + phoneNumber);
    }
    public String toString() {
        return "IPhone{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                '}';
    }
}
class ObjectOfIphone {
    public static void main(String[] args) {
        IPhone iPhone1 = new IPhone("13 Pro", "Black", "Large", 1200);
        iPhone1.faceTime(905304647559l);
        iPhone1.faceTime("yusufmesut@gmail.com");
        iPhone1.call(905304647559l);
        iPhone1.text(905304647559l);
        System.out.println(iPhone1);
    }
}
