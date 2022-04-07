package restaurantTask;
import java.util.ArrayList;
import java.util.Arrays;
public class Restaurant {
    private String owner,location;
    private int numberOfStars;
    private ArrayList<Server> servers;
    private ArrayList<Chef>chefs;
    public Restaurant(String owner, String location, int numberOfStars, ArrayList<Server> servers, ArrayList<Chef> chefs) {
        setOwner(owner);
        setLocation(location);
        setNumberOfStars(numberOfStars);
        setServers(servers);
        setChefs(chefs);
    }
    public String getOwner() {
        return owner;
    }
    public void setOwner(String owner) {
        this.owner = owner;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public int getNumberOfStars() {
        return numberOfStars;
    }
    public void setNumberOfStars(int numberOfStars) {
        this.numberOfStars = numberOfStars;
    }
    public ArrayList<Server> getServers() {
        return servers;
    }
    public void setServers(ArrayList<Server> servers) {
        this.servers = servers;
    }
    public ArrayList<Chef> getChefs() {
        return chefs;
    }
    public void setChefs(ArrayList<Chef> chefs) {
        this.chefs = chefs;
    }
    public void hireServer(Server server){
        servers.add(server);
    }
    public void hireServer(Server[]serversArray){
        servers.addAll(Arrays.asList(serversArray));
    }
    public void hireChef(Chef chef){
        chefs.add(chef);
    }
    public void hireChef(Chef[]chefsArray){
        chefs.addAll(Arrays.asList(chefsArray));
    }
    public void terminateServer(int employeeId){
        servers.removeIf(p-> p.getEmployeeId()==employeeId);
    }
    public void terminateChef(int employeeId){
        chefs.removeIf(p-> p.getEmployeeId()==employeeId);
    }

    public String toString() {
        return "Restaurant{" +
                "owner='" + owner + '\'' +
                ", location='" + location + '\'' +
                ", numberOfStars=" + numberOfStars +
                ", servers=" + servers.size() +
                ", chefs=" + chefs.size() +
                '}';
    }
}
