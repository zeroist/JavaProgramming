package tasks.employeeTask;
public class Employee {
    public String name,jobTitle,companyName;
    public int age,id;
    public char gender;
    public double salary;
    public Employee(String name, String jobTitle, String companyName,
                    int age, int id, char gender, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.companyName = companyName;
        this.age = age;
        this.id = id;
        this.gender = gender;
        this.salary = salary;
    }
    public void work(){

    }
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", companyName='" + companyName + '\'' +
                ", age=" + age +
                ", id=" + id +
                ", gender=" + gender +
                ", salary=" + salary +
                '}';
    }
}
