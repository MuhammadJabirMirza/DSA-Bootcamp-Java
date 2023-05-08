package assignment5;

import java.util.Arrays;

public class QuestionsRandom {
    public static void main(String[] args) {
        int[] arr = {2,5,6,1,4,9,99,100};
      // reverse(arr);
       //swap(arr, 0, 5);
        System.out.println(Arrays.toString(arr));
        /*minimum(arr);
        max(arr);*/
        sorted(arr);
    }
    static void swap(int[] arr, int start, int finish){

        int temp= arr[start];
        arr[start]= arr[finish];
        arr[finish]= temp;
            }
    static void reverse(int[] arr){

        int end= arr.length-1;
        for(int i = 0; i<end; i++){
            swap(arr, i, end);
            end--;
        }
    }
    static void max(int[] arr) {
        int maxN = arr[0];
        int temp=0;
        for (int i = 1; i < arr.length; i++) {
            if(maxN>arr[i]){
                temp= maxN;
            }
            else{
                temp =arr[i];
            }

        }
        System.out.println(temp+" is greatest number");
    }
    static void minimum(int[] arr){
        int min= arr[0];
        int temp=0;
        for(int element : arr){
            if(min<element){
                temp = min;
            }
            else{
                temp = element;
            }
        }
        System.out.println(temp + " is minimum");
    }
    static void sorted(int[] arr){
        for(int i=1; i <arr.length; i++){
            if(arr[0]>arr[i]){
                break;
            }
        }
        System.out.println("array is not sorted");



    }
}
