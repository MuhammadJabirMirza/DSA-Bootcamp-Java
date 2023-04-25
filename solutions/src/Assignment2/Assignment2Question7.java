package Assignment2;//7. To calculate Fibonacci Series up to n numbers.
import  java.util.Scanner;
public class Assignment2Question7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int num1=0;
        int num2=1;
        int num;
        System.out.println(num1);
        System.out.println(num2);
        for(int i=1; i<n; i++){
            num = num1+num2;
            num1= num2;
            num2= num;
            System.out.println(num);
        }

    }
}
