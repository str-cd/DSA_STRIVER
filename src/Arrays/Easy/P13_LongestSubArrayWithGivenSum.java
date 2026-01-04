package Arrays.Easy;

import java.util.HashMap;

public class P13_LongestSubArrayWithGivenSum {
    public static void main(String[] args) {
        int [] arr ={10, 5, 2, 7, 1, 9};
        int k= 15;

        System.out.println(longestSubarray(arr,k));
    }

    public static int longestSubarray(int[] nums, int k) {
        //bruteforce
        /*
        int maxLength=0;
        for(int i=0;i<nums.length;i++){
            int sum=0;
            for(int j=i;j<nums.length;j++){
                sum+=nums[j];
                if(sum==k){
                    maxLength=Math.max(maxLength,((j-i+1)));
                }
            }
        }
        return maxLength;

         */

        //optimal

        HashMap<Integer, Integer> map = new HashMap<>();

        int prefixSum = 0;
        int maxLen = 0;

        // Base case: prefix sum 0 at index -1
        map.put(0, -1);

        for (int i = 0; i < nums.length; i++) {
            prefixSum += nums[i];

            int req = prefixSum - k;

            if (map.containsKey(req)) {
                maxLen = Math.max(maxLen, i - map.get(req));
            }

            // Store first occurrence only
            map.putIfAbsent(prefixSum, i);
        }

        return maxLen;

    }
}
