package Assignment2;

import java.util.Scanner;
//4. Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
public class Assignment2Question4 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter first number ");
        double num1 = scanner.nextDouble();
        System.out.println("Enter second number");
        double num2 = scanner.nextDouble();
        System.out.println("Enter +, _, *, / to perform the arithmetic operation");
        char sym = scanner.next().charAt(0);

        if(sym=='+'){
            double sum = num1+num2;
            System.out.println("Answer is " + sum);
        }
        else if(sym=='-'){
            double sum = num1-num2;
            System.out.println("Answer is " + sum);
        }
        else if(sym=='*'){
            double result = num1*num2;
            System.out.println("Answer is " + result);
        }
        else if (sym=='/'){
            double result = num1/num2;
            System.out.println("Answer is " + result);
        }
        else {
            System.out.println("Enter correct arithmetic operator");
        }




    }
}
