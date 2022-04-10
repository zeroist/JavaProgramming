package day39_Recap.Animal;
public class Animal {
    private String name,breed,color,size;
    private char gender;
    private int age;
    public Animal(String name, String breed, String color, String size, char gender, int age) {
        setName(name);
        setBreed(breed);
        setColor(color);
        setSize(size);
        setGender(gender);
        setAge(age);
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        if(name.equals(null)|| name.isBlank()|| name.isEmpty()) {
            System.out.println("invalid name :"+ name); System.exit(1);
        }
        this.name = name;
    }
    public String getBreed() {
        return breed;
    }
    public void setBreed(String breed) {
        if(breed.equals(null)|| breed.isBlank()|| breed.isEmpty()) {
            System.out.println("invalid breed :"+ breed); System.exit(1);
        }
        this.breed = breed;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        if(color.equals(null)|| color.isBlank()|| color.isEmpty()) {
            System.out.println("invalid color :"+ color); System.exit(1);
        }
        this.color = color;
    }
    public String getSize() {
        return size;
    }
    public void setSize(String size) {
        this.size = size;
    }
    public char getGender() {
        return gender;
    }
    public void setGender(char gender) {
        if(!(gender=='M'||gender=='F')){
            System.out.println("invalid gender: "+ gender); System.exit(1);
        }
        this.gender = gender;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if(age<0){
            System.out.println("invalid age: "+ age); System.exit(1);
        }
        this.age = age;
    }
    public void eat(){
        System.out.println(breed+" "+name+" is eating");
    }
    public void drink(){
        System.out.println(breed+" "+name+" is drinking");
    }
    public void sleep(){
        System.out.println(breed+" "+name+" is sleeping");
    }
    public void move(){
        System.out.println(breed+" "+name+" is moving");
    }
    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
}
