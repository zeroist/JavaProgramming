package cydeoStudent;
import static cydeoStudent.CydeoStudent.printProgLanguage;
public class CydeoStudent {
    public String name, batchNumber;
    public int age, id, groupNumber;
    public char gender,grade;
    public static String schoolName = "Cydeo";
    public static String programmingLanguage = "Java";
    public CydeoStudent(String name, String batchNumber, int age, int id, int groupNumber, char gender,char grade) {
        this.name = name;
        this.batchNumber = batchNumber;
        this.age = age;
        this.id = id;
        this.groupNumber = groupNumber;
        this.gender = gender;
        this.grade=grade;
    }
    public void study() {
        System.out.println(name + " whose batchNumber is " + batchNumber + ", is now studying " + programmingLanguage);
    }
    public void attendClass() {
        System.out.println(name + " was attended class");
    }
    public static void printSchoolName() {
        System.out.println("Our school name is :" + schoolName);
    }
    public static void printProgLanguage() {
        System.out.println("We are learning " + programmingLanguage + " in " + schoolName);
    }
    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", batchNumber='" + batchNumber + '\'' +
                ", age=" + age +
                ", id=" + id +
                ", groupNumber=" + groupNumber +
                ", gender=" + gender +
                ", grade=" + grade +
                '}';
    }
}
class ObjectOfStudents {
    public static void main(String[] args) {
        CydeoStudent student1 = new CydeoStudent("Yusuf", "EU8", 43, 23, 8, 'M','A');
        student1.study();
        student1.attendClass();
        CydeoStudent.printSchoolName();
        printProgLanguage();
        System.out.println(student1);
    }
}
