//Dog Day33
package dog;
public class Dog {
    public String breed, color;
    public char gender, size;
    public int age;
    public static int numberOfLegs = 4;
    public static int numberOfEyes = 2;
    public static int numberOfWings = 0;
    public static boolean isFriendly = true;
    public Dog(String breed, String color, char gender, char size, int age) {
        this.breed = breed;
        this.color = color;
        this.gender = gender;
        this.size = size;
        this.age = age;
    }
    public void eat(String food) {
        System.out.println(color + " " + size + " size whose breed,gender and age are " + breed + ","
                + gender + "," + age + " is now eating " + food);
    }
    public void sleep() {
        System.out.println(color + " " + size + " size whose breed,gender and age are " + breed + ","
                + gender + "," + age + " is now sleeping ");
    }
    public void play(String playingWith) {
        System.out.println(color + " " + size + " size whose breed,gender and age are " + breed + ","
                + gender + "," + age + " is now playing with " + playingWith);
    }
    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                ", gender=" + gender +
                ", size=" + size +
                ", age=" + age +
                ", number Of Legs=" + numberOfLegs +
                ", number Of Eyes=" + numberOfEyes +
                ", number Of Wings=" + numberOfWings +
                ", isFriendly " + isFriendly +
                '}';
    }
}
class ObjectsOfDog {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Affenpinscher", "black", 'F', 'L', 3);
        Dog dog2 = new Dog("Akbash ", "white", 'M', 'S', 2);
        Dog dog3 = new Dog("Akita ", "yellow", 'M', 'M', 7);
        dog1.eat("meat");
        dog2.sleep();
        dog3.play("ball");
        System.out.println(dog1);}}

