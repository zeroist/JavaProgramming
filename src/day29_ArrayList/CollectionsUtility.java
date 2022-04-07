package day29_ArrayList;
import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class CollectionsUtility {
    public static void main(String[] args) {
       ArrayList<Character>list2=new ArrayList<>(Arrays.asList('A','B','C','D','E'));
       Collections.reverse(list2);
        System.out.println(list2);


    }
}
