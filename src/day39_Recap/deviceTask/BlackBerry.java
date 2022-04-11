package day39_Recap.deviceTask;
public class BlackBerry extends Phone {
    public BlackBerry(String model, double price) {
        super("BlackBerry", model, price);
    }
    public void deliverEmailFast(String email){
        System.out.println(getBrand()+" "+getBrand()+" is delivering "+email);
    }

}
