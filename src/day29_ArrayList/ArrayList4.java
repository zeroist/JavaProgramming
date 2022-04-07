package day29_ArrayList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class ArrayList4 {
    public static void main(String[] args) {
        String str = "ABCD123$%#IB&456EFG";
        String [] str2=str.split("");
        ArrayList<Character>digits=new ArrayList<>();
        ArrayList<Character>letters=new ArrayList<>();
        ArrayList<Character>scs=new ArrayList<>();

        for (String each : str2) {
            if(Character.isDigit(each.charAt(0))){
                    digits.add(each.charAt(0));
            }else if(Character.isLetter(each.charAt(0))){
                letters.add(each.charAt(0));
            }else {
                scs.add(each.charAt(0));
            }
        }
        System.out.println(letters);
        System.out.println(digits);
        System.out.println(scs);


    }
}