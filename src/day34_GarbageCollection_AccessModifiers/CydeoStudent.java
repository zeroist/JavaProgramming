package day34_GarbageCollection_AccessModifiers;
public class CydeoStudent {
    public String studentName;
    public static String schoolName;

    public CydeoStudent(String studentName){
        this.studentName=studentName;

    }
    static {
        schoolName="Cydeo";
    }
}
class CydeoStudentObjects{
    public static void main(String[] args) {
        CydeoStudent student1=new CydeoStudent("ali");
        CydeoStudent student2=new CydeoStudent("veli");
        System.out.println(CydeoStudent.schoolName);
        System.out.println(CydeoStudent.schoolName );
    }
}
