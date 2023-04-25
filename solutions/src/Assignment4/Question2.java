package Assignment4;
//Define a program to find out whether a given number is even or odd.
import java.util.Scanner;
public class Question2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num= scanner.nextInt();
        odd(num);
    }
public static void odd(int num){
        if(num%2==0){
            System.out.println("it is an even number");
        }
        else{
            System.out.println("it is an odd number");
        }
}


}
