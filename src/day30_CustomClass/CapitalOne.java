package day30_CustomClass;
import java.util.ArrayList;
import java.util.Collections;
public class CapitalOne {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        Employee employee3 = new Employee();
        Employee employee4 = new Employee();
        Employee employee5 = new Employee();
        employee1.setInfo("John", 'M', 25, 2237, "Developer", 100000, true);
        employee2.setInfo("Anna", 'F', 28, 2287, "QA", 85000, true);
        employee3.setInfo("David", 'M', 35, 2256, "QA", 45000, false);
        employee4.setInfo("Lina", 'F', 45, 2290, "Manager", 80000, true);
        employee5.setInfo("Kevin", 'M', 35, 2298, "Senior QA", 110000, true);
        Employee[] employees = {employee1, employee2, employee3, employee4, employee5};
        int countFullTime = 0;
        int countPartTime = 0;
        for (Employee employee : employees) {
            if (employee.isFullTime) countFullTime++;
            else countPartTime++;
        }
        System.out.println("countPartTime = " + countPartTime);
        System.out.println("countFullTime = " + countFullTime);
        ArrayList<Double>salaries=new ArrayList<>();
        for (Employee employee : employees) {
            salaries.add(employee.salary);
        }

        Double max= Collections.max(salaries);
        Double min= Collections.min(salaries);
        System.out.println("min = " + min);
        System.out.println("max = " + max);




    }




}
