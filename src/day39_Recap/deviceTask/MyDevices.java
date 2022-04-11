package day39_Recap.deviceTask;
public class MyDevices {
    public static void main(String[] args) {
        BlackBerry myBlackBerry=new BlackBerry("BB12",1200);
        Samsung mySamsung=new Samsung("Galaxy",1500);
        Nokia dadsnokia=new Nokia("S32",200);
        Google noonesGoogle=new Google("unknown",0);
        Iphone mumsIphone=new Iphone("X13",3000);
        PersonalComputer brothersPc=new PersonalComputer("Dell","K900",2500,true,"win10","i7",16);
        Laptop sistersLabtop=new Laptop("Toshiba","lonovo",5000,true,true,"win11","i5",32);
        Tv sittingRoomsTv=new Tv("Sony","Elcado",3500,false,true,82,true);

        System.out.println(sittingRoomsTv);
        sittingRoomsTv.turnOn();
        sittingRoomsTv.channelDown();
        
        System.out.println(myBlackBerry);
        myBlackBerry.deliverEmailFast("abd_yusuf@yahoo.com");
        myBlackBerry.call(5304647589L);
        myBlackBerry.setPrice(5304647589L);

        System.out.println(mySamsung);
        mySamsung.freezing();
        mySamsung.call(5304647589L);
        mySamsung.setPrice(5304647589L);

        System.out.println(dadsnokia);
        dadsnokia.selfDefence();
        dadsnokia.call(5304647589L);
        dadsnokia.setPrice(5304647589L);
        
        System.out.println(noonesGoogle);
        noonesGoogle.call(5304647589L);
        noonesGoogle.setPrice(5304647589L);

        System.out.println(mumsIphone);
        mumsIphone.faceTime("abd_yusuf@yahoo.com");
        mumsIphone.faceTime(5304647589L);

        mumsIphone.call(5304647589L);
        mumsIphone.setPrice(5304647589L);


        
        
    }
}
