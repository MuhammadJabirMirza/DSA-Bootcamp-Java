package assignment3;
//25. Take integer inputs till the user enters 0 and print the largest number from all.
import java.util.Scanner;
public class Question25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       int gn =0;
        int num;
        while(true){
            num = scanner.nextInt();
            if(num ==0){
                break;
            }
            else if(num>gn){
                gn=num;
            }
        }
        System.out.println(gn);
    }
}
