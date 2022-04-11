package day39_Recap.deviceTask;
public class Device {
    private String brand,model;
    private double price;
    private boolean hasBattery,hasPowerButton;
    public Device(String brand, String model, double price, boolean hasBattery, boolean hasPowerButton) {
        setBrand(brand);
        setModel(model);
        setPrice(price);
        setHasBattery(hasBattery);
        setHasPowerButton(hasPowerButton);
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        if(brand==null||brand.isEmpty()||brand.isBlank()){
            System.out.println("invalid brand: "+ brand);System.exit(1);
        }
        this.brand = brand;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        if(model==null||model.isBlank()||model.isEmpty()){
            System.out.println("invalid model: "+model);System.exit(1);
        }
        this.model = model;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        if(price<0){
            System.out.println("invalid price: "+price); System.exit(1);
        }
        this.price = price;
    }
    public boolean isHasBattery() {
        return hasBattery;
    }
    public void setHasBattery(boolean hasBattery) {
        this.hasBattery = hasBattery;
    }
    public boolean isHasPowerButton() {
        return hasPowerButton;
    }
    public void setHasPowerButton(boolean hasPowerButton) {
        this.hasPowerButton = hasPowerButton;
    }
    public void turnOn(){
        System.out.println(brand+" "+model+" is now turning on");
    }
    public void turnOff(){
        System.out.println(brand+" "+model+" is now turning off");
    }
    @Override
    public String toString() {
        return "Device{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", hasBattery=" + (true?brand+" model has battery":brand+" does not include battery") +
                ", hasPowerButton=" + (true?brand+" model has power button":brand+" model does not have power button") +
                '}';
    }
}
