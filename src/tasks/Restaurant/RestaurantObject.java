package tasks.Restaurant;
import java.util.ArrayList;
import java.util.Arrays;
public class RestaurantObject {
    public static void main(String[] args) {
        Restaurant restaurant1 = new Restaurant("Joseph", "İzmir", 5);
        Server server1 = new Server("Ali Garson", 39, 45, true);
        Server server2 = new Server("can şef", 89, 25, false);
        Server server3 = new Server("yusuf", 93, 40, true);
        Chef chef1 = new Chef("Kemal şef", 12, 30, false);
        Chef chef2 = new Chef("rahime", 43, 45, true);
        Chef chef3 = new Chef("musab", 76, 40, true);
        Server[] serversList = {server2, server3};
        Chef[] chefsList = {chef2, chef3};
        restaurant1.hireServer(server1);
        restaurant1.hireChef(chef1);
        restaurant1.hireServer(serversList);
        restaurant1.hireChef(chefsList);
        System.out.println(restaurant1);
    }
}
