//Write a program that can find the minimum number from an ArrayList of integers
package tasks;
import java.util.ArrayList;
import java.util.Arrays;
public class ArrayList12 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(1, 2, 3, 4, 5));
        int min = numbers.get(0);
        for (Integer each : numbers) {
            if (each < min) min = each;
        }
        System.out.println(min);
    }
}
