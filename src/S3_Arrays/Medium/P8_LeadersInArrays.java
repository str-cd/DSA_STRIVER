package S3_Arrays.Medium;

import java.util.ArrayList;
import java.util.List;

public class P8_LeadersInArrays {
    public static void main(String[] args) {
        int [] nums = {1, 2, 5, 3, 1, 2};

        List<Integer> res = leaders(nums);

        for (int i:res){
            System.out.print(i+" ");
        }

    }

    public static List<Integer> leaders(int[] nums) {
        List<Integer> li = new ArrayList<>();

        int max =nums[nums.length-1];

        li.add(max);

        for (int i=nums.length-2;i>=0;i--){

            if(nums[i]>max){
                li.addFirst(nums[i]);
                max = nums[i];
            }

        }

        return li;
    }
}
