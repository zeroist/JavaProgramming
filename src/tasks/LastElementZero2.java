package tasks;
import java.util.ArrayList;
import java.util.Arrays;
public class LastElementZero2 {
    public static void main(String[] args) {
        ArrayList<Integer>numbers=new ArrayList<>();
        numbers.addAll(Arrays.asList(1,2,3,4,5));



    }
    public static ArrayList LastElementZero(ArrayList<Integer>numbers){
        numbers.set(numbers.size()-1,0);
        return numbers;

    }
}

