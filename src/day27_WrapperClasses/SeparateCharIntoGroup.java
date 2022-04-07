package day27_WrapperClasses;
public class SeparateCharIntoGroup {
    public static void main(String[] args) {
        System.out.println(separateChar("ali gel 12 de @okul == a.oldo"));
    }
    public static String separateChar(String str) {
        String letters = "";
        String digits = "";
        String sc = "";
        for (char eachChar : str.toCharArray()) {
            if (Character.isDigit(eachChar)) {
                digits += eachChar;
            } else if (Character.isLetter(eachChar)) {
                letters += eachChar;
            } else {
                if (eachChar == ' ') continue;
                sc += eachChar;
            }
        }
        return letters + "\n" + digits + "\n" + sc;
    }
}
