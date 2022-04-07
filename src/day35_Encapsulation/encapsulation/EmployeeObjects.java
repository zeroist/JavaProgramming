package day35_Encapsulation.encapsulation;
public class EmployeeObjects {
    public static void main(String[] args) {
        Employee employee1=new Employee("m",'M',19,10);
        System.out.println(employee1.getName());
        System.out.println(employee1.getGender());
        System.out.println(employee1.getAge());
        System.out.println(employee1.getSalary());
        System.out.println(employee1);
        employee1.setGender('F');

    }


}
