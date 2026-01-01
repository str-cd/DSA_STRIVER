package Arrays.Easy;

import java.util.HashSet;

public class P4_RemoveDuplicates {
    public static void main(String[] args) {
        int [] arr = {0, 0, 3, 3, 5, 6};
        int n = removeDuplicates(arr);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }

    private static int removeDuplicates(int[] nums) {

       //brute force

       /* HashSet<Integer> set = new HashSet<>();

        for(int i:nums){
            set.add(i);
        }

        int i =0;

        for(int v:set){
            nums[i++]=v;
        }

        return set.size();
        */

        //optimal solution

        int l=0;

        for(int r = 1;r<nums.length;r++){
            if(nums[r]!=nums[l]){
                nums[l+1]=nums[r];
                l++;
            }

        }

        return l+1;
    }
}
