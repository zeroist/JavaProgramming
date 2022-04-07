package tasks;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class Afdkjfl {
    public static void main(String[] args) {
        String str = "ABCD123$%#IB&456EFG";
        String []str2=str.split("");

        ArrayList<String>digits=new ArrayList<>(Arrays.asList(str2));
        ArrayList<String>letters=new ArrayList<>(Arrays.asList(str2));
        ArrayList<String>scs=new ArrayList<>(Arrays.asList(str2));

        digits.removeIf(p-> !Character.isDigit(p.charAt(0)));
        letters.removeIf(p-> !Character.isLetter(p.charAt(0)));
        scs.removeAll(letters);scs.removeAll(digits);
        System.out.println(letters);
        System.out.println(digits);
        System.out.println(scs);


    }

}
