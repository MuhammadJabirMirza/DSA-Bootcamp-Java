package assignment3;
/*
Write a program to print the
sum of negative numbers,
sum of positive even numbers
and the sum of positive odd numbers
from a list of numbers (N) entered by the user.
The list terminates when the user enters a zero.*/
import java.util.Scanner;
public class InterQuestion26 {
    public static void main(String[] args) {
        System.out.println("Enter the numbers");
        Scanner scanner= new Scanner(System.in);
        int sumOfNeg=0, sumOfPos=0, sumOfEven=0, sumOfOdd=0;
        while(true){
            int num= scanner.nextInt();
            if(num==0){
                break;
            }
            if(num<0){
                sumOfNeg=sumOfNeg+num;
            }
            else if(num>0){
                if(num%2!=0){
                    sumOfOdd=sumOfOdd+num;
                } else if (num%2==0) {
                    sumOfEven=sumOfEven+num;
                }
                sumOfPos=sumOfPos+num;
            }
        }
        System.out.println("sum of postive "+ sumOfPos);
        System.out.println("sum of odd " +sumOfOdd);
        System.out.println("sum of even "+ sumOfEven);
        System.out.println("sum of negative "+sumOfNeg);
    }
}
