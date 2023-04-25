package Assignment4;
//Write a program to print the sum of two numbers entered by user by defining your own method.
public class Question4 {
    public static void main(String[] args) {
        int Sum = sum(5,10);
        System.out.println(Sum);
    }
    public static int sum(int num1, int num2){


        System.out.println("The sum of two numbers is ");
        return num1+num2;
    }
}
