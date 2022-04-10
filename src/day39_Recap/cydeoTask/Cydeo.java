package day39_Recap.cydeoTask;
public class Cydeo {
    public static void main(String[] args) {
        Developer developer=new Developer("yusuf",43,'M',235,"Java Developer",120000);
        Tester tester=new Tester("mesut",40,'M',45,"QA",45000);
        Teacher teacher=new Teacher("Asia",34,'F',123,"chemistry Teacher",90000);
        Student student=new Student("yunus",12,'M',789,"hayvanlar alemi");
        System.out.println(developer);
        System.out.println(tester);
        System.out.println(teacher);
        System.out.println(student);
        developer.fixingBug();
        developer.work();
        tester.createTicket();
        student.study();
        teacher.work();
        developer.eat();
        tester.sleep();

    }

}
