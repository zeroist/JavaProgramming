package day37_Inheritance.phoneTask;
public class PhoneShop {
    public static void main(String[] args) {
        Iphone iphone=new Iphone("X13","small",4000,"Black");
        Samsung samsung=new Samsung("galaxy","6 inches",900,"White");
        Nokia nokia=new Nokia("S100","4 inches",50,"Gray");
        System.out.println(iphone);
        System.out.println(samsung);
        System.out.println(nokia);
        iphone.call(911);
        iphone.text(23245);
        iphone.faceTime("abdk@gmail.com");
        System.out.println("--------------------------------");
        samsung.call(7987987);
        samsung.text(7989874);
        samsung.freeze();
        System.out.println("--------------------------------");
        nokia.call(97987);
        nokia.text(9987987);
        nokia.selfDefence();
        System.out.println(Iphone.hasBattery);
        System.out.println(nokia.hasBattery);
    }
}
