//8. To find out whether the given String is Palindrome or not.
import java.util.Scanner;
public class Assignment2Question8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter word to check if its palindrome or not");
        String word = scanner.next();
        String rev="";

        for(int i =word.length() - 1; i>=0; i-- ){
            rev = rev+word.charAt(i);
        }
        if(word.equals(rev)){
            System.out.println("string is palindrome");
        }
        else{
            System.out.println("it is not palindrome");
        }
    }


}
