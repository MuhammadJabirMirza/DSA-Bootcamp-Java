package assignment3;
//4. Calculate Discount Of Product

import java.util.Scanner;
public class InterQuestion4 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
      /*  System.out.println("Enter the price of product");

        double product= scanner.nextDouble();

        System.out.println("Enter the amount of discount");
        double discount= scanner.nextDouble();
        discount= discount/100;
        double discountedPrice=product-(product*discount);
        if (discount == 0.1) {
            System.out.println("The total discounted price is " + discountedPrice);
        } else if (discount == 0.15) {
            System.out.println("The total discounted price is " + discountedPrice);
        } else {
            System.out.println("Enter the correct value");
        }*/

        // using switch cases now

        System.out.println("enter the name of the product");
        String product = scanner.nextLine();
        double price, discount, discountedPrice;

        switch (product){

            case "apple"->{
                System.out.println("The discount on apple is 10% ");
                price = 500;
                discount= 0.1;
                discountedPrice= price-(price*discount);
                System.out.println("the discounted price of apple is "+discountedPrice);
            }
            case "orange"->{
                System.out.println("The discount on orrange is 20% ");
                price = 600;
                discount= 0.2;
                discountedPrice= price-(price*discount);
                System.out.println("the discounted price of apple is "+discountedPrice);
            }
            default -> System.out.println("enter correct item name");
        }

    }
}
