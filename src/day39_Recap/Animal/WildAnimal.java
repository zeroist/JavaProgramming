package day39_Recap.Animal;
public class WildAnimal extends Animal {
    public static boolean isWild = true;
    public static boolean isFriendly = false;
    public static boolean isPlayable = false;
    public WildAnimal(String name, String breed, String color, String size, char gender, int age) {
        super(name, breed, color, size, gender, age);
    }
    public void hunt(){
        System.out.println(getBreed()+" "+getName()+" is hunting");
    }
    @Override
    public String toString() {
        return super.toString().substring(0, super.toString().length() - 1) + ", isWild= " + isWild
                + ", isFriendly= " + isFriendly
                + ", isPlayable= " + isPlayable + "}";
    }
}
