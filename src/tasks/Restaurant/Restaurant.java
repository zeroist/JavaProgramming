package tasks.Restaurant;
import java.util.ArrayList;
import java.util.Arrays;
public class Restaurant {
    public String owner,location;
    public int numberOfStars;
    public ArrayList<Server>serverList=new ArrayList<>();
    public ArrayList<Chef>chefsList=new ArrayList<>();
    public Restaurant(String owner, String location, int numberOfStars) {
        this.owner = owner;
        this.location = location;
        this.numberOfStars = numberOfStars;
    }
    public void hireServer(Server server){
        serverList.add(server);
    }
    public void hireServer(Server[]servers){
        serverList.addAll(Arrays.asList(servers));
    }
    public void hireChef(Chef chef){
        chefsList.add(chef);
    }
    public void hireChef(Chef[] chefs){
        chefsList.addAll(Arrays.asList(chefs));
    }
    public void terminateChef(int employeeID){
        chefsList.removeIf(p-> p.employeeID==employeeID);
    }
    public void terminateServer(int employeeID ){
        serverList.removeIf(p-> p.employeeID==employeeID);
    }
    public String toString() {
        return "Restaurant{" +
                "owner='" + owner + '\'' +
                ", location='" + location + '\'' +
                ", numberOfStars=" + numberOfStars +
                ", serverList=" + serverList.size() +
                ", chefsList=" + chefsList.size() +
                '}';
    }
}
