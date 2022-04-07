package replit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
class Main {
    public static void main(String[] args) {
        ArrayList<Integer>names=new ArrayList<>(Arrays.asList(10,10,65,65,10,32,24,10));
        Collections.replaceAll(names,10,100);

        System.out.println(Collections.frequency(names,100));

    }

}