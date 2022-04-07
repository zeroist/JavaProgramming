package day27_WrapperClasses;
import utilities.ArraysUtility;

import java.util.Arrays;
public class RemoveDuplicates2 {
    public static void main(String[] args) {
        int[]arr={62,57,1,1,2,3,3,3,4,57,60,60,62,62,100,100,500,500};//1 2 3 4 57
        int []last1=removeDublicates2(arr);
        int []last2=removeDublicates2(arr);
        System.out.println(Arrays.toString(last1));
        System.out.println(Arrays.toString(last2));

    }
    public static int[] removeDublicates(int[] arr) { // {57,1,1,2,3,3,3,4,57}  ----> 1,2,3
        int[] result = {};
        for (int i = 0; i < arr.length; i++) {
            int[] forsearch = Arrays.copyOfRange(arr, i+1, arr.length);
            if (!ArraysUtility.contains(forsearch, arr[i])) {
                result = ArraysUtility.addElement(result, arr[i]);
            }
        } return result;
    }
    public static int[] removeDublicates2(int[]arr){ //{57,1,1,2,3,3,3,4,57}  ----> 1,2,3
        int[]result={};
        for (int each : arr) {

            if(!ArraysUtility.contains(result,each)){
                result=ArraysUtility.addElement(result,each);
            }
        }return result;




    }
}
