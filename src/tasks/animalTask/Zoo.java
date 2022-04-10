package tasks.animalTask;
public class Zoo {
    public static void main(String[] args) {
        Dog dog = new Dog("Husky", "unknown", "middle", "white", 2, 'F');
        Cat cat = new Cat("Çakır", "Turkish", "small", "black", 3, 'M');
        Eagle eagle = new Eagle("Falan", "Filan", "big", "grey", 8, 'M');
        Tiger tiger = new Tiger("NewTiger", "OldFashion", "Large", "Black", 8, 'M');
        dog.eat();
        cat.eat();
        eagle.eat();
        tiger.eat();
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(eagle);
        System.out.println(tiger);
    }
}
