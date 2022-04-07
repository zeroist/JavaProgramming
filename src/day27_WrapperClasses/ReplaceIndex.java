package day27_WrapperClasses;
import java.util.Arrays;
public class ReplaceIndex {
    public static void main(String[] args) {
       int[]arr = {10, 10, 20, 30, 40, 30, 30, 30};
       int[]newArray=replaceAll(arr,30,300);

        newArray=replaceAll(newArray,300,500);
        System.out.println(Arrays.toString(newArray));

    }
    /*
                       arr = {10, 10, 20, 30, 40, 30, 30, 30};

                   replaceAll(arr, 30, 300) ==> {10, 10, 20, 300, 40, 300, 300, 300}

     */
    public static int[] replaceAll(int[] arr, int oldElement, int newElement) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == oldElement) {
                arr[i] = newElement;
            }
        } return arr;
    }
}
