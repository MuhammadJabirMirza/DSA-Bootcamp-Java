import java.util.Arrays;
import  java.util.Scanner;
public class main {
    public static void main(String[] args) {
        System.out.println("hello java");

        Scanner scanner = new Scanner(System.in);

      /*  int[] arr = new int[5];
        for(int in= 0; in<arr.length; in++){

            arr[in]= scanner.nextInt();
        }
        //System.out.print(Arrays.toString(arr));
        for (int j : arr){
            System.out.print(j +" ");
        }*/

        int[][] arr2d= new int[3][3];

        for(int row = 0; row < arr2d.length; row++){
            for(int col = 0; col<arr2d[row].length; col++){
                arr2d[row][col] = scanner.nextInt();
            }
        }
        /*for(int row = 0; row < arr2d.length; row++){
            for(int col=0; col <arr2d[row].length; col++){
                System.out.print(arr2d[row][col]+" ");
            }
            System.out.println();
        }*/
   /* for(int row =0; row< arr2d.length; row++){
        System.out.println(Arrays.toString(arr2d[row]));
    }*/
        for(int[] row : arr2d ){
            System.out.println(Arrays.toString(row));
        }
    }
}

