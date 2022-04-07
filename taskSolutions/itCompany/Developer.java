package itCompany;
public class Developer {
    private String name,jobTitle;
    private long employeeId;
    private double salary;
    public Developer(String name, String jobTitle, long employeeId, double salary) {
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
        return jobTitle;
    }
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
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
    public void coding(){
        System.out.println(name+ "is coding");
    }
    public void unitTesting(){
        System.out.println(name+ "is unit Testing");
    }
    public void fixingBug(){
        System.out.println(name+ "is fixing bug");
    }
    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", employeeId=" + employeeId +
                ", salary=" + salary +
                '}';
    }
}
