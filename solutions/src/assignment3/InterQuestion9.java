package assignment3;
//9. Calculate Batting Average

import java.util.Scanner;
public class InterQuestion9 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int matches= scanner.nextInt();
        int totalScore=0;
        for(int i = 1; i<=matches; i++){
            int score = scanner.nextInt();
            totalScore= totalScore+score;
        }
        int average = totalScore/matches;
        System.out.println(average);
    }
}
