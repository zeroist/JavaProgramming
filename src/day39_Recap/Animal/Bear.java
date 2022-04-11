package day39_Recap.Animal;
public class Bear extends WildAnimal{
    public Bear(String name, String breed, String color, String size, char gender, int age) {
        super(name, breed, color, size, gender, age);
    }
    @Override
    public void hunt() {
        System.out.println(getBreed()+" "+getName()+" is hunting with a strike of its forepaw");

    }
}
