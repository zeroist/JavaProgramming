package phoneTask;
public class PhoneObjects {
    public static void main(String[] args) {
        Iphone myIphone = new Iphone();
        myIphone.setInfo("Apple", "13 Pro Max", "black", 'M', 2000);
        myIphone.call(5304245589L);
        myIphone.faceTime(530454778L);
        Nokia sonsNokia = new Nokia();
        sonsNokia.setInfo("Nokia", "K90", "white", 'L', 400);
        sonsNokia.call(5304748894L);
        sonsNokia.selfDefense();
        Samsung wifesSamsung = new Samsung();
        wifesSamsung.setInfo("Samsung", "NonFreeze", "green", 'S', 900);
        wifesSamsung.freeze();
        wifesSamsung.text(56045778488L);
        System.out.println(wifesSamsung);
        System.out.println(sonsNokia);
        System.out.println(myIphone);
    }
}
