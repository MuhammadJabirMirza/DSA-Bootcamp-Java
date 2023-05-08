package assignment3;
//19. HCF Of Two Numbers Program
public class InterQuestion19 {
    public static void main(String[] args) {
        int num1 = 100, num2 =50;
        int hcf=1;
        int factor1=0;
        int factor2=0;
        int i=1;
        while(num1>0 || num2 >0){
            factor1= num1%i;
            factor2=num2%i;
            if(factor1 ==0 && factor2==0){
                hcf= hcf*i;
            }
            num1=num1/i;
            num2=num2/i;
            i++;
        }
        System.out.println(hcf);

    }
        }
