//return the first duplicated element from an arrayList of Integer
package tasks;
import java.util.ArrayList;
import java.util.Arrays;
public class ArrayList3 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(1, 2, 2, 3, 4, 4, 5, 6, 7, 7));
        while (true) {
            int search = numbers.get(0);
            numbers.remove(0);
            if (numbers.contains(search)) {
                System.out.println(search);
                break;
            }}}}
