package tasks;
import java.util.ArrayList;
import java.util.Arrays;
public class Array1 {
    public static void main(String[] args) {
        ArrayList<Integer>numbers=new ArrayList<>();
        numbers.addAll(Arrays.asList(1,2,3,4,5));
        int a=0;
        for (Integer each : numbers) {
            if(each%2==1) {
                numbers.set(a,each*2);
            }
            a++;
        }
        System.out.println(numbers);
    }


}
