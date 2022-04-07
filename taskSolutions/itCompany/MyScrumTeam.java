package itCompany;
import java.util.ArrayList;
class MyScrumTeam {
    public static void main(String[] args) {
        ArrayList<Tester> testersList=new ArrayList<>();
        Tester tester1 = new Tester("Yusuf", "SDET", 34, 30000);
        Tester tester2 = new Tester("BURAK", "QA", 123, 60000);
        Tester tester3 = new Tester("MESUT", "Senior QA", 568, 90000);
        Tester[]testersArray={tester2,tester3};


        ArrayList<Developer>devopsList=new ArrayList<>();
        Developer developer1=new Developer("John","Junier Java D.",485,60000);
        Developer developer2=new Developer("Jesica","Senior Java D.",23,90000);
        Developer developer3=new Developer("Ayşe","C# developer",89,100000);
        Developer[]developersArray={developer2,developer3};

        ScrumTeam myScrumTeam=new ScrumTeam("Muhtar","Asiya","Kuzat",14,testersList,devopsList);
        myScrumTeam.addTester(tester1);
        myScrumTeam.addTesters(testersArray);
        myScrumTeam.addDeveloper(developer1);
        myScrumTeam.addDevelopers(developersArray);
        myScrumTeam.removeDeveloper(23);
        myScrumTeam.removeTester(34);
        System.out.println(myScrumTeam);

    }

}