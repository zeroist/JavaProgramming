package day39_Recap.Animal;
public class FriendlyAnimal extends Animal {
    private static boolean isWild = false;
    private static boolean isFriendly = true;
    private static boolean isPlayable = true;
    public FriendlyAnimal(String name, String breed, String color, String size, char gender, int age) {
        super(name, breed, color, size, gender, age);
    }
    public void play(){
        System.out.println(getBreed()+" "+getName()+" is playing");
    }
    public void pet(){
        System.out.println(getBreed()+" "+getName()+" is petting");
    }
}
