package S3_Arrays.Medium;

import java.util.Arrays;

public class P3_MajorityElements {

    public static void main(String[] args) {
        int [] nums = {7, 0, 0, 1, 7, 7, 2, 7, 7};

        System.out.println(majorityElement(nums));
    }

    public static int majorityElement(int[] nums) {
        // brute force
        /*
        for(int i=0;i<nums.length;i++){
            int count =0;

            for(int j=0;j<nums.length;j++){
                if(nums[j]==nums[i]){
                    count++;
                }
            }

            if(count>nums.length/2){
                return nums[i];
            }
        }
        return 0;

         */

        // better solution
        /*


        Arrays.sort(nums);

        return nums[nums.length/2];
         */

        // optimal solution
        int ele =0;
        int cnt =0;

        for(int i:nums){
            if(cnt==0){
                ele=i;
                cnt++;
            }
            else{

                if(i==ele){
                    cnt++;
                }
                else{
                    cnt--;
                }

            }
        }

        return ele;

    }

}
