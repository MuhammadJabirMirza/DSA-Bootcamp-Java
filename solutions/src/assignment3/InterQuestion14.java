package assignment3;
//14. Armstrong Number In Java
import  java.util.Scanner;
public class InterQuestion14 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int length =0;
        int rem;
        int sum=0;
        int num = scanner.nextInt();
        int originalNum=num;
        while(num>0){
            num= num/10;
            length= length+1;
        }
        num= originalNum;
        while(num>0){
            rem= num%10;
            int pow=1;
            for(int i=0; i<length; i++){
                pow= pow*rem;
            }
            sum=sum+pow;
            num=num/10;
        }
        if(originalNum==sum){
            System.out.println("It is armstrong number");
        }
        else{
            System.out.println("it is not an armstrong number");
        }

    }
}
