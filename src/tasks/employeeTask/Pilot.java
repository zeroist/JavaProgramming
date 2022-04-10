package tasks.employeeTask;
public class Pilot extends Employee{
    public Pilot(String name, String jobTitle, String companyName, int age, int id, char gender, double salary) {
        super(name, jobTitle, companyName, age, id, gender, salary);
    }
    @Override
    public void work() {
        System.out.println(jobTitle+" "+name+" does not know what to do in an it company");
    }
}
