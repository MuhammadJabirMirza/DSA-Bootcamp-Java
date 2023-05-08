package assignment3;

public class InterQuestion20 {
    public static void main(String[] args) {
        int num1 =20, num2=24;
        int lcm=1;
        int factor1=0;
        int factor2=0;
        int i=1;

        while (num1 >0 || num2>0){
            factor1 = num1%i;
            factor2= num2%i;
            if(factor1==0 || factor2==0){
                lcm= lcm*i;
            }
            num1= num1/i;
            num2=num2/i;

            i++;
        }
        System.out.println(lcm);
    }
}
