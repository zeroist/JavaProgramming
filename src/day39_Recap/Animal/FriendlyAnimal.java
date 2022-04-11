package day39_Recap.Animal;
public class FriendlyAnimal extends Animal {
    public static boolean isWild = false;
    public static boolean isFriendly = true;
    public static boolean isPlayable = true;
    public FriendlyAnimal(String name, String breed, String color, String size, char gender, int age) {
        super(name, breed, color, size, gender, age);
    }
    public void play() {
        System.out.println(getBreed() + " " + getName() + " is playing");
    }
    public void pet() {
        System.out.println(getBreed() + " " + getName() + " is petting");
    }
    @Override
    public String toString() {
        return super.toString().substring(0, super.toString().length() - 1) + ", isWild= " + isWild
                + ", isFriendly= " + isFriendly
                + ", isPlayable= " + isPlayable + "}";
    }

}

