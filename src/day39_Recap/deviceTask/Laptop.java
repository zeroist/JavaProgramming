package day39_Recap.deviceTask;
public class Laptop extends Computer{
    public Laptop(String brand, String model, double price, boolean hasBattery, boolean hasPowerButton, String operatingSystem, String cpuBrand, int ramSize) {
        super(brand, model, price, hasBattery, hasPowerButton, operatingSystem, cpuBrand, ramSize, true);
    }
}
