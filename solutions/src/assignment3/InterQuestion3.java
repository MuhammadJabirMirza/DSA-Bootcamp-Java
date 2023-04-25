package assignment3;
import java.util.Scanner;
//3. Calculate Average Of N Numbers
public class InterQuestion3 {
    public static void main(String[] args) {
        System.out.println("enter number calculate the average");
        Scanner scanner= new Scanner(System.in);
        int totalNum= scanner.nextInt();
        int count;
        double sumOfNum= 0;
        double average;
        for(count=1; count<=totalNum; count++){
            double num= scanner.nextDouble();
            sumOfNum= sumOfNum+num;
        }

        average= sumOfNum/totalNum;
        System.out.println(average);
    }
}
