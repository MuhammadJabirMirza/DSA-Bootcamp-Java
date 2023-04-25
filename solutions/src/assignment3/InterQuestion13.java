package assignment3;
//13. Sum Of N Numbers

import java.util.Scanner;
public class InterQuestion13 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num= scanner.nextInt();
        int sum=0;
        int i =num;
        while(i>=0){
        //    int n= scanner.nextInt();
            sum = sum+num;
            num = num-1;
            i--;
        }
        System.out.println(sum);
    }

}
