package itCompany;
public class Tester {
    private String name, JobTitle;
    private long employeeId;
    private double salary;
    public Tester(String name, String jobTitle, long employeeId, double salary) {
        setName(name);
        setJobTitle(jobTitle);
        setEmployeeId(employeeId);
        setSalary(salary);
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getJobTitle() {
        return JobTitle;
    }
    public void setJobTitle(String jobTitle) {
        JobTitle = jobTitle;
    }
    public long getEmployeeId() {
        return employeeId;
    }
    public void setEmployeeId(long employeeId) {
        if(employeeId<=0) return;
        this.employeeId = employeeId;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        if(salary<0) return;
        this.salary = salary;
    }
    public void smokeTesting(){
        System.out.println(name+" is smoke Testing");
    }public void creatingTicket(){
        System.out.println(name+" is creating Ticket");
    }
    public void dailyStandUp(){
        System.out.println(name+" is having dailyStandUp");
    }

    public String toString() {
        return "itCompany.Tester{" +
                "name='" + name + '\'' +
                ", JobTitle='" + JobTitle + '\'' +
                ", employeeId=" + employeeId +
                ", salary=" + salary +
                '}';
    }
}
