import java.util.*;

public class Assignment2Question1 {

    //Write a program to print whether a number is even or odd, also take
//input from the user.
    public static void main(String[] args) {
        System.out.println("finding if the number is even or odd");
        System.out.println("enter the number please");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println("the number you entered was "+ number );
        if (number % 2 == 1){
            System.out.println(number+" is odd");
        }
        else{
            System.out.println(number+ " is even");
        }

    }
}

