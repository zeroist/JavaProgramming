import java.util.ArrayList;
public class AsalSAyılar {
    public static void main(String[] args) {
      int a=100;
      ArrayList<Integer>asallar=new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            if(isAsal(i)) asallar.add(i);

        }
        System.out.println(asallar);
    }
    public static boolean isAsal(int a){
        int s=2;
        int k=2;
        while(a%s!=0 && a>s){
           s++;
        }
        if (a==s) return true;else return false;

    }
}
