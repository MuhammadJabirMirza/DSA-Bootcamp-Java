package assignment3;
//24. Sum Of A Digits Of Number
public class InterQuestion24 {
    public static void main(String[] args) {
        int num = 12345;
        int sum=0;
        int rem;
        while(num!=0){
            rem = num%10;
            sum= sum+rem;
            num=num/10;
        }
        System.out.println(sum);
    }
}
