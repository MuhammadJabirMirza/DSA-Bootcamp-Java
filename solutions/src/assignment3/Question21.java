package assignment3;
//21. Fibonacci Series In Java Programs
import java.util.Scanner;
public class Question21 {
    public static void main(String[] args) {
        int num1= 0;
        int num2=1;
        Scanner scanner= new Scanner(System.in);
        System.out.println("enter the number ");

        int num = scanner.nextInt();
        System.out.print(num1+" ");
        System.out.print(num2+" ");
        int sum =0;
        for(int i=1; i<num; i++){

            sum = num1+num2;
            num1= num2;
            num2=sum;
            System.out.print(sum+" ");


        }
    }
}
