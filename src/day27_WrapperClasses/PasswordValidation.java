package day27_WrapperClasses;
import java.util.Calendar;
import java.util.Scanner;
public class PasswordValidation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine(); //abc74!
        if (str.length() >= 8 && !str.contains(" ") && lowerCaseCount(str) > 0 && upperCaseCount(str) > 0 && scCount(str) > 0 && digitCount(str) > 0) {
            System.out.println(str + " is strong password");
        } else {
            System.out.println(str + " is weak password");
        }
        if (str.length() < 8) {
            System.out.println("it has less then 8 char. plese make it longer then 8");
        }
        if (str.contains(" ")) {
            System.out.println("it should not have space char. try again");
        }
        if (lowerCaseCount(str) < 1) {
            System.out.println("it should have at least one lowercase");
        }
        if (upperCaseCount(str) < 1) {
            System.out.println("it should have at least one uppercase");
        }
        if (scCount(str) < 1) {
            System.out.println("it should have at least one special char.");
        }
        if (digitCount(str) < 1) {
            System.out.println("it should have at least one digit.");
        }

        /*

PasswordValidation:
    Write a program that can verify if a password is a strong password. Characteristics of strong passwords are:
                1. Password MUST be at least have 8 characters long, and should not contain space
                2. PassWord should at least contain one upper case letter
                3. PassWord should at least contain one lower case letter
                4. Password should at least contain one special characters
                5. Password should at least contain a digit
         */
    }
    public static int lowerCaseCount(String str) {
        int count = 0;
        for (char each : str.toCharArray()) {
            if (Character.isLowerCase(each)) {
                count++;
            }
        }
        return count;
    }
    public static int upperCaseCount(String str) {
        int count = 0;
        for (char each : str.toCharArray()) {
            if (Character.isUpperCase(each)) {
                count++;
            }
        }
        return count;
    }
    public static int scCount(String str) {
        int count = 0;
        for (char each : str.toCharArray()) {
            if (!Character.isLetterOrDigit(each)) {
                count++;
            }
        }
        return count;
    }
    public static int digitCount(String str) {
        int count = 0;
        for (char each : str.toCharArray()) {
            if (Character.isDigit(each)) {
                count++;
            }
        }
        return count;
    }
}
