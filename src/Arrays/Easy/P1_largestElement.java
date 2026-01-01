package Arrays.Easy;

import java.util.Arrays;

public class P1_largestElement {
    public static void main(String[] args) {
        int [] arr = {-4, -3, 0, 1, -1};
        System.out.println(largestElement(arr));

    }

    public static int largestElement(int[] nums) {
        // Brute Force
        //Arrays.sort(nums);
        //return nums[nums.length-1];

        //optimal Solution
        int max = Integer.MIN_VALUE;

        for(int i:nums){
            if(i>max){
                max=i;
            }
        }

        return max;

    }
}
