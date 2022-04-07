package day29_ArrayList;
import utilities.StringUtility;

import java.util.ArrayList;
import java.util.Arrays;
public class RemoveIfMethod {
    public static void main(String[] args) {
       ArrayList<String>names=new ArrayList<>(Arrays.asList("Anna", "Racecar", "Level", "Eve", "Java", "Python", "Cydeo"));
       names.removeIf(p-> StringUtility.isPalindrome(p));
        System.out.println(names);
    }
}
