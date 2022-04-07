package restaurantTask;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
public class UrfaKebabSalonu {
    public static void main(String[] args) {
        ArrayList<Server> Garsonlar=new ArrayList<>();
        ArrayList<Chef> Şefler=new ArrayList<>();
        Restaurant ufraKebabSalonu=new Restaurant("Yusuf","İzmir",5,Garsonlar,Şefler);

        Server mahmut=new Server("mahmut",89,20,true);
        Server ali=new Server("ali",34,30,false);
        Server ayşe=new Server("ayşe",399,40,true);
        Server[] serversFromUrfa={ali,ayşe};
        ufraKebabSalonu.hireServer(mahmut);
        ufraKebabSalonu.hireServer(serversFromUrfa);
        System.out.println(ufraKebabSalonu);
        Chef muhtar=new Chef("muhtar",89,80,true);
        Chef asiya=new Chef("asiya",445,90,false);
        Chef kuzat=new Chef("kuzat",330,120,true);
        ufraKebabSalonu.hireChef(muhtar);
        Chef[] chefFromUsa={asiya,kuzat};
        ufraKebabSalonu.hireChef(chefFromUsa);
        System.out.println(ufraKebabSalonu);
        ufraKebabSalonu.terminateChef(89);
        System.out.println(ufraKebabSalonu);
        ufraKebabSalonu.terminateServer(399);
        System.out.println(ufraKebabSalonu);



    }

}
