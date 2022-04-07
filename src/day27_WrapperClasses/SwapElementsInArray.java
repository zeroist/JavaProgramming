package day27_WrapperClasses;
import java.util.Arrays;
public class SwapElementsInArray {
    public static int[] swapElements(int[] array, int index1, int index2) {
        int[] result = Arrays.copyOf(array, array.length);
        result[index1] = array[index2];
        result[index2] = array[index1];
        return result;
    }
    public static double[] swapElements(double[] array, int index1, int index2) {
        double[] result = Arrays.copyOf(array, array.length);
        result[index1] = array[index2];
        result[index2] = array[index1];
        return result;
    }
    public static char[] swapElements(char[] array, int index1, int index2) {
        char[] result = Arrays.copyOf(array, array.length);
        result[index1] = array[index2];
        result[index2] = array[index1];
        return result;
    }
    public static String[] swapElements(String[] array, int index1, int index2) {
        String[] result = Arrays.copyOf(array, array.length);
        result[index1] = array[index2];
        result[index2] = array[index1];
        return result;
    }
}

