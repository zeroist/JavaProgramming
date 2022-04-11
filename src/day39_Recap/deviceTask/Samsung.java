package day39_Recap.deviceTask;
public class Samsung extends Phone {
    public Samsung(String model, double price) {
        super("Samsung", model, price);
    }
    public void freezing(){
        System.out.println(getModel()+" "+getBrand()+" is freezing");
    }
}
