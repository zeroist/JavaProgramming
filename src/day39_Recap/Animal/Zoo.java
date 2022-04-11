package day39_Recap.Animal;
public class Zoo {
    public static void main(String[] args) {
        Bear bear=new Bear("bear1","bearbreed1","white","big",'M',12);
        Cat cat=new Cat("cat1","catBreed1","white","small",'F',4);
        Crocodile crocodile=new Crocodile("crocodile1","crocodileBreed1","Black","big",'F',13);
        Dog dog=new Dog("dog1","dogBreed1","Grey","medium",'M',14);
        Dolphin dolphin=new Dolphin("dolphin","dolphinBreed1","white","large",'F',18);
        Eagle eagle=new Eagle("eagle","eagleBreed1","yellow","small",'M',2);
        Lion lion=new Lion("lion","lionBreed1","Black","middle",'M',4);
        Parrot parrot=new Parrot("parrot","parrotBreed1","yellow","small",'M',7);
        Python python=new Python("phthon","pythonBrees1","black","big",'M',24);
        Tiger tiger=new Tiger("tiger","tigerBreed1", "white","big",'M',9);
        System.out.println(bear);
        System.out.println(cat);
        System.out.println(crocodile);
        System.out.println(dog);
        System.out.println(dolphin);
        System.out.println(eagle);
        System.out.println(lion);
        System.out.println(parrot);
        System.out.println(python);
        System.out.println(tiger);
        eagle.hunt();
        eagle.eat();
        eagle.drink();
        parrot.fly();
        parrot.pet();
        dolphin.swim();
        dolphin.drink();
        tiger.hunt();
        dolphin.setAge(-12);
    }
}
