package day34_GarbageCollection_AccessModifiers;
public class StaticBlock {
    public static void main(String[] args) {
        System.out.println("main method");
    }

    static{
        System.out.println("static method");//runs before anything, and only one time.
    }
}
