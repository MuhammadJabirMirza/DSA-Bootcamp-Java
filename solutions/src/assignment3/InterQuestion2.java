package assignment3;
//2. Calculate Electricity Bill
import java.util.Scanner;
public class InterQuestion2 {
    /* different rates according to units
    first 100 units = 10rs
    from 100-300 = 15
    300 onwards = 25
    data required is number of units consumed

     */

    public static void main(String[] args) {
        System.out.println("enter the number of units consumed");
        Scanner scanner = new Scanner(System.in);
        int unit = scanner.nextInt();
        int bill = 0;
        int remainingUnits;

        if(unit>=300){
            remainingUnits=unit-300;
            bill = (100*10)+ (199*15)+(remainingUnits*25);
            System.out.println(bill);
        }
        else if((unit > 200) & (unit < 300)){
            remainingUnits=unit-100;
            bill = (100*10)+ (remainingUnits*15);
            System.out.println(bill);
        }
        else{
            bill=unit*10 ;
            System.out.println(bill);
        }

    }
}
