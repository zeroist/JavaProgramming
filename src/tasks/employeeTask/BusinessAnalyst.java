package tasks.employeeTask;
public class BusinessAnalyst extends Employee{
    public BusinessAnalyst(String name,String companyName, int age, int id, char gender, double salary) {
        super(name, "BA", companyName, age, id, gender, salary);
    }
    @Override
    public void work() {
        System.out.println(jobTitle+" "+name+" is analysing the business needs");
    }
}
