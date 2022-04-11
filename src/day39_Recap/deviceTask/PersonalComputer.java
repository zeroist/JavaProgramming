package day39_Recap.deviceTask;
public class PersonalComputer extends Computer {
    public PersonalComputer(String brand, String model, double price,boolean hasPowerButton, String operatingSystem, String cpuBrand, int ramSize) {
        super(brand, model, price, false, hasPowerButton, operatingSystem, cpuBrand, ramSize, false);
    }
}
