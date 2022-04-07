package day37_Inheritance.AnimalTask;
public class AnimalObjects {
    public static void main(String[] args) {
        Dog dog1=new Dog("Jonny","Hussky",'F',5,"small","black");
        System.out.println(dog1);
        Cat cat1=new Cat("Kamil","canim",'F',3,"big","white");
        System.out.println(cat1);
        Parrot parrot1=new Parrot("Parrot","bilmem",'M',4,"small","black");
        System.out.println(parrot1);
        dog1.bark();
        cat1.scratch();
        cat1.drink();
        parrot1.sing();
        parrot1.move();




    }
}
