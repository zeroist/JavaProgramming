package day39_Recap.deviceTask;
public class Nokia extends Phone {
    public Nokia(String model, double price) {
        super("Nokia", model, price);
    }
    public void selfDefence(){
        System.out.println("you can use "+getBrand()+" "+getModel()+" as self defense tool");
    }
}
