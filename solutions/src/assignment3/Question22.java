package assignment3;
/*Subtract the Product and Sum of Digits of an Integer*/
public class Question22 {
    public static void main(String[] args) {
        int n =234;
        int product=1;
        int num =0;
        int sum=0;
        while(n!=0){
            num=n%10;
            product= product*num;
            sum= sum+num;
            n=n/10;
        }

        System.out.println(product-sum);
    }
}
