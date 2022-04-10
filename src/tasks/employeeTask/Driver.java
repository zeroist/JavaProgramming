package tasks.employeeTask;
public class Driver extends Employee{
    public Driver(String name,  String companyName, int age, int id, char gender, double salary) {
        super(name, "Driver", companyName, age, id, gender, salary);
    }
    @Override
    public void work() {
        System.out.println(jobTitle+" "+name+" is driving company car");
    }
}
