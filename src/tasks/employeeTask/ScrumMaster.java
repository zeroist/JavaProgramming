package tasks.employeeTask;
public class ScrumMaster extends Employee {
    public ScrumMaster(String name, String companyName, int age, int id, char gender, double salary) {
        super(name, "SM", companyName, age, id, gender, salary);
    }
    @Override
    public void work() {
        System.out.println(jobTitle+" "+name+" is facilitating the meeting ");
    }
}
