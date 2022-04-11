package day39_Recap.Animal;
public class Cat extends FriendlyAnimal {
    public Cat(String name, String breed, String color, String size, char gender, int age) {
        super(name, breed, color, size, gender, age);
    }
    public void scratch(){
        System.out.println(getBreed()+" "+getName()+" is scratching");

    }
    public void meow(){
        System.out.println(getBreed()+" "+getName()+" is meowing");

    }
}
