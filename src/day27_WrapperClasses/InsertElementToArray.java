package day27_WrapperClasses;
import utilities.ArraysUtility;

import java.util.Arrays;
public class InsertElementToArray {
    public static void main(String[] args) {
        double[] array = {10, 20.5, 30, 40, 50};
        System.out.println(Arrays.toString(insertElement(array, 5, 500)));
        ;
    }
    public static int[] insertElement(int[] array, int index, int element) {
        int[] result = {};
        int k = 0;
        for (int i = 0; i < array.length + 1; i++) {
            if (i == index) {
                result = ArraysUtility.addElement(result, element);
                continue;
            }
            result = ArraysUtility.addElement(result, array[k]);
            k++;
        }
        return result;
    }
    public static double[] insertElement(double[] array, int index, double element) {
        double[] result = {};
        int k = 0;
        for (int i = 0; i < array.length + 1; i++) {
            if (i == index) {
                result = ArraysUtility.addElement(result, element);
                continue;
            }
            result = ArraysUtility.addElement(result, array[k]);
            k++;
        }
        return result;
    }
}
/*
Ex:
					arr = {10, 20, 30, 40, 50};

					insert(arr, 2, 100) ==> {10, 20, 100, 30, 40, 50}
 */
