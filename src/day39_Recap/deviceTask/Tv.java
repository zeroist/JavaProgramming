package day39_Recap.deviceTask;
public class Tv extends Device {
    private double screenSize;
    private boolean isSmart;

    public Tv(String brand, String model, double price, boolean hasBattery, boolean hasPowerButton, double screenSize, boolean isSmart) {
        super(brand, model, price, hasBattery, hasPowerButton);
        setScreenSize(screenSize) ;
        setSmart(isSmart);
    }
    public double getScreenSize() {
        return screenSize;
    }
    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }
    public boolean isSmart() {
        return isSmart;
    }
    public void setSmart(boolean smart) {
        isSmart = smart;
    }
    public void channelUp(){
        System.out.println(getBrand()+" "+getModel()+" is upping the channel ");
    }
    public void channelDown(){
        System.out.println(getBrand()+" "+getModel()+" is downing the channel ");
    }
    @Override
    public String toString() {
        return "Tv{" +
                "Brand=" + getBrand() +
                ", model=" + getModel() +
                ", screenSize=" + screenSize +
                ", isSmart=" + (true?"I am smart tv":"I am not a smart tv") +
                '}';
    }
}
