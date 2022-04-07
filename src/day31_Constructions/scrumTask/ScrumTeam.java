package day31_Constructions.scrumTask;
import java.util.ArrayList;
import java.util.Arrays;
public class ScrumTeam {
    public String PO,BA,SM;
    public ArrayList<Tester> testerslist=new ArrayList<>();
    public ArrayList<Developer>devopsList=new ArrayList<>();
    public int daysOfSprint;
    public ScrumTeam(String PO, String BA, String SM, int daysOfSprint) {
        this.PO = PO;
        this.BA = BA;
        this.SM = SM;
        this.daysOfSprint = daysOfSprint;
    }
    public void addTester(Tester tester){
        testerslist.add(tester);
    }
    public void addTesters(Tester[]testers){
        testerslist.addAll(Arrays.asList(testers));
    }
    public void addDeveloper(Developer developer){
        devopsList.add(developer);
    }
    public void addDevelopers(Developer[]developers){
        devopsList.addAll(Arrays.asList(developers));
    }
    public void removeTester(int employeeID){
        testerslist.removeIf(p-> p.employeeID==employeeID);
    }
    public void removeDeveloper(int employeeID){
        devopsList.removeIf(p-> p.employeeID==employeeID );
    }
    public String toString() {
        return "itCompany.Tester{" +
                "PO='" + PO + '\'' +
                ", BA='" + BA + '\'' +
                ", SM='" + SM + '\'' +
                ", total number of testers=" + testerslist.size() +
                ", total number of developers=" + devopsList.size() +
                ", daysOfSprint=" + daysOfSprint +
                '}';
    }
}
