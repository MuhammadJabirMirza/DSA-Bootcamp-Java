package assignment3;
//17. Find if a number is palindrome or not
public class InterQuestion17 {
    public static void main(String[] args) {
        int num = 454;
        int oNum= num;
        int rem;
        int palindrome=0;
        while (num!=0){
            rem = num%10;
            num = num/10;
            palindrome= palindrome*10+rem;
        }
        if(oNum==palindrome){
            System.out.println("it is palindrome num");
        }
        else{
            System.out.println("it is not palindrome num");
        }
    }
}
