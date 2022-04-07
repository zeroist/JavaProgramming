package person;
public class Person {
    public String name;
    public int age;
    public char gender;
    public static boolean isHuman = true;
    public static boolean hasNose = true;
    public static boolean hasWings = false;
    public static int numberOfHead = 1;
    public static int numberOfEyes = 2;
    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    public void eat(String food) {
        System.out.println(name + " is eating " + food);
    }
    public void drink(String thing) {
        System.out.println(name + " is drinking " + thing);
    }
    public void sleep() {
        System.out.println(name + " is sleeping.Please no not disturb");
    }
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender + " " + "\n" +
                name + " has " + numberOfHead + " head and also has " + numberOfEyes + " eyes " +
                '}';
    }
}
class ObjectOfPerson {
    public static void main(String[] args) {
        Person person1 = new Person("Yusuf", 43, 'M');
        person1.eat("apple");
        person1.drink("water");
        person1.sleep();
        System.out.println(person1);
    }
}
