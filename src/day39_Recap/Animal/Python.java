package day39_Recap.Animal;
public class Python extends WildAnimal {
    public Python(String name, String breed, String color, String size, char gender, int age) {
        super(name, breed, color, size, gender, age);
    }
    @Override
    public void hunt() {
        System.out.println(getBreed()+" "+getName()+" is hunting with using both sight and smell to locate prey");
    }
}
