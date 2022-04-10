package tasks.employeeTask;
public class Developer extends Employee{
    public Developer(String name, String jobTitle, String companyName, int age, int id, char gender, double salary) {
        super(name, jobTitle, companyName, age, id, gender, salary);
    }
    @Override
    public void work() {
        System.out.println(jobTitle+" "+name+" is developing ");
    }

}
