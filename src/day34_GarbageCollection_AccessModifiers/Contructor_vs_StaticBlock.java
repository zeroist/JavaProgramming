package day34_GarbageCollection_AccessModifiers;
public class Contructor_vs_StaticBlock {
    static {
        System.out.println("Static Block");
    }
    public Contructor_vs_StaticBlock(){
        System.out.println("Constructor");
    }
    public static void main(String[] args) {
        new Contructor_vs_StaticBlock();
        new Contructor_vs_StaticBlock();
        System.out.println("Main method");
    }
}
