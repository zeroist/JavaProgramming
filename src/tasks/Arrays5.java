package tasks;
import java.util.ArrayList;
public class Arrays5 {
    public static void main(String[] args) {
        String str = "ABCD123$%#IB&456EFG";
        char [] str2=str.toCharArray();
        ArrayList<Character>digits=new ArrayList<>();
        ArrayList<Character>letters=new ArrayList<>();
        ArrayList<Character>scs=new ArrayList<>();
        for (char each : str2) {
            if(Character.isDigit(each)){
                digits.add(each);
            }else if(Character.isLetter(each)){
                letters.add(each);
            }else{
                scs.add(each);
            }


        }
        System.out.println(letters);
        System.out.println(digits);
        System.out.println(scs);








    }
}
