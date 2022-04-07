package day27_WrapperClasses;
public class IsUpEqualLow {
    public static void main(String[] args) {
        System.out.println(isUpEqualLow("JAVAK javam"));
    }
    public static boolean isUpEqualLow(String text){
        int up=0;int low=0;
        for (char each : text.toCharArray()) {
            if(Character.isUpperCase(each)){
                up++;
            }
            if(Character.isLowerCase(each)){
                low++;
            }

        }
        if (up==low) return true; else return false;

    }
}
