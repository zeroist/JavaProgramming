package employeeTask;
public class EmployeeObjects {
    public static void main(String[] args) {
        Developer developer1 = new Developer();
        developer1.setInfo("yusuf", "java D", 'M', 43, 890, 120000);
        Driver driver1 = new Driver();
        driver1.setInfo("mesut", "Senier driver", 'M', 43, 73, 220000);
        Teacher teacher1 = new Teacher();
        teacher1.setInfo("John", "Chemistry Teacher", 'M', 785, 890, 30000);
        Tester tester1 = new Tester();
        tester1.setInfo("Jesica", "sdet", 'F', 30, 78, 100000);
        developer1.coding();
        developer1.work();
        teacher1.work();
        teacher1.teaching();
        driver1.work();
        driver1.driving();
        tester1.work();
        tester1.testing();
        System.out.println(developer1);
        System.out.println(teacher1);
        System.out.println(driver1);
        System.out.println(tester1);
    }
}
