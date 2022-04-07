package day26_CustomMethodsPractice;
import utilities.ArraysUtility;

import java.util.Arrays;
public class MergeTwoArrays2 {
    public static void main(String[] args) {
        int[] nums={60,2,2,3,4,5,60};
        nums= removeDuplicateFromArray(nums);
        System.out.println(Arrays.toString(nums));
        int a=nums.length;
        String ali="ali gel";
        int b=ali.length();
    }
    public static int[] removeDuplicateFromArray(int[] numbers){
        for (int i = 0; i < numbers.length; i++) {
            if(ArraysUtility.frequencyOfElement(numbers,numbers[i])!=1){
                numbers=ArraysUtility.removeElement(numbers,i);
            }
        }
        return numbers;



    }



}
