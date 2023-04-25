package Practice;

public class PracticeExercises {
    public static void main(String[] args) {
        int num = 785477527;
   /*     String a= String.valueOf(num);
        int count=0;
        for(int i = 0; i<=a.length()-1;i++){

            if(a.charAt(i)=='8'){
                count+=1;
            }
        }
        System.out.println("total 7 found are "+count);*/
   /* int count=0;
    for(int i= num; i>=num; i--){
        int rem = num % 10;
        if(rem == 7){
            count +=1;
        }
        num = num/10;
    }
        System.out.println(count);*/
     int count = 0;
        int ans=0;
     while(num>0){
         int rem = num%10;
         num = num/10;
         ans = ans *10 +rem;
     }
        System.out.println(ans);
     

    }
}
