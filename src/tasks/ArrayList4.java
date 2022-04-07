// count the total numbers of grade A, B, C, D and F
package tasks;
import java.util.ArrayList;
import java.util.Arrays;
public class ArrayList4 {
    public static void main(String[] args) {
        ArrayList<Integer> scores = new ArrayList<>();
        scores.addAll(Arrays.asList(100, 90, 75, 85, 65, 85, 55, 45, 73, 73, 35, 47));
        ArrayList<Integer> gradeOfA = new ArrayList<>(); // 90 ~ 100
        ArrayList<Integer> gradeOfB = new ArrayList<>(); // 80 ~ 89
        ArrayList<Integer> gradeOfC = new ArrayList<>(); // 70 ~ 79
        ArrayList<Integer> gradeOfD = new ArrayList<>(); // 60 ~ 69
        ArrayList<Integer> gradeOfF = new ArrayList<>(); // 0 ~ 59
        for (Integer each : scores) {
            if (each >= 90) gradeOfA.add(each);
            else if (each >= 80) gradeOfB.add(each);
            else if (each >= 70) gradeOfC.add(each);
            else if (each >= 60) gradeOfD.add(each);
            else
                gradeOfF.add(each);
        }
        System.out.println("Total numbers of A= " + gradeOfA.size() + "\n" +
                "Total numbers of B= " + gradeOfB.size() + "\n" +
                "Total numbers of C= " + gradeOfC.size() + "\n" +
                "Total numbers of D= " + gradeOfD.size() + "\n" +
                "Total numbers of F= " + gradeOfF.size() + "\n");}}
