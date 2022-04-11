package day39_Recap.deviceTask;
public class Phone extends Device {
    public Phone(String brand, String model, double price) {
        super(brand, model, price, true, true);
    }
    public void call(long phoneNum){
        System.out.println(getModel()+" "+getBrand()+" is calling "+phoneNum);
    }
    public void text(long phoneNum){
        System.out.println(getModel()+" "+getBrand()+" is texting "+phoneNum);
    }
}
