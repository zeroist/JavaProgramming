package day37_Inheritance.scrumTask;
public class AmazonInc {
    public static void main(String[] args) {
        String company="Amazon Inc";
        ProductOwner po=new ProductOwner("Shuaib",29,'M',1,160000,company);
        BusinessAnalayst ba=new BusinessAnalayst("Cihad",30,'M',2,150000,company);
        ScrumMaster sm=new ScrumMaster("Anel",26,'F',3,145000,company);
        Tester tester1=new Tester("ali",34,'M',"Qa",1,90000,company);
        Tester tester2=new Tester("vali",34,'M',"Qa",2,90000,company);
        Tester tester3=new Tester("cali",34,'M',"Qa",3,90000,company);
        Tester tester4=new Tester("bhali",34,'M',"Qa",4,90000,company);
        Tester[]testers={tester1,tester2,tester3,tester4};

        Developer developer1=new Developer("kamil",45,'F',"java",5,6666,company);

        ScrumTeam scrumTeam=new ScrumTeam(po,ba,sm);
        scrumTeam.addDeveloper(developer1);
        scrumTeam.addTesters(testers);
        System.out.println(scrumTeam);
        for (Tester tester : scrumTeam.testers) {
            System.out.println(tester.name+" "+tester.salary);
        }
    }
}
