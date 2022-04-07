package day37_Inheritance.scrumTask;
public class BusinessAnalayst extends Employee{
    public BusinessAnalayst(String name, int age, char gender, int id, double salary, String companyName) {
        super(name, age, gender, "Business Analyst", id, salary, companyName);
    }
    public void analyze(){
        System.out.println(name+" is analysing documents");
    }
}
