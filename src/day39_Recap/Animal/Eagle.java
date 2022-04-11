package day39_Recap.Animal;
public class Eagle extends WildAnimal {
    public Eagle(String name, String breed, String color, String size, char gender, int age) {
        super(name, breed, color, size, gender, age);
    }
    @Override
    public void hunt() {
        System.out.println(getBreed()+" "+getName()+" is hunting with his talons");
    }
}
