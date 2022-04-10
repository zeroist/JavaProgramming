package tasks.animalTask2;
public class Animal {
    public String name,breed,size,color;
    public int age;
    public char gender;
    public Animal(String name, String breed, String size, String color,
                  int age, char gender) {
        this.name = name;
        this.breed = breed;
        this.size = size;
        this.color = color;
        this.age = age;
        this.gender = gender;
    }
    public void eat(){
    }
    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
