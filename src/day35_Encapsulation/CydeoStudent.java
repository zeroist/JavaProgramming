package day35_Encapsulation;
public class CydeoStudent {
    public String name;
    public char gender;
    public int age;
    public int batchNumber;
    public int groupNumber;
    public static String schoolName;
    public String fieldOfStudy;
    public static String programminLanguuage;
    public CydeoStudent(String name, char gender, int age, int batchNumber, int groupNumber, String fieldOfStudy) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
        this.fieldOfStudy = fieldOfStudy;
    }

    static {
        schoolName="CYDEO";
        programminLanguuage="JAVA";


    }
}
