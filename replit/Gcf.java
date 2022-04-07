
import java.util.Scanner;
public class Gcf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("write first number to calculate gcf and gcd: ");
        int a = input.nextInt();
        System.out.println("write second number to calculate gcf and gcd");
        int b = input.nextInt();
        System.out.println("GCF: " + findGcf(a, b));
        System.out.println("GCD: " + findGcd(a, b));
    }
    public static int findGcf(int a, int b) {//15 36
        int smaller = Math.min(a, b);
        int i = 0;
        for (i = smaller; i > 0; i--) { //from 18 to 0
            if (isRemainZero(a, i) && isRemainZero(b, i)) {
                return i;
            }
        }
                return 1;
    }
    public static boolean isRemainZero(int a, int b) {//36 5
        while (a >= b) {
            a -= b;
        }
        if (a == 0) return true;
        else return false;
    }//18 36
    public static int findGcd(int a, int b) { //18 36
        int bigger = 0;
        if (a > b) bigger = a;
        else bigger = b;//36
        int i = 0;
        for (i = bigger; i <= b * a; i++) {//from 36 to 36*18
            if (isRemainZero(i, a) && isRemainZero(i, b)) {
                break;
            }
        }
        return i;
    }
}
