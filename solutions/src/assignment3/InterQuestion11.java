package assignment3;
//11. Compound Interest Java Program
import java.lang.Math;
public class InterQuestion11 {
    public static void main(String[] args) {

        System.out.println("Calculating Compound interest");
        double principalAmount= 1000;
        double interestRate= 0.05;
        int time =5;
        double compoundInterest=0;
        for(int i=1; i<=time; i++ ) {
           compoundInterest = principalAmount + (principalAmount * interestRate);
           principalAmount= compoundInterest;
        }
        System.out.println(compoundInterest);

    }

}
