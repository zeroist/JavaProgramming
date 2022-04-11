package day39_Recap.Animal;
public class Dolphin extends FriendlyAnimal {
    public Dolphin(String name, String breed, String color, String size, char gender, int age) {
        super(name, breed, color, size, gender, age);
    }
    public void swim(){
        System.out.println(getBreed()+" "+getName()+" is swimming");
    }
}
