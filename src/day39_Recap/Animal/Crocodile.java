package day39_Recap.Animal;
public class Crocodile extends WildAnimal{
    public Crocodile(String name, String breed, String color, String size, char gender, int age) {
        super(name, breed, color, size, gender, age);
    }
    @Override
    public void hunt() {
        System.out.println(getBreed()+" "+getName()+" is hunting by stealthily stalking their prey from water");

    }
}
