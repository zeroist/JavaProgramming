package day27_WrapperClasses;
public class PasswordValidation2 {
    public static void main(String[] args) {
        String password = "Cyhhgfggfhf2-";
        boolean isPowerfull = false;
        int upper = 0,lower = 0,digit = 0,sc = 0;
        if (password.length() >= 8 && !password.contains(" ")) {
            for (int i = 0; i < password.length(); i++) {
                if (Character.isLowerCase(password.charAt(i))) lower++;
                else if (Character.isUpperCase(password.charAt(i))) upper++;
                else if (Character.isDigit(password.charAt(i))) digit++;
                else sc++;
                if (lower > 0 && upper > 0 && sc > 0 && digit > 0) {isPowerfull = true;break;}
            }
        }
        System.out.println("isPowerfull = " + isPowerfull);
    }
}
