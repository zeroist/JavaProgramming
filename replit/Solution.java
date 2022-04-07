import java.util.*;
import java.io.*;
class Solution {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int n = 0, a = 0, b = 0;
        for (int i = 0; i < t; i++) {
            a = in.nextInt();
            b = in.nextInt();
            n = in.nextInt();

        in.close();
        }
        int sum = a;
        for (int i = 0; i < n; i++) {
            sum+=exp(i)*b;
            System.out.print(sum+" ");
        }
    }

    public static int exp(int a){
        int result=1;
        for (int i = 0; i < a; i++) {
            result*=2;
        }
        return result;
    }
}