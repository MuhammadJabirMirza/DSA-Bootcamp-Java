package assignment3;
/*25. Kunal is allowed to go out with his friends only on the even days of a given month.
 Write a program to count the number of days he can go out in the month of August.*/
public class InterQuestion25 {
    public static void main(String[] args) {
        System.out.println("Number of days in August are 31");

        int days= 31;
        int sum=0;
        int even;

        for(int i =1; i<days; i++){
            even = i%2;
            if(even==0) {
                sum = sum + 1;
            }
        }
        System.out.println("kunal can go out for "+sum+ " days");
    }
}
