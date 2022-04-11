package day39_Recap.Animal;
public class Tiger extends WildAnimal {
    public Tiger(String name, String breed, String color, String size, char gender, int age) {
        super(name, breed, color, size, gender, age);
    }
    @Override
    public void hunt() {
        System.out.println(getBreed()+" "+getName()+" is hunting by sense of sight and hearing rather than on smell ");
    }
}
