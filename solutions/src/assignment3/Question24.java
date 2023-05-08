package assignment3;
//24. Take integer inputs till the user enters 0 and print the sum of all numbers
//(HINT: while loop)
import java.util.Scanner;
public class Question24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        int sum =0;

        while(true){
            num= scanner.nextInt();
            if (num==0){
                break;
            }
            else{sum= sum+num;}

        }
        System.out.println(sum);
    }
}
