package itCompany;
import java.util.ArrayList;
import java.util.Arrays;
public class ScrumTeam {
    private String PO, BA, SM;
    private int daysOfSprint;
    private ArrayList<Tester> testersList = new ArrayList<>();
    private ArrayList<Developer> devopsList = new ArrayList<>();
    public ScrumTeam(String PO, String BA, String SM, int daysOfSprint, ArrayList<Tester> testersList, ArrayList<Developer> devopsList) {
        setPO(PO);
        setBA(BA);
        setSM(SM);
        setDaysOfSprint(daysOfSprint);
        setTestersList(testersList);
        setDevopsList(devopsList);
    }
    public String getPO() {
        return PO;
    }
    public void setPO(String PO) {
        this.PO = PO;
    }
    public ArrayList<Tester> getTestersList() {
        return testersList;
    }
    public void setTestersList(ArrayList<Tester> testersList) {
        this.testersList = testersList;
    }
    public ArrayList<Developer> getDevopsList() {
        return devopsList;
    }
    public void setDevopsList(ArrayList<Developer> devopsList) {
        this.devopsList = devopsList;
    }
    public String getBA() {
        return BA;
    }
    public void setBA(String BA) {
        this.BA = BA;
    }
    public String getSM() {
        return SM;
    }
    public void setSM(String SM) {
        this.SM = SM;
    }
    public int getDaysOfSprint() {
        return daysOfSprint;
    }
    public void setDaysOfSprint(int daysOfSprint) {
        this.daysOfSprint = daysOfSprint;
    }

    public ArrayList<Tester> addTester(Tester tester){
        testersList.add(tester);
        return testersList;
    }
    public ArrayList<Tester>addTesters(Tester[] testers){
        testersList.addAll(Arrays.asList(testers));
        return testersList;
    }

    public ArrayList<Developer> addDeveloper(Developer developer){
        devopsList.add(developer);
        return devopsList;
    }
    public ArrayList<Developer>addDevelopers(Developer[] developers){
        devopsList.addAll(Arrays.asList(developers));
        return devopsList;
    }
    public ArrayList<Tester>removeTester(long employeeId){
        testersList.removeIf(p-> p.getEmployeeId()==employeeId);
        return testersList;
    }
    public ArrayList<Developer>removeDeveloper(long employeeId){
        devopsList.removeIf(p-> p.getEmployeeId()==employeeId);
        return devopsList;
    }
    public String toString() {
        return "ScrumTeam{" +
                "PO='" + PO + '\'' +
                ", BA='" + BA + '\'' +
                ", SM='" + SM + '\'' +
                ", daysOfSprint=" + daysOfSprint +
                ", number of Testers=" + testersList.size() +
                ", number of developers=" + devopsList.size() +
                '}';
    }
}

