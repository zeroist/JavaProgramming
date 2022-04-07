package phoneTask;
public class Iphone extends Phone {
    public void faceTime(long phoneNumber){
        System.out.println(brand+ " is having faceTime with "+ phoneNumber);
    }
    public void faceTime(String email){
        System.out.println(brand+ " is sending email to"+email);
    }

}
