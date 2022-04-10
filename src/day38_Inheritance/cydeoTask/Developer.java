package day38_Inheritance.cydeoTask;
public class Developer extends Employee {
    public Developer(String name, int age, char gender, int employeeId, String jobTitle, double salary) {
        super(name, age, gender, employeeId, jobTitle, salary);
    }
    public void fixingBug(){
        System.out.println(getJobTitle()+" "+getName()+" is fixing bugs");
    }
    @Override
    public void work() {
        System.out.println(getJobTitle()+" "+getName()+" is developing");
    }

}
