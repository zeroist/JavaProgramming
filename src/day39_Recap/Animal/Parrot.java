package day39_Recap.Animal;
public class Parrot extends FriendlyAnimal{
    public Parrot(String name, String breed, String color, String size, char gender, int age) {
        super(name, breed, color, size, gender, age);
    }
    public void fly(){
        System.out.println(getBreed()+" "+getName()+" is flying");
    }
    public void sing(){
        System.out.println(getBreed()+" "+getName()+" is singing");
    }
}
