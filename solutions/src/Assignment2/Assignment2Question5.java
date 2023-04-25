package Assignment2;//5. Take 2 numbers as input and print the largest number.
import java.util.Scanner;
public class Assignment2Question5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number 1 ");
        int num1 = scanner.nextInt();

        System.out.println("Enter number 2");
        int num2 = scanner.nextInt();

        if(num1>num2){
            System.out.println(num1 + " is Greater");
        }
        else{
            System.out.println(num2 +" is Greater");
        }
    }
}
