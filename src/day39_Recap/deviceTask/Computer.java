package day39_Recap.deviceTask;
public class Computer extends Device {
    private String operatingSystem;
    private String cpuBrand;
    private int ramSize;
    private boolean isLaptop;
    public Computer(String brand, String model, double price, boolean hasBattery, boolean hasPowerButton, String operatingSystem, String cpuBrand, int ramSize, boolean isLaptop) {
        super(brand, model, price, hasBattery, hasPowerButton);
        setOperatingSystem(operatingSystem);
        setCpuBrand(cpuBrand);
        setRamSize(ramSize);
        setLaptop(isLaptop);
    }
    public String getOperatingSystem() {
        return operatingSystem;
    }
    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }
    public String getCpuBrand() {
        return cpuBrand;
    }
    public void setCpuBrand(String cpuBrand) {
        this.cpuBrand = cpuBrand;
    }
    public int getRamSize() {
        return ramSize;
    }
    public void setRamSize(int ramSize) {
        this.ramSize = ramSize;
    }
    public boolean isLaptop() {
        return isLaptop;
    }
    public void setLaptop(boolean laptop) {
        isLaptop = laptop;
    }
    public void playMovie(String movieName){

    }
    public void openExcel(){

    }
    @Override
    public String toString() {
        return "Computer{" +
                "brand='" + getBrand() + '\'' +
                ", model='" + getModel() + '\'' +
                ", operatingSystem='" + operatingSystem + '\'' +
                ", cpuBrand='" + cpuBrand + '\'' +
                ", ramSize=" + ramSize +
                ", isLaptop=" + (true?"I am a Laptop":"I am a desktop") +
                '}';
    }
}
