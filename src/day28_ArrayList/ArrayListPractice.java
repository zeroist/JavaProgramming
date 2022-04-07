package day28_ArrayList;
import java.util.ArrayList;
public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<String> employees=new ArrayList<>();
        employees.add("0ali");employees.add("1rfsdef");employees.add("2dfds");employees.add("3gsdfg");employees.add("4fgsd");
        employees.add("5hgds");employees.add("67hfd");employees.add("7hfdgdh");
        employees.remove(0);
        System.out.println(employees);
        employees.remove(0);
        System.out.println(employees);
        employees.remove(0);
        System.out.println(employees);
        employees.remove(0);
        System.out.println(employees);
        employees.remove(1);
        System.out.println(employees);
        employees.remove(employees.size()-1);
        System.out.println(employees);
        employees.remove("67hfdtrj");
        System.out.println(employees);


    }
}
/*
{1,2,3,4,5,6}

{2,4,6,8,10,12}
 */