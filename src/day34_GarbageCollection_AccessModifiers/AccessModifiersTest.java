package day34_GarbageCollection_AccessModifiers;
import static day34_GarbageCollection_AccessModifiers.AccessModifiers.method1;
import static day34_GarbageCollection_AccessModifiers.AccessModifiers.method2;
public class AccessModifiersTest {
    public static  void main(String[] args) {
        System.out.println(AccessModifiers.publicData);
        System.out.println(AccessModifiers.defaultData);
        //System.out.println(AccessModifiers.privateDate);

        method1();
        method2();


        //AccessModifiers.method3();
    }
}
