package Assignment4;

//Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.

public class Question1 {
    public static void main(String[] args) {
    max(70,40,60);
    min(40,60,50);
    }
    public static void max(int num1, int num2, int num3){
        if(num1 >num2 & num1>num3){
            System.out.println(num1+ " is greater than " + num2+" & " +num3);
        }
        else if(num2 >num1 & num2>num3){
            System.out.println(num2+ " is greater than " + num1+" & " +num3);
        }
        else{
            System.out.println(num3+ " is greater than " + num1+" & " +num2);
        }

    }
    public static void min(int num1, int num2, int num3){
        if(num1 <num2 & num1<num3){
            System.out.println(num1+ " is smaller than " + num2+" & " +num3);
        }
        else if(num2 <num1 & num2<num3){
            System.out.println(num2+ " is smaller than " + num1+" & " +num3);
        }
        else{
            System.out.println(num3+ " is smaller than " + num1+" & " +num2);
        }
    }

}
