package S3_Arrays.Medium;

import java.util.HashMap;

public class P1_TwoSum {
    public static void main(String[] args) {
        int [] nums = {1, 6, 2, 10, 3};

        int target = 7;

        int [] res = twoSum(nums,target);

        for(int i:res){
            System.out.print(i+" ");
        }

    }

    public static int[] twoSum(int[] nums, int target) {
        // brute force
        /*
        int [] res = new int [2];

        for(int i=0;i<nums.length-1;i++ ){

            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    res[0]=i;
                    res[1]=j;
                    break;
                }
            }
        }

        return res;
        */

        // optimal

        HashMap<Integer, Integer> map = new HashMap<>();

        int [] res = new int [2];
        map.put(nums[0],0);
        for(int i=1;i<nums.length;i++){
            int req = target-nums[i];

            if(map.containsKey(req)){
                res[0]= map.get(req);
                res[1]= i;
                break;
            }

            else{
                map.put(nums[i],i);
            }
        }
        return res;
    }
}
