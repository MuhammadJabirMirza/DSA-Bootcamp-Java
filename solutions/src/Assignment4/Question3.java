package Assignment4;
//A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote.
import java.util.Scanner;
public class Question3 {

    public static int eligible(int age){
        if(age>=18){
            System.out.println("Your are eligible to vote");
        }
        else {
            System.out.println("you are not eligible to vote");
        }

        return age;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter age");
        int age = scanner.nextInt();
        eligible(age);
    }
}
