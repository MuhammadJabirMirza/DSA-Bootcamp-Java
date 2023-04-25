package assignment3;
import java.util.Scanner;
import java.lang.Math;
//5. Calculate Distance Between Two Points
public class InterQuestion5 {
    public static void main(String[] args) {
        System.out.println("Enter coordinates to find the distance");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter X1 coordinate");
        int x1 = scanner.nextInt();
        System.out.println("Enter X2 coordinate");
        int x2= scanner.nextInt();
        System.out.println("Enter y1 coordinate");
        int y1= scanner.nextInt();
        System.out.println("Enter Y2 coordinate");
        int y2= scanner.nextInt();
        double distance = Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));
        System.out.println("The Distance is " + distance);

    }
}
