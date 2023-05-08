package assignment5;

import java.util.Arrays;

public class Question3 {
    public static void main(String[] args) {
        int[] nums = {2,4,5,1};
        for(int i = 1; i<nums.length; i++){
        nums[i]= nums[i]+ nums[i-1];

        }
        System.out.println(Arrays.toString(nums));
    }
}
