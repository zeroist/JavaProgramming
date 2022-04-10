package tasks.employeeTask;
public class ProductOwner extends Employee{
    public ProductOwner(String name,String companyName, int age, int id, char gender, double salary) {
        super(name, "PO", companyName, age, id, gender, salary);
    }
    @Override
    public void work() {
        System.out.println(jobTitle+" "+name+" having meeting with client");
    }
}
