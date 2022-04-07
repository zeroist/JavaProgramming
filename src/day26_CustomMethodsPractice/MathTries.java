package day26_CustomMethodsPractice;
public class MathTries {
    public static void main(String[] args) {
        System.out.println(subtract(30.4,6.4));
        System.out.println(isEven(25));

    }
    //add two int numbers and returns a integer
    public static int addition(int num1,int num2){
        return num1+num2;
    }

    //add two double numbers and returns a double
    public static double addition(double num1,double num2){
        return num1+num2;
    }

    //subtract two int numbers and returns a integer
    public static int subtract(int num1,int num2){
        return num1-num2;
    }

    //add two double numbers and returns a double
    public static double subtract(double num1,double num2){
        return num1-num2;
    }
     // check if an integer is even number
    public static boolean isEven(int num){
        if(num%2==0) return true;else return false;
    }

    //return the maximum number between two integers
    public static int max(int num1,int num2){
        return num1>num2?num1:num2;
    }



}
